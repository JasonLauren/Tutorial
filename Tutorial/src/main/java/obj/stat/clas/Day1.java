package obj.stat.clas;

public class Day1
{
	String name;
	int age;
	static int x=10; //20,
	int y=30;
	public Day1(String nme)
	{
		this.name= nme;
		
	}
	public Day1(String nme,int age)
	{
		this.name= nme;
		this.age = age;
		
	}
	
	public static void main(String args[])
	{
		Day1 d1 = new Day1("HP");
		d1.m1();
		d1.m3();
		Day1 d2 = new Day1("Dell",34);
		d2.m3();
		
		
	}
	public void m1()
	{
		String name = this.name;
		System.out.println("Daet from m1 method : " + name);
		y=25;
		System.out.println("value of y in m1 metho : " + y);
		this.x = this.x+10;
		System.out.println(" static x value is : " + this.x);
		
	}
	public void m2()
	{   
		
		System.out.println("value of y in m2 metho : " + y);
		System.out.println("Company name : " + this.name + " age is  : " +this.age);
		System.out.println(" static x value is : " + this.x);
		
	}
	public void m3()
	{
		System.out.println("value of y in m3 metho : " + y);
		
	}

}
