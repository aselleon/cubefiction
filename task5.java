//**Вводиться N и M и значения двумерного массива. 
//Найти максимум и минимум. Поменять их местами.
package JavaTasks;
import java.util.*;
public class task5 {

	public static void main(String[] args) {
		// zapolnyaem 2d massiv
     Scanner in = new Scanner(System.in);
     int n=in.nextInt();
     int m=in.nextInt();
     int arr[][]= new int[n][m];
     for(int i=0;i<arr.length;i++) {
    	 for(int j=0;j<arr[i].length;j++) {
    		 arr[i][j]= in.nextInt();
    		 }
     }//initciliruem idex of 2d array
     int x1= 0;
     int x2= 0;
     int y1= 0;
     int y2= 0;
     for(int i=0;i<arr.length;i++) {
    	 for(int j=0;j<arr[i].length;j++) {
    		 if(arr[x1][y1]<arr[i][j]) {
    			 x1=i;
    			 y1=j;
    		 }
    		 if(arr[x2][y2]>arr[i][j]) {
    			 x2=i;
    			 y2=j;
    	 }
     }
  }
     //sozdaem peremennuyu dlya hraneniya & perenos
     int swap1 = arr[x1][y1];
     arr[x1][y1]= arr[x2][y2];
     arr[x2][y2]= swap1;
     for(int i=0;i<arr.length;i++) {
    	 for(int j=0;j<arr[i].length;j++) {
    		 System.out.print(" " + arr[i][j]);
    	 }
    	 System.out.println();
     }
}
}
