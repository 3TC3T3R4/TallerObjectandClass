package account;
/**
 * Represents a bank account with its elements.
 * @authot Estevan Tangarife Correa.
 */
public class BankAccount {
	
	/**
	 * Represents a variable, Is the account number.
	 */
	private  int accountNumber;
	/**
	 * Represents a variable, It is to know if it is activated account.
	 */
	protected boolean activated;
	/**
	 * Represent the method to get the variable activated.
	 * @return Variable activated of class.
	 */
	public boolean isActivated() {
		return activated;
	}
	/**
	 * Represent the method to modify the variable.
	 * @param activated Variable of class
	 */
	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	
	
	
}
