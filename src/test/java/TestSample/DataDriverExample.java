package TestSample;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class DataDriverExample {

	public static void main(String[] args) throws IOException {

String csvpath="C:\\Users\\hindumathi.matike\\Documents\\Test.csv";
Reader reader= Files.newBufferedReader(Paths.get(csvpath));
CSVParser parser= new CSVParser(reader, CSVFormat.DEFAULT);

for (CSVRecord csvrecord: parser)
{
	String uname=csvrecord.get(0);
	String pass=csvrecord.get(1);
	System.out.println(uname);
	System.out.println(pass);
}

	}

}
