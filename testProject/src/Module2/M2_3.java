/*Write a Java program that takes a year from user and print whether that year is a leap
year or not.*/
package Module2;
import java.util.*;

class M2_3{
	public static void main(String[] args){
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		year = sc.nextInt();
		if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)){
			System.out.println("Leap year");
		}
		else{
			System.out.println("Non-Leap year");
		}
		sc.close();
	}
}