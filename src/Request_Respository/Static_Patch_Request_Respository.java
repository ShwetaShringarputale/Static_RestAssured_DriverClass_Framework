package Request_Respository;

import java.io.IOException;
public class Static_Patch_Request_Respository {
	
	public static String BaseURI() 
	{
		String baseURI = "https://reqres.in/";
		return baseURI;
	}
	public static String Patch_Resource()
	{
		String patch_Resource = "api/users/2";
		return patch_Resource;
	}
	public static String Patch_Req_TC1() throws IOException
	{
		String requestBody ="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}";
		return requestBody;
	}

}
