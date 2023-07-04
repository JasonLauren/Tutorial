package obj.stat.clas;
class A implements InterfaceImpliment,InterfaceImpliment2
{	
	public void m1()
	{
		
	}
	public int m2() 
	{
		int sum =3+4;
		System.out.println("m2 from class A : ");
		return sum;
	
	}

	public String m3()
	{
	
		return null;
	}
}
class Interfaces
{
	public static void main(String args[])
	{
		
		A obj = new A();
		obj.m2();
		
	}

}