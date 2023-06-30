package Common_API_Methods;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Write Data in NotePad File
public class Static_Common_Utility_Method {
	//Write Data in NotePad File
	public static void EvidenceCreator(String Filename, String RequestBody ,String ResponseBody 
			,int statusCode) throws IOException
	{
		File TextFile = new File("E:\\File\\EvidenceFile\\" +Filename+".txt");
		System.out.println("New blank text file of name :" + TextFile.getName());
		
		FileWriter dataWrite = new FileWriter(TextFile);
		
		dataWrite.write("Request Body is :" +RequestBody + "\n\n");
		dataWrite.write("Status Code is : "+statusCode + "\n\n");
		dataWrite.write("Response Body is :" +ResponseBody + "\n\n");
		
		dataWrite.close();		
		System.out.println("Data is entered in Text File :" +TextFile.getName());
			
	}

}

