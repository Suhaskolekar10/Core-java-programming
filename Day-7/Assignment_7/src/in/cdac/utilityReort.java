package in.cdac;

import java.util.*;

public class utilityReort {
	private Map<String,Double>m;

	public utilityReort() {
		this.m = new HashMap();
	}
	
	public void creatReport()
	{
		UtilityList list=new UtilityList();
		list.createList();
		for(Student val:list.getList())
		{
			m.put(val.getName(), val.getPercentage());
		}
	}
	public void creatReport(List<Student> l)
	{
		
		for(Student val:l)
		{
			m.put(val.getName(), val.getPercentage());
		}
	}
	public void showReport() {
		
		Set<String> key=m.keySet();
		for(String val:key)
			System.out.println(val+"---> "+m.get(val));
	}
	
	public void show_report(List<Student> l1) {
		Scanner sc = new Scanner(System.in);
		for(Student S:l1) {
			this.m.put(S.getName(),S.getPercentage());
		}
			
		Set<String> keys = this.m.keySet();
		for(String k:keys) {
			System.out.println(" "+k+" ---> "+this.m.get(k));
		}
	}
}