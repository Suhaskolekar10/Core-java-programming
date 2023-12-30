//Synchronized method

class Account
{
	private int balance;
	
	public Account() {
		balance = 10000;
	}
    //Added synchronized
	public synchronized void deposite(int amount) {
		//synchronized(this){
		System.out.println("Balance before deposite="+balance);
		balance=balance+amount;
		System.out.println("Balance after deposite="+balance);
		//}
	}
	//Added synchronized
	public synchronized void withdraw(int amount) {
		//synchronized(this){
		System.out.println("Balance before withdraw="+balance);
		balance=balance-amount;
		System.out.println("Balance after withdraw="+balance);
		//}
	}
}



class AccountUser extends Thread
{
	private String name,tot;
	private Account account;
	private int amount;
	
	
	public AccountUser(String n, Account acc,String tran, int amt) {
		name = n;
		account = acc;
		tot = tran;
		amount = amt;
	}
	
	public void run(){
		
		if(tot.equals("deposite"))
		{
			account.deposite(amount);
		}
		else if(tot.equals("withdraw"))
		{
			account.withdraw(amount);
		}
	}
	
	
	
}
public class Tester {

	public static void main(String[] args) {
		Account account=new Account();
		AccountUser user1=new AccountUser("abc",account,"deposite",1000);
		AccountUser user2=new AccountUser("xyz",account,"withdraw",500);
		user1.start();
		user2.start();

	}

}

/*without synchronization:-
Balance before withdraw=10000
Balance before deposite=10000
Balance after withdraw=9500
Balance after deposite=10500
 */



