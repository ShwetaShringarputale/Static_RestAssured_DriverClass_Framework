package Test_Classes;

import java.io.IOException;

import org.testng.Assert;

import Common_API_Methods.Static_Common_Utility_Method;
import Common_API_Methods.Static_Post_API_Methods;
import Request_Respository.Static_Post_Request_Respository;
import io.restassured.path.json.JsonPath;

public class Static_Post_TC1 {
	
	public static void Extractor() throws IOException//method return nothing only execute it
	{
		
		//Extract Response Status Code
		int statusCode = Static_Post_API_Methods.ResponseStatusCode(
				Static_Post_Request_Respository.BaseURI(), 
				Static_Post_Request_Respository.Post_Resource(), 
				Static_Post_Request_Respository.Post_Req_TC1());
		System.out.println(statusCode);
		
		//Extract Request Body
		JsonPath JPost_Req = new JsonPath(Static_Post_Request_Respository.Post_Req_TC1());
		String post_req_name =  JPost_Req.getString("name");
		String post_req_job = JPost_Req.getString("job");
		
		//Parse Response
		String ResponseBody = Static_Post_API_Methods.ResponseBody(
				Static_Post_Request_Respository.BaseURI(), 
				Static_Post_Request_Respository.Post_Resource(), 
				Static_Post_Request_Respository.Post_Req_TC1());
		Static_Common_Utility_Method.EvidenceCreator("Post_TC1",Static_Post_Request_Respository.Post_Req_TC1(),ResponseBody ,statusCode);
		System.out.println(ResponseBody);
			
		JsonPath JPost = new JsonPath(ResponseBody);
		String post_res_name=JPost.getString("name");
        String post_res_job=JPost.getString("job");
		
        //Validate Response Body
		Assert.assertEquals(post_res_name,post_req_name);
        Assert.assertEquals(post_res_job,post_req_job);
		
		
	}
	
}
