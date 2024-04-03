package object;

public class MyselfDriver 
{
	public static void main(String[] args) 
	{
		Myself m1=new Myself("Tanuja",22,"BTech",7030791546l);
		Myself m2=new Myself("Tanujaaa",22,"BTech",7030791546l);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m1.equals(m2));
		//System.out.println(m1==m2);
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		
	}
}
