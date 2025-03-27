package model.exceptions;

// Exception o compilador obriga a tratar
//RuntimeException o compilado nao obriga o tratamento 
public class DomainException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public DomainException (String msg) {
		super(msg);
	}

}
