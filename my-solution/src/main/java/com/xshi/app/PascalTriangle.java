import java.io.*;
import java.util.*;

public class PascalTriangle{
	public static List<List<Integer>> generate(int numRows){
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		if(numRows < 1){
			throw new IllegalArgumentException();
		}

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		lists.add(list);
		for(int i = 1;i < numRows;i++){
			list = new ArrayList<Integer>();
			list.add(1);
			if(i > 1){
				for(int j = 1;j < i;j++){
					int num = lists.get(i - 1).get(j - 1) + lists.get(i - 1).get(j);
					list.add(num);
				}
			}
			list.add(1);
			lists.add(list);
		}
		return lists;
	}

	public static void main(String[] args){
		try{
			for(List<Integer> ls:generate(5)){
				for(int n:ls){
					System.out.print(n + " ");
				}
				System.out.println("");			}
		}catch(IllegalArgumentException e){
			System.out.println("Please enter a number of line that is greater than 0");
		}
	}
}
