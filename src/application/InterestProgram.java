/**
 * 
 */
package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrasilInterestService;
import services.InterestService;

/**
 * @author Matos
 *
 */
public class InterestProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		
		System.out.print("Meses: ");
		int months = sc.nextInt();
		
		InterestService interestService = new BrasilInterestService(2.0);
		double payment = interestService.payment(amount, months);
		
		System.out.println("Payment after to " + months + " months: ");
		System.out.println(String.format("%.2f", payment));
		
		sc.close();

	}

}
