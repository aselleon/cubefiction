//**Вводиться N(квадратный массив). Значения двумерного массива заполняются 
//последовательными значениями змейкой по горизонтали.
package JavaTasks;
import java.util.*;

public class taskZmeika {

	public static void main(String[] args) {
		// sozd 2d array
		Scanner in = new Scanner(System.in);
	     int n=in.nextInt();
	     int arr[][]= new int[n][n];
	     int k=1;
	     for(int i=0;i<arr.length;i++) {
	    	 //esli chetnoe
	    	 if(i%2==0) {
	    		 for(int j=0;j<arr[i].length;j++) {
	    		arr[i][j]=k;	
	    			 k++;
	    	 }
	    	 }
	    	 else {
	    		 for(int j=arr[i].length-1;j>=0;j--) {
    			 arr[i][j]=k;
    			 k++;
	    	 }
	       }
	    	 
	    }
	     
	     for(int i=0;i<arr.length;i++) {
	    	 for(int j=0;j<arr[i].length;j++) {
	    		 System.out.print(" " + arr[i][j]);
	    		 }
	    	 System.out.println();
	}
	    
}
}
