package getRequests;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

//import com.tngtech.java.junit.dataprovider.DataProvider;
//import com.tngtech.java.junit.dataprovider.UseDataProvider;

import baseClasses.BaseClassForSingleUserGet;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;

public class SingleUserDetails extends BaseClassForSingleUserGet
{
	String uri_singleUser = "https://reqres.in/api/users?page=2";
	JsonPath body;
	String first_name;
	int id;
	RestAssured response = new RestAssured();
	@Test(priority=1)	
	public void getDetails()
	{
		Map<String,Object> param = new HashMap<String, Object>();
		param.put("id", "9");
		param.put("first_name", "Tobias");
		System.out.println("*************************LOG FROM GET REQUEST******************************");
		ResponseBody res = RestAssured.
				given()
				.queryParams(param)
				.when()
				.get(uri_singleUser).
				then().statusCode(200)
				.extract().response();
		//		.then()
		//		.statusCode(200)
		//		.log().body();	


		id = res.jsonPath().getInt("data.id");
		first_name = res.jsonPath().getString("data.first_name");
		res.prettyPrint();
		System.out.println("Id of the user : " + id);
		System.out.println("Id of the user : " + first_name);	
	}
	@Test(priority=2,dependsOnMethods="getDetails")
	public void postdata()
	{
		JSONObject js = new JSONObject();
		js.put("job", "Watrboy");
		js.put("name",first_name );
		System.out.println("*************************LOG FROM POST REQUEST******************************");
		RestAssured.given()
		.contentType("application/Json").body(js.toJSONString())
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201).log().all();
		//Response res_
	}
	@Test(priority=3,dependsOnMethods="postdata")
	public void put()
	{
		JSONObject js = new JSONObject();
		js.put("job", "put_job");
		js.put("name",first_name );
		System.out.println("*************************LOG FROM PUT REQUEST******************************");
		RestAssured.given()
		.contentType("application/Json").body(js.toJSONString())
		.when()
		.put("https://reqres.in/api/users/2")
		.then()
		.statusCode(200).log().body();
	}


}
