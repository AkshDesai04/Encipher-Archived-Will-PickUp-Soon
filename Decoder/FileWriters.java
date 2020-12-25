import java.io.FileWriter;   // Import the FileWriter class
import java.io.File;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.*;


public class FileWriters {
	public static boolean WriteToFile(String input) {
		String fileDest = "C:\\Output\\OutputEnc.txt";
    	try {
    		FileWriter myWriter = new FileWriter(fileDest);
    		myWriter.write(input);
    		myWriter.close();
    		return true;
    		}
    		catch (IOException e) {
    			try {
                    System.out.println(e);
    			    	FileCreate(fileDest);
    			    	FileWriter myWriter = new FileWriter(fileDest);
    			    	myWriter.write(input);
    			    }
    			    catch(IOException a) {
    			    	System.out.println(a);
    			    	return false;
    			        }
    		}
    		finally{
    			return false;
    		}
	}


	public static void FileCreate(String name) {
		try {
			File myObj = new File(name);
			if (myObj.createNewFile())
				System.out.println("STAGE 8 CORRECTION MADE.");
    	}
    	catch (IOException e) {
			e.printStackTrace();
		}
	}
}