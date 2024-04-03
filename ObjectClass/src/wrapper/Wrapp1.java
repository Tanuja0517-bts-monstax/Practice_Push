package wrapper;

public class Wrapp1 
{
	public static void main(String[] args) 
	{
		Character ch=new Character('r');
		System.out.println(ch);	//Format of reference
		System.out.println(ch.hashCode());	//hashcode of ch variable
		System.out.println(ch.toString());	//Returns format(data) as reference
		char c='e';
		System.out.println(c);	//prints data of variable
		Character ch1=new Character(c);	//converting primitive datatype to non-primitive datatype(object)
		System.out.println(ch1);	//Format of reference
	}
}
