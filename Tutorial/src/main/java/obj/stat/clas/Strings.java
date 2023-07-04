package obj.stat.clas;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		Strings strs = new Strings();
		// strs.m1();
		// strs.indexOf();
		strs.convertAnArrayToString();
		//strs.StringTOArray();
		//strs.ArrayToString();
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


	}
	public void convertAnArrayToString()
	{
		/****************************************CHAR ARRAY TO STRING********************************************************/
		char[] ch = {'I','N','D','I','A',' ','I','S',' ', 'M','Y',' ','C','O','U','N','T','R','Y'};//new char[20];
		String str = "";
		int len= ch.length;
		for(int i=0;i<=len-1;i++)
		{
			str= str+ch[i];

		}
		System.out.println(str);
		/****************************************  STRING TO CHAR ARRAY  ********************************************************/

		char[] arr = new char[len];
		for(int i=0;i<=str.length()-1;i++)
		{
			arr[i] = str.charAt(i);
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==' ')
			{
				arr[i]=arr[i+1];

			}
			else
				System.out.print(arr[i]);
			
			//System.out.println("");

		}
		/****************************************  STRING TRIM  ********************************************************/
		
		String Orgstr = "        INDIA IS MY COUNTRY      ";
		String trmstr = Orgstr.trim(); 
		System.out.println();
		System.out.println("Priginal string is : " + Orgstr);
		System.out.println("Trimmed String : " + trmstr);
		/****************************************  SPLIT A STRING  ********************************************************/
		System.out.println(str);
		String strToBeSearched = "MY";
		String[] splstr = str.split(" ",5);
			//for(String str2: splstr)
		for(int i=0;i<=splstr.length-1;i++)	
		{
				if(splstr[i].equals(strToBeSearched))
				{
					System.out.println("String found at position : " + i);
					System.out.println(strToBeSearched + " :=: " + splstr[i]) ;
					break;
				}
				System.out.println(splstr[i]);
			}
	
	
	}
}
