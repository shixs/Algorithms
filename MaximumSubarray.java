import java.io.*;
import java.util.*;
import java.math.*;

public class MaximumSubarray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numOfCase = sc.nextInt();
		if(numOfCase < 1 || numOfCase > 10){
			throw new IllegalArgumentException();
		}
		
		for(int i = 0;i < numOfCase;i++){
			int numOfInput = sc.nextInt();
			int num_1 = sc.nextInt();
			int max = num_1;
			int curr = num_1;
			for(int j = 1;j < numOfInput;j++){
				int num = sc.nextInt();
				curr = Math.max(num,curr + num);
				max = Math.max(curr,max);
			}
			
			System.out.println(max);	
		}
	}
}
