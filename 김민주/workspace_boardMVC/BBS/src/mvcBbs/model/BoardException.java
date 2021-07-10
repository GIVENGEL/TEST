package mvcBbs.model;

public class BoardException extends Exception{
	public BoardException() {
		
	}
	public BoardException(String error) {
		super(error);
	}
}
