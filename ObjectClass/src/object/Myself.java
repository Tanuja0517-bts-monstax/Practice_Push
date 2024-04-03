package object;

public class Myself
{
	String name;
	int age;
	String edu;
	long phno;
	
	Myself()
	{
	}
	
	Myself(String name,int age,String edu,long phno)
	{
		this.name=name;
		this.age=age;
		this.edu=edu;
		this.phno=phno;
	}
	
	/*public String toString()
	{
		return "[Name:"+name+",Age:"+age+",Education:"+edu+",Phonenum:"+phno+"]";
	}*/
	
	public boolean equals(Object i)
	{
		Myself m=(Myself)i;
		return true;
	}
	
	public int hashCode()
	{
		int hc=age+(int)phno;
		hc+=name.hashCode()+edu.hashCode();
		return hc;
	}
}
