package Request_Respository;

import java.io.IOException;

public class Static_Post_Request_Respository {
	
	public static String BaseURI() //String is return type which give value return string 
	{
		String baseURI = "https://reqres.in/";
		return baseURI;
	}
	public static String Post_Resource()
	{
		String post_Resource = "api/users";
		return post_Resource;
	}
	public static String Post_Req_TC1() throws IOException
	{
		String requestBody ="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		return requestBody;
	}
	
}

