//**Вводиться N(квадратный массив). Значения двумерного массива заполняются последовательными 
//значениями змейкой по вертикали.

package JavaTasks;
import java.util.*;

public class task9 {

	public static void main(String[] args) {
		// sozdaem 2d array
		Scanner in = new Scanner(System.in);
	     int n=in.nextInt();
	     int arr[][]= new int[n][n];
	     int k=1;
	     //esli chetnoe^to vozr
	     for(int i=0;i<n;i++) {
	    	 if(i%2==0) {
	    		 for(int j=0;j<n;j++) {
	    		arr[j][i]=k;	
	    			 k++;
	    	 }
	    	 }
	    	 //esli nechetnoe umensh
	    	 else {
	    		 for(int j=n-1;j>=0;j--) {
    			 arr[j][i]=k;
    			 k++;
	    	 }
	       }
	    	 
	    }
	     //vyvod
	     for(int i=0;i<n;i++) {
	    	 for(int j=0;j<n;j++) {
	    		 System.out.print(" " + arr[i][j]);
	    		 }
	    	 System.out.println();
	}
	    
}
}
