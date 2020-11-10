package lab;

import java.io.BufferedReader;
import java.io.*;

public class Evennum {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("number.txt"));
		String line=br.readLine();
		String evennum[]=line.split(",");
		
		for(int k=0;k<evennum.length;k++) {
			int n=Integer.parseInt(evennum[k]);
	
		if(n%2==0) {
			System.out.println(n);
		}
		}

	}

}
