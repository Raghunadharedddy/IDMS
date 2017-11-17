/**
 * 
 */
package fr.epita.core.exception;

/**
 * @author Raghu
 *
 */
public class DAOgetIdException extends Exception {
	
private String IdFault;
	
	public DAOgetIdException(String message) {
		this.IdFault = message;
	}

	public String getSaveFault() {
		return IdFault;
	}


}
