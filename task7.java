//**Напишите функцию, который принимает одномерный массив и сортирует его.
//Метод сортировки выберите сами.
package JavaTasks;
import java.util.*;
public class task7 {

	public static void main(String[] args) {
		//  zapolnyaem massive
     Scanner in  = new Scanner(System.in);
     int n= in.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<arr.length;i++) {
    	 arr[i]=in.nextInt();
     }
     sort1(arr);
     //vyvod uzhe otsortirov massiva
     for(int i=0;i<arr.length;i++) {
    	 System.out.print(" " + arr[i]);
     }
     
	}
	//importiryem method sorting tyt
	public static void sort1(int arr[]) {//chto tyt budem sortirovat
		Arrays.sort(arr); //peredaem imya massiva
	}

}
