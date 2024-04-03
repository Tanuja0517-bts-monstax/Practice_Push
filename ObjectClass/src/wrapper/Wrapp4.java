package wrapper;

public class Wrapp4 
{
	public static void main(String[] args)
	{
		int a=8465;
		String s=String.valueOf(a);//Converting int to String
		System.out.println(s);
		System.out.println(s+12);
		
		boolean b=false;
		String s1=String.valueOf(b);
		System.out.println(s1);
		
		float f=65.21f;
		String s2=String.valueOf(f);
		System.out.println(s2);
		System.out.println(s2+2.5f);
		
		char ch='a';
		String s3=String.valueOf(ch);
		System.out.println(s3);
		System.out.println(s3+'b');
		
		int a1[]= {1,33,45,5,66};
		System.out.println(a1);
	}
}
