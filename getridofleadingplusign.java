package fileinout;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class getridofleadingplusign {

	public static void main(String args[]) throws IOException {
	Scanner sf = new Scanner(new File("E:\\Workspace\\fileinout\\MyData.txt"));
	int maxIndx = -1;
	String me[] = new String[10000];
	while(sf.hasNext()){
		maxIndx++;
		me[maxIndx] = sf.nextLine();
	}
		sf.close();
		
		String answer = "";
	int sum;
	
	for(int j = 0; j <=maxIndx;j++){
		Scanner sc = new Scanner(me[j]);
		sum = 0;
		answer = "";
		while(sc.hasNext()){
			int i = sc.nextInt();
			if(answer.equals(""))
				answer += i;
			else
			answer += " + " + i;
			sum += i;
			
		}
		answer += " = " + sum;
		System.out.println(answer);
	}
		
		
	}
}

