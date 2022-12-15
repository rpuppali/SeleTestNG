package poiReadWriteExcelfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class temp {
	public static void main(String[] args) {
		
	
	File file = new File("C:\\\\Users\\\\reach\\\\eclipse-workspace\\\\JavaSelMaven1\\\\src\\main\\\\java\\\\textfile.txt");
	FileWriter fw = new FileWriter(file);
	BufferedWriter writer = new BufferedWriter(fw);
	}
}
