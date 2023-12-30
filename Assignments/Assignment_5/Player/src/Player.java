
interface Printable{
	public void printDetails();
}
class CktPlayer implements Printable{
	private String name;
	private int runs;
	public CktPlayer() {
		name="Henry";
		runs=0;
	}
	public CktPlayer(String name, int runs) {
		super();
		this.name = name;
		this.runs = runs;
	}
	public void printDetails() {
		System.out.println("Name:"+name+" "+"Runs:"+runs);
	}
	
}

class FtPlayer implements Printable{
	private String name;
	private int goals;
	public FtPlayer() {
		name="Henry";
		goals=0;
	}
	public FtPlayer(String name, int goals) {
		super();
		this.name = name;
		this.goals = goals;
	}
	public void printDetails() {
		System.out.println("Name:"+name+" "+"Goals:"+goals);
	}
	
}
public class Player {
	public static void main(String []args) {
		Printable p=new CktPlayer("Agam",50);
		p.printDetails();
		Printable p1=new FtPlayer("Madan",5);
		p1.printDetails();
	}

}
