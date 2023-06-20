/**
 * 
 */
package services;

import java.security.InvalidParameterException;

/**
 * Interface - Servico
 * 
 * @author Matos - 20.06.2023
 *
 */
public interface InterestService {

	double getInterestRate();
	
	//Default method
	default double payment(double amount, int months) {
		
		if(months < 1) {
			throw new InvalidParameterException("Months must be greater then zero.");
		}
		
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
		
	}
}
