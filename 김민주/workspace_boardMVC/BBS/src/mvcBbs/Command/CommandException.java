package mvcBbs.Command;

public class CommandException extends Exception{
	
	public CommandException() {
		
	}
	public CommandException(String error) {
		super(error);
	}
}
