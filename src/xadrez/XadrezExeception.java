package xadrez;

public class XadrezExeception extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public XadrezExeception (String msg) {
		super(msg); 
	}

}
