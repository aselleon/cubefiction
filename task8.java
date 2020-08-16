//**Напишите функцию, который принимает двумерный массив 
//и сортирует его. Метод сортировки выберите сами.
package JavaTasks;
//import arrays
import java.util.Arrays;
import java.util.Scanner;

public class task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	     int n=in.nextInt();
	     int m=in.nextInt();
	     int arr[][]= new int[n][m];
	     for(int i=0;i<arr.length;i++) {
	    	 for(int j=0;j<arr[i].length;j++) {
	    		 arr[i][j]= in.nextInt();
	    		 }
	     }
	     sort1(arr);
	     for(int i=0;i<arr.length;i++) {
	    	 for(int j=0;j<arr[i].length;j++)
	    	 System.out.print(" " + arr[i][j]);
	     }
	     System.out.println();
		}
	//sorting by ++
		public static void sort1(int arr[][]) {
			int arr1[]= new int[arr.length*arr[0].length];
			int z=0;
			for(int i=0;i<arr.length;i++) {
		    	 for(int j=0;j<arr[i].length;j++) {
		    		 arr1[z++]= arr[i][j];
		    		 }
			}
		
			Arrays.sort(arr1); 
			int k=0;
			for(int i=0;i<arr.length;i++) {
		    	 for(int j=0;j<arr[i].length;j++) {
		    		 arr[i][j]= arr1[k++];
		    		 }
		     }
			
		}

	}


