package wrapper;

public class Wrapp2 
{
	public static void main(String[] args) 
	{
		int a=10;
		Integer i1=new Integer(a);
		System.out.println(i1);
		System.out.println(i1.toString());
		
		int b=i1.intValue();
		System.out.println("Converted value from object to respective primitive type:"+b);
		
	}
}
