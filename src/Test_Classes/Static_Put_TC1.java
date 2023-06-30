package Test_Classes;

import java.io.IOException;

import org.testng.Assert;

import Common_API_Methods.Static_Common_Utility_Method;
import Common_API_Methods.Static_Put_API_Methods;
import Request_Respository.Static_Put_Request_Respository;
import io.restassured.path.json.JsonPath;

public class Static_Put_TC1 {
	public static void Extractor() throws IOException
	{
		String baseURI = Static_Put_Request_Respository.BaseURI();
		String requestBody = Static_Put_Request_Respository.Put_Req_TC1();
		String resource = Static_Put_Request_Respository.Put_Resource();

		int statusCode = Static_Put_API_Methods.ResponseStatusCode(baseURI,resource,requestBody);
		System.out.println(statusCode);
		
		JsonPath JPut_Req = new JsonPath(Static_Put_Request_Respository.Put_Req_TC1());
		String put_req_name = JPut_Req.getString("name");
		String put_req_job = JPut_Req.getString("job");
		
		String ResponseBody = Static_Put_API_Methods.ResponseBody(baseURI, resource, requestBody);
		System.out.println(ResponseBody);
				
		Static_Common_Utility_Method.EvidenceCreator("Put_TC1",Static_Put_Request_Respository.Put_Req_TC1(),ResponseBody ,statusCode);
		
		JsonPath JPut = new JsonPath(ResponseBody);
		String put_res_name = JPut.getString("name");
		String put_res_job = JPut.getString("job");
		
		Assert.assertEquals(put_res_name, put_req_name);
		Assert.assertEquals(put_res_job, put_req_job);
		
}

}

