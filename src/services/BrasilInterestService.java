/**
 * 
 */
package services;

/**
 * Classe que calcula a taxa de juros no Brasil
 * 
 * @author Matos - 20.06.2023
 *
 */
public class BrasilInterestService implements InterestService {

	private double interestRate;
	
	public BrasilInterestService(double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
