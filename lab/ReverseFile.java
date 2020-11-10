package lab;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class ReverseFile {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new FileReader("java.txt"));
		
		StringBuffer sb=new StringBuffer();
		String line=br.readLine();
		String reversetxt="";
		while(line!=null) {
			sb.append(line).toString();
			System.out.println("after Reverse : "+reversetxt); 
			line=br.readLine();
		}
		sb.reverse();
		reversetxt=sb.toString();
		BufferedWriter bw=new BufferedWriter(new FileWriter("java.txt"));
		bw.write(reversetxt);
		bw.flush();
		
	}

}
