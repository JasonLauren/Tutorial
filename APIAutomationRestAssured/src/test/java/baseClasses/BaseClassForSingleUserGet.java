package baseClasses;

import org.junit.Before;

import io.restassured.RestAssured;

public class BaseClassForSingleUserGet 
{
	@Before
	public void init()
	{		
		RestAssured.baseURI  = "https://requires.in/api";
		//RestAssured.port 	 = 8080;
	//	RestAssured.basePath = "/students";
	}

}
