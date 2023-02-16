/*Write a program in Java to input 5 numbers from keyboard and find their sum and
average using for loop. */
package Module2;
import java.util.*;

class M2_5{
	public static void main(String[] args){
		int[] num_array = new int[5];
		int sum = 0, avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any 5 Numbers\n");

		for(int i = 0; i < num_array.length; i++){
			System.out.print(String.format("Enter Number %d: ",i+1));
			num_array[i] = sc.nextInt();
		}

		System.out.print("Numbers: ");
		for(int i = 0; i < num_array.length; i++){
			System.out.print(num_array[i]+"  ");
		}

		for(int i = 0; i < num_array.length; i++){
			sum = sum + i; 
		}

		System.out.println(String.format("\nSum Of Above Numbers: %d",sum));
		avg = sum / num_array.length;
		System.out.println(String.format("Average Of Above Numbers: %d",avg));
		sc.close();
	}
}