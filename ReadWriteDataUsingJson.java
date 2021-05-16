package briglabz.Watch_Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataUsingJson {
	
	public static void main(String args[]) throws IOException, ParseException
	{
		JSONParser jsonparser = new JSONParser();
		{
		FileReader reader= new FileReader("C:\\Users\\Ankita\\eclipse-workspace\\Watch-Service\\Contact.json");
		Object obj=jsonparser.parse(reader);
		JSONObject contactjsonobj=(JSONObject)obj;
		
		String FirstName=(String)contactjsonobj.get("FirstName");
		String LastName=(String)contactjsonobj.get("LastName");
		String City=(String)contactjsonobj.get("City");
		String State=(String)contactjsonobj.get("State");
		String ZipCode=(String)contactjsonobj.get("ZipCode");
		String PhoneNumber=(String)contactjsonobj.get("PhoneNumber");
		String EmailID=(String)contactjsonobj.get("EmailId");
		
		System.out.println("FirstName:"+FirstName);
		System.out.println("LastName:"+LastName);
		System.out.println(" City:"+ City);
		System.out.println("State:"+State);
		System.out.println("ZipCode:"+ZipCode);
		System.out.println("PhoneNumber:"+PhoneNumber);
		System.out.println("EmailID:"+EmailID);
	
}
	}
}
