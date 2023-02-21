/*30)	Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, 
 $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 
 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. 
 Call this method by creating an object of each of the three classes.*/

package Module2;

abstract class Bank{
	abstract public void getBalance();
}

class BankA extends Bank{
	@Override
	public void getBalance() {
		System.out.println("Bank A Balance: $"+100);
	}
}
class BankB extends Bank{
	@Override
	public void getBalance() {
		System.out.println("Bank B Balance: $"+150);
	}
}
class BankC extends Bank{
	@Override
	public void getBalance() {
		System.out.println("Bank C Balance: $"+200);
	}
}

public class M2_30 {
	public static void main(String[] args) {
		BankA A = new BankA();
		BankB B = new BankB();
		BankC C = new BankC();
		
		A.getBalance();
		B.getBalance();
		C.getBalance();
	}
}
