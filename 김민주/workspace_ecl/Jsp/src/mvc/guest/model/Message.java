package mvc.guest.model;

public class Message {
	private int messageId;
	private String guestName;
	private String password;
	private String message;
	
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	// 매개변수를 받는 생성자를 만든다면 꼭 디폴트생성자 만들어주자.
	public Message() {}
	
	public Message(int messageId, String guestName, String password, String message) {
		super();
		this.messageId = messageId;
		this.guestName = guestName;
		this.password = password;
		this.message = message;
	}
	
	
	
}
