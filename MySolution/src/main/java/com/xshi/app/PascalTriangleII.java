import java.io.*;
import java.util.*;

public class PascalTriangleII{
	public static List<Integer> getRow(int rowIndex){
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		if(rowIndex < 0){
			throw new IllegalArgumentException();
		}

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		lists.add(list);
		for(int i = 1;i <= rowIndex;i++){
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
		return lists.get(rowIndex);
	}

	public static void main(String[] args){
		try{
			for(int n:getRow(3)){
				System.out.print(n + " ");
			}
		}catch(IllegalArgumentException e){
			System.out.println("Please enter the index that is greater than or equal to 0");
		}
	}
}
