/*28)	Print the sum, difference and product of two complex numbers by creating a class 
 named 'Complex' with separate methods for each operation whose real and imaginary parts 
 are entered by user. */

package Module2;
import java.util.Scanner;

class Complex{
	private double realOne, realTwo;
	private double imaginaryOne, imaginaryTwo;
	
	Complex(double realOne, double imaginaryOne, double realTwo, double imaginaryTwo){
		this.realOne = realOne;
		this.imaginaryOne = imaginaryOne;
		this.realTwo = realTwo;
		this.imaginaryTwo = imaginaryTwo; 
	}
	
	public void complexSum(){
		System.out.println("Sum Of Two Complex Number: "+realOne+realTwo+" + "+imaginaryOne+imaginaryTwo+"i");
	}
	public void complexDifference() {
		System.out.println("Difference Of Two Complex Number: "+(realOne - realTwo)+" - "+(imaginaryOne - imaginaryTwo)+"i");
	}
	public void complexProduct() {
		System.out.println("Product Of Two Complex Number: "+((realOne * realTwo)-(imaginaryOne * imaginaryTwo))+" + "+((realOne*imaginaryTwo)+(imaginaryOne*realTwo)));
	}
	
}
public class M2_28 {
	public static void main(String[] args) {
		double realOne, realTwo, imaginaryOne, imaginaryTwo; 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter First Real Number: ");
		realOne = sc.nextDouble();
		System.out.print("Enter First Imaginary Number: ");
		imaginaryOne = sc.nextDouble();
		System.out.print("Enter Second Real Number: ");
		realTwo = sc.nextDouble();
		System.out.println("Enter Second Imginary Number: ");
		imaginaryTwo = sc.nextDouble();
		
		Complex C = new Complex(realOne, imaginaryOne, realTwo, imaginaryTwo);
		
		System.out.println("\nFirst Complex Number: "+realOne+" + "+imaginaryOne+"i");
		System.out.println("Second Complex Number: "+realTwo+" + "+imaginaryTwo+"i");
		
		C.complexSum();
		C.complexDifference();
		C.complexProduct();
	}
}
