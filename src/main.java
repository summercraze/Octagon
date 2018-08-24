
public class main 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Octagon octagon1 = new Octagon(5,"Pink", true);
		Octagon octagon2 = (Octagon) octagon1.clone();
		System.out.println("octagon1 info" + octagon1.toString());
		System.out.println("octagon2 info" + octagon1.toString());
		int comparisonResult = octagon2.compareTo(octagon1);
		if(comparisonResult == 1)
			System.out.println("octagon2>octagon1");
		else if(comparisonResult == -1)
			System.out.println("octagon2<octagon1");
		else
			System.out.println("octagon2=octagon1");
	}
}
