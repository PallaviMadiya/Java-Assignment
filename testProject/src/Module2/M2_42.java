/*42)	W.A.J.P to create a custom exception if Customer withdraw amount which is greater 
 than account balance then program will show custom exception otherwise amount will deduct 
 from account balance. Account balance is: 2000 Enter withdraw amount: 2500 Sorry, 
 insufficient balance, you need more 500 Rs. To perform this transaction. */

package Module2;
import java.util.Scanner;

class InsufficientBalanceException extends Exception{

}

public class M2_42{	
	public static void main(String[] args) {
		int withdraw, balance = 10000, remain;
		Scanner sc = new Scanner(System.in);
		System.out.println("Account Balance is "+balance);		
		System.out.print("Enter Withdraw Amount: ");
		withdraw = sc.nextInt();
		try {
			if(withdraw > balance) {
				throw new InsufficientBalanceException();
			}
			else {
				balance = balance - withdraw;
				System.out.println("\nAccount Balance is "+balance);
			}
		}
		catch(InsufficientBalanceException e) {
			remain = balance - withdraw;
			System.out.println("Sorry, insufficient balance, you need more "+Math.abs(remain)+" Rs. To perform this transaction.");
		}
		sc.close();
	}
}
