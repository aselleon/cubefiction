//***Вводится целое число N от 1 до 100(включительно), затем нужно ввести N целых чисел. 
//Нужно с последовательности удалить все нули. После удаления нулей нужно сдвинуть оставшие элементы влево, а пустые ячейки справа заполнить значением -1. Выведите получившуюся последовательность.

package JavaTasks;
import java.util.*;

public class task3 {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] =in.nextInt();
			
		}
		for(int i=0;i<arr.length;) {
			if(arr[i]==0) { //esli raven 0 to sozdaem nov massiv na odin element bolshe
				for(int j=i;j<arr.length-1;j++) {
					arr[j]= arr[j+1];
					
				}
				arr[n-1]= -1; //zamena posl elementa -1
			}
			else {
				i++;
			}
			
		}
	  for(int i=0;i<arr.length;i++) {
		  System.out.print(arr[i]+ " ");
	  }
     
	}

}
//vvod
//loop 
// if  
