/**
 * 
 */
package services;

/**
 * Classe que calcula a taxa de juros nos Estados Unidos
 * 
 * @author Matos - 20.06.2023
 *
 */
public class UsaInterestService implements InterestService {

	private double interestRate;
	
	public UsaInterestService(double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
