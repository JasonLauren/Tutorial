package obj.stat.clas;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		Strings strs = new Strings();
		// strs.m1();
		// strs.indexOf();
		//strs.StringTOArray();
		strs.ArrayToString();
	}

	public void m1() {
		System.out.println("Plese enter the string : ");
		Scanner obj = new Scanner(System.in);
		String name = obj.nextLine();
		System.out.println("Plese enter the age : ");
		// int age = obj.nextInt();
		System.out.println(" age is : " + name);

	}

	public void indexOf() {
		String search = "India is my country";
		int len = search.length();
		System.out.println(search.indexOf("q"));

	}

	public String StringTOArray() {
		String country = "Pakistan";
		int len = country.length();
		char cnt[] = new char[len];
		for (int i = 0; i <= len - 1; i++)
		{

			cnt[i] = country.charAt(i);
			System.out.print(cnt[i]);

		}
		return country;

	}
	public void ArrayToString()
	{
		String cnvstr=StringTOArray();
		char[] country = {'I','N','D','I','A'};
		int len = country.length;
		for(int i=0;i<=len-1;i++)
		{
			cnvstr = cnvstr+country[i];
			
		}
		System.out.println(cnvstr);
	//System.out.println(StringTOArray());
		
	}

}
