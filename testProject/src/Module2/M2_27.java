/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and
5 units by creating a class named 'Triangle' without any parameter in its constructor.*/

package Module2;

class Triangle{
	float  a, b, c, perimeter, p;
	double area;
	
	Triangle(){
	}
	public void getArea() {
		p = (a + b + c) / 2;
		area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println("Area Of Triangle: "+area);
	}
	public void getPerimeter() {
		perimeter = a + b + c;
		System.out.println("Perimeter Of Triangle: "+perimeter);
	}
}
public class M2_27 {
	public static void main(String[] args) {
		Triangle T = new Triangle();
		T.a = 3;
		T.b = 4;
		T.c = 5;
		T.getArea();
		T.getPerimeter();
	}
}
