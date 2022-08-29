package numberOfCase;

import java.util.Scanner;

public class OverlapPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int r = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		boolean[] isVisited = new boolean[num];
		
		int[] result = new int[r];
		
		overlapPermutation(arr,result,r);
		
	}
	
	
	static void overlapPermutation(int[] arr,  int[] result, int r) {
		if(r == 0) {
			for(int i=0; i<result.length; i++) {
				System.out.print(result[i]);
			}
			System.out.println();
		}else {
			for(int i=0; i<arr.length; i++) {
				
					result[result.length-r] = arr[i];
					overlapPermutation(arr,result,r-1);
					
					result[result.length-r] = 0;
				
			}
		}
	}

}
