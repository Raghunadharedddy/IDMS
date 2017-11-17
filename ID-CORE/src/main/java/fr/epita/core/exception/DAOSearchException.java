/**
 * 
 */
package fr.epita.core.exception;

/**
 * @author Raghu
 *
 */
public class DAOSearchException extends Exception {

	private String saveFault;
	
	public DAOSearchException(String message) {
		this.saveFault = message;
	}

	public String getSaveFault() {
		return saveFault;
	}

}
