package Request_Respository;

import java.io.IOException;
public class Static_Put_Request_Respository {
	
	public static String BaseURI() 
	{
		String baseURI = "https://reqres.in/";
		return baseURI;
	}
	public static String Put_Resource()
	{
		String put_Resource = "api/users/2";
		return put_Resource;
	}
	public static String Put_Req_TC1() throws IOException
	{
		String requestBody ="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}";
		return requestBody;
	}

}