package obj.stat.clas;

public class Arrays 
{
	public static void main(String args[])
	{
		Arrays ar = new Arrays();
		//ar.charArray();
		//ar.intArray();
		ar.TwodimArray();

	}
	public void charArray()
	{
		char[] genders = {'M','F','N'};
		String gen = "String";
		char ch1 = gen.charAt(0);
		int len =gen.length();
		int arlen = genders.length;
		for (int i=0;i<=arlen-1;i++)
		{
			System.out.println(genders[i]);

		}


		System.out.println(len +" "+ arlen+" "+ch1 + " " + genders[0]);


	}
	public void intArray()
	{

		int age[] = {11,22,33}; //or
		//int age2[] = new int[4];
		age[2] = 10;
		for(int i: age)
		{
			System.out.println(i);

		}
		//		iphone[0] = 1;iphone[1] = 2;iphone[2] = 1;

	}
	public void TwodimArray()
	{

		
		
		int[][] x =new int[2][];
		
		x[0] =new int[2];
		x[1] = new  int[2];
		x[0][0] =1; 
		x[0][1] =2; 
		x[1][0] =3;
		x[1][1]=4;
		int len = x.length;
		System.out.println("length of x : " + len);
		for(int i=0;i<=len;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j] + "\t ");
				
			}
			System.out.println();
		}
				
		
		
		
	}
}
