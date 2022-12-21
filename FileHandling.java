package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileReadWrite {
	public static void main(String [] args){
		File file=new File("C:\\Users\\Pattu\\Desktop\\Read&Write");
		file.mkdir();
		File file1=new File("C:\\Users\\Pattu\\Desktop\\Read&Write\\Demo.txt");
		try {
			file1.createNewFile();
			FileWriter writer=new FileWriter("C:\\Users\\Pattu\\Desktop\\Read&Write\\Demo.txt",true);
		BufferedWriter BW=new BufferedWriter(writer);
			BW.write("Welcome to File Handiling Method");
			BW.newLine();
			BW.write("File writing");
			BW.newLine();
			
		BW.flush();
		writer.close();
		FileReader reader=new FileReader("C:\\Users\\Pattu\\Desktop\\Read&Write\\Demo.txt");
		BufferedReader BR=new BufferedReader(reader);
		String Lines=BR.readLine();
		while(Lines !=null) {
			System.out.println(Lines);
			Lines=BR.readLine();
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
