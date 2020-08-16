package JavaTasks;

import java.util.*;

public class task2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[] = new int[10];
	Scanner in = new Scanner(System.in);
	arr[0] = in.nextInt();
	arr[1] = in.nextInt();
	for(int i = 2;i<arr.length;i++) {
		arr[i] = arr[i-1]+arr[i-2];
		System.out.print(" " + arr[i]);
	}
	

	}

}
//////3 5
//////arr[0]= num1     
////arr[1]=  num 2
////aarr[2] num1+num2 arr[0]+arr[1]  
////arr[3]= num2+(num1+num2)   (arr[1]+arr[2])
//arr[4] = arr[3+ (arr[2]+arr[3])]
//////
