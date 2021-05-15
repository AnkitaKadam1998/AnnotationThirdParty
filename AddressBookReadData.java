package briglabz.Watch_Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AddressBookReadData {
	
	public static void main(String args[])
	{
		String path = "C:\\Users\\Ankita\\eclipse-workspace\\Watch-Service\\Data\\user.csv";
		String line= " ";
		try 
		{
			BufferedReader br= new  BufferedReader(new FileReader(path));
			
			while((line = br.readLine()) != null)
			{
				System.out.println("User data:"+line);
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
        }
	}
}

