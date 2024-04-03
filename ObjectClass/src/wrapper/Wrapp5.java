package wrapper;

public class Wrapp5
{
	public static void main(String[] args) 
	{
		String s="545.25";
		System.out.println(s);	//String type(NP)
		System.out.println(s+12);
		float f=Float.parseFloat(s);
		System.out.println(f);	//Float type(P)
		System.out.println(f+1.5f);
	}
}
