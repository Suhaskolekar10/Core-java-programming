package Student;
import Student.*;
import java.util.Comparator;

class CompareStudent implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getRollno()>o2.getRollno())
			return 1;
		else if(o1.getRollno()<o2.getRollno())
			return -1;
		else
			return 0;
		}
}
