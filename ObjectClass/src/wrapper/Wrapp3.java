package wrapper;

public class Wrapp3
{
	public static void main(String[] args)
	{
		float f=12.34f;
		Float f1=new Float(f);
		System.out.println(f1);	//reference format
		float f2=f1.floatValue();
		System.out.println(f2);	//variable value
	}
}
