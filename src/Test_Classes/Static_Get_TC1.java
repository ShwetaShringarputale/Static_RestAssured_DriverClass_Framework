package Test_Classes;

import java.io.IOException;

import Common_API_Methods.Static_Common_Utility_Method;
import Common_API_Methods.Static_Get_API_Methods;
import Request_Respository.Static_Get_Request_Respository;

public class Static_Get_TC1 {
	
	public static void Extractor() throws IOException
	{
		String baseURI = Static_Get_Request_Respository.BaseURI();
		String resource = Static_Get_Request_Respository.Get_Resource();
		
		int statusCode = Static_Get_API_Methods.ResponseStatusCode(baseURI,resource);
		System.out.println(statusCode);
		
		String ResponseBody = Static_Get_API_Methods.ResponseBody(baseURI, resource);
		System.out.println(ResponseBody);
		Static_Common_Utility_Method.EvidenceCreator("Get_TC1",Static_Get_Request_Respository.Get_Resource(),ResponseBody ,statusCode);
		
	}

}
