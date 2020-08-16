//Выведите новую последовательность чисел.
package JavaTasks;
import java.util.*;
public class task4 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = in.nextInt();
		}
		int x = in.nextInt();
		int less = n; //adress
		int arr1[]=new int[n+1];
		for(int i= 0;i<arr.length;i++) {
		if(x<arr[i]) {
			less = i;
		break;
		}

		}
		for(int i=0;i<less;i++) {
			arr1[i]=arr[i];
			
		}
		arr1[less] = x;
		for(int i=less+1;i<arr1.length;i++) {
			arr1[i]=arr[i-1];
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
	}	

}
