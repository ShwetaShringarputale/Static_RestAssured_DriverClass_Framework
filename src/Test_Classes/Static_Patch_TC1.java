package Test_Classes;
import Request_Respository.Static_Patch_Request_Respository;
import io.restassured.path.json.JsonPath;
import java.io.IOException;
import org.testng.Assert;
import Common_API_Methods.Static_Common_Utility_Method;
import Common_API_Methods.Static_Patch_API_Methods;

public class Static_Patch_TC1 {
	
	public static void Extractor() throws IOException
	{
		String baseURI = Static_Patch_Request_Respository.BaseURI();
		String requestBody = Static_Patch_Request_Respository.Patch_Req_TC1();
		String resource = Static_Patch_Request_Respository.Patch_Resource();
		
		JsonPath JPatch_Req = new JsonPath(Static_Patch_Request_Respository.Patch_Req_TC1());
		String patch_req_name =  JPatch_Req.getString("name");
		String patch_req_job = JPatch_Req.getString("job");
		
		int statusCode = Static_Patch_API_Methods.ResponseStatusCode(baseURI,resource,requestBody);
		System.out.println(statusCode);
		
		String ResponseBody = Static_Patch_API_Methods.ResponseBody(baseURI, resource, requestBody);
		System.out.println(ResponseBody);
		Static_Common_Utility_Method.EvidenceCreator("Patch_TC1",Static_Patch_Request_Respository.Patch_Req_TC1(),ResponseBody ,statusCode);
		
		JsonPath JPatch = new JsonPath(ResponseBody);
		String patch_res_name = JPatch.getString("name");
		String patch_res_job = JPatch.getString("job");
		
		Assert.assertEquals(patch_res_name, patch_req_name);
		Assert.assertEquals(patch_res_job, patch_req_job);
	
	}

}
