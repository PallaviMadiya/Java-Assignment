/*25) Create a class named 'Member' having the following members: 
 * 1. Data members 2. Name 3. Age 4. Phone number 5. Address 6. Salary 
 * It also has a method named 'printSalary' which prints the salary of the members. */

package Module2;

class Member{
	int menber = 1;
	String name = "Pal";
	int age = 21;
	long phone = 1253645125;
	String add = "E2, Dublin Street";
	double salary = 30000.00;
	
	public void printSalary() {
		System.out.println("Member Salary Is "+salary);
	}
}

public class M2_25 {
	public static void main(String[] args) {
		Member M = new Member();
		M.printSalary();
	}
}
