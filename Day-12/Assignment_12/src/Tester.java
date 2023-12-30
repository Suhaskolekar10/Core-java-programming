import java.io.*;
import java.nio.*;
import java.util.*;

class Account implements Serializable{
	private int account_no;
	private String name;
	private double balance;
	
	
	public Account(int account_no, String name, double balance) {
		this.account_no = account_no;
		this.name = name;
		this.balance = balance;
	}

	public String toString() {
		return "Account [account_no=" + account_no + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	public void deposite(double amount) {
		this.balance+=amount;
	}

	public int getAccount_no() {
		return account_no;
	}
	
	public void withdraw(double amount) {
		if(balance<amount)
			System.out.println("Insuffeicient acount balance");
		else {
			this.balance-=amount;
		}
	}

	public double getBalance() {
		return balance;
	}
	
}
public class Tester {

	public static void main(String[] args) {
		Account a1;
		
		Scanner sc=new Scanner(System.in);
		File file=new File("/home/dai/Desktop/Ass_12.dat");
		File file_new=new File("/home/dai/Desktop/Ass_12_new.dat");
		List<Account> lst=new ArrayList<>();
		
		while(true)
		{
			System.out.println("1.Accept records and save it into binary file");
			System.out.println("2.Display all records");
			System.out.println("3.Deposite amount into existing account");
			System.out.println("4.Withdraw amount fram existing account");
			System.out.println("5.display account whose balance is less than 20000");
			switch(sc.nextInt())
			{
			case 1:
				try {
					FileOutputStream fos=new FileOutputStream(file);
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					System.out.println("Enter details of the account holder: (Account no., Name, Account balance)");
					oos.writeObject(new Account(sc.nextInt(),sc.next(),sc.nextDouble()));
					oos.close();
					fos.close();
					System.out.println("Data added successfully");
				} catch (Exception e) {
					e.printStackTrace();
				}
				try {
					FileInputStream fis=new FileInputStream(file);
					ObjectInputStream ois=new ObjectInputStream(fis);
					while(true) {
						Object read=ois.readObject();
						if(read == null)
							break;
						Account acc=(Account)read;
						lst.add(acc);
					}
					ois.close();
					fis.close();
				}catch (Exception e) {}
				break;
				
			case 2:
				lst.forEach((x) -> System.out.println(x+ " "));
				break;
				
			case 3:				
				int dep_acc;
				double amount;
				System.out.println("Enter Account ID");
				dep_acc=sc.nextInt();
				System.out.println("Enter amount to Deposite");
				amount=sc.nextDouble();
				
				for(Account a:lst) {
					if(a.getAccount_no()==dep_acc) {
						a.deposite(amount);
					}
				}
				try {
					FileOutputStream fos=new FileOutputStream(file);
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					for(Account a:lst) {
						oos.writeObject(a);
					}
					oos.close();
					fos.close();
					System.out.println("amount deposited successfully");
				} catch (Exception e) {
					e.printStackTrace();
				}	
				break;
				
			case 4:
				int wd_acc;
				double wd_amount;
				System.out.println("Enter Account ID");
				wd_acc=sc.nextInt();
				System.out.println("Enter amount to Withdaw");
				wd_amount=sc.nextDouble();
				
				for(Account a:lst) {
					if(a.getAccount_no()==wd_acc) {
						a.withdraw(wd_amount);
					}
				}
				try {
					FileOutputStream fos=new FileOutputStream(file);
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					for(Account a:lst) {
						oos.writeObject(a);
					}
					oos.close();
					fos.close();
					System.out.println("amount Withdrawn successfully");
				} catch (Exception e) {
					e.printStackTrace();
				}	
				break;
				
			case 5:
				double amt=20000.0;
				for(Account b:lst) {
					if(b.getBalance()<=amt) {
						System.out.println(b);
					}
				}
				break;
			}
		}

	}

}
