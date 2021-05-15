package briglabz.Watch_Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import com.opencsv.CSVWriter;

public class AddressBookWriteData {
	
	public static void main(String args[])
	{
		writeData("C:\\Users\\Ankita\\eclipse-workspace\\Watch-Service\\Data\\Contact.csv");
	}

	private static void writeData(String filePath) {
		
		File file = new File(filePath);
		try
		{
			FileWriter outputfile = new FileWriter(file);
			CSVWriter writer = new CSVWriter(outputfile);
			
			String[] header = {"FirstName","LastName","City","State","ZipCode","PhoneNumber","EmailId"};
			writer.writeNext(header);
			
			String[] data1= {"ankita","kadam","mumbai","maharashtra","400075","7506244565","ankita80kadam@gmail.com"};
			writer.writeNext(data1);
			String[] data2= {"sanket","desai","pune","maharashtra","400076","7506247769","sanketdesai@gmail.com"};
			writer.writeNext(data2);
			
			writer.close();
			
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
