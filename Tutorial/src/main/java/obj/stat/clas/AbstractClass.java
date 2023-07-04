package obj.stat.clas;

abstract class AbstractClass 
{
	public static void main(String args[])
	{
		ChildClass cc = new ChildClass();
		cc.m1();
		cc.m2("parent method");
		cc.m2(99);
		AbstractClass ac = new ChildClass();
		ac.m2();
		ac.m2();
	}
	public abstract void m1();
	
	public void m2()
	{
		System.out.println("m2 implimented :");
	}
	/*  Method overloading */
	public void m2(String name)
	{
		System.out.println("m2 implimented in parent class : " + name);
	}

}

class ChildClass extends AbstractClass
{
	public void m1()
	{
		System.out.println("m1 method from childclass as method overriding : ");
	}
	
	/*  Method overloading */
	public void m2(int id)
	{
		System.out.println("m2 implimented in child class: " + id);
	}
}
