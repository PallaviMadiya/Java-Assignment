/*21)	Create a class named 'Print Number' to print various numbers of different 
 data types by creating different methods with the same name 'printn' having a 
 parameter for each data type. */

package Module2;

public class M2_21 {
	public static void main(String[] args) {
		PrintNumber p = new PrintNumber();
		p.printn(12);
		p.printn(1.2135);
		p.printn(1.0);
		p.printn("Pallavi");
	}
}

class PrintNumber{
	public int printn(int i) {
		System.out.println("Integer Data Type: "+i);
		return i;
	}
	public float printn(float f) {	
		System.out.println("Float Data Type: "+f);
		return f;
	}
	public double printn(double d) {
		System.out.println("Double Data Type: "+d);
		return d;
	}
	public String printn(String s) {
		System.out.println("String Data Type: "+s);
		return s;
	}
}
