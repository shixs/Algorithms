import java.io.*;
import java.util.*;
import java.math.*;

public class MaximumSubarray{
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	int numOfCase = sc.nextInt();
        	if(numOfCase < 1 || numOfCase > 10){
            		throw new IllegalArgumentException();
        	}
        	int[][] res = new int[numOfCase][2];
        	for(int i = 0;i < numOfCase;i++){
            		int numOfInput = sc.nextInt();
            		int num_1 = sc.nextInt();
            		int max = num_1;
            		int curr = num_1;
            		int sum = num_1;
            		for(int j = 1;j < numOfInput;j++){
                		int num = sc.nextInt();
                		if(num >= 0){
                    			sum = (sum < 0) ? num:sum + num;
                		}else if(num > sum){
                    			sum = num;
                		}
                		curr = Math.max(curr + num,num);
                		max = Math.max(curr,max);
            		}
            	res[i][0] = max;
            	res[i][1] = sum;
        	}
        	for(int m = 0;m < numOfCase;m++){
            		System.out.println(res[m][0] + " " + res[m][1]);
        	}
    	}
}
