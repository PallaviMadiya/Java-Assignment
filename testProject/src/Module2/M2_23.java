/*23) Create a class to print the area of a square and a rectangle. 
 The class has two methods with the same name but different number of parameters. 
 The method for printing area of a rectangle has two parameters which are length 
 and breadth respectively while the other method for printing area of square has one 
 parameter which is side of square. */

package Module2;

class Area{
		public float areaMethod(float length, float breadth) {
			return length * breadth;
		}
		public float areaMethod(float side) {
			return side * side;
		}
}

public class M2_23 {
	public static void main(String[] args) {
		Area A = new Area();
		System.out.println("Area Of Rectangle Is: "+A.areaMethod(12,10));
		System.out.println("Area Of Square Is: "+A.areaMethod(10));
		
	}
}
