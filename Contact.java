package briglabz.Watch_Service;

public class Contact {
	
	private String FirstName;
	private String LastName;
	private String City;
	private String State;
	private String ZipCode;
	private String PhoneNumber;
	private String EmailId;
	

	public Contact(String FirstName, String LastName, String City, String State, String ZipCode, String PhoneNumber,
			String EmailId) {
		super();
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.City=City;
		this.State=State;
		this.ZipCode=ZipCode;
		this.PhoneNumber=PhoneNumber;
		this.EmailId=EmailId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getLasttName() {
		return LastName;
	}

	public String getCity() {
		return City;
	}

	public String getState() {
		return State;
	}

	public String getZipCode() {
		return ZipCode;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public String getEmailId() {
		return EmailId;
	}
	
	@Override
	public String toString() {
		return "Contact [FirstName=" + FirstName + ", LastName=" + LastName + ", City=" + City + ", State=" + State
				+ ", ZipCode=" + ZipCode + ", PhoneNumber=" + PhoneNumber + ", EmailId=" + EmailId + "]\n";
	}
}
