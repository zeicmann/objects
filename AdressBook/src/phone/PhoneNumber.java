package phone;

import format.PhoneFormat;

public class PhoneNumber {
	String phoneNumber;
	PhoneFormat format;
	
	PhoneNumber(PhoneFormat format, String phoneNumber){
		this.format = format;
		this.phoneNumber = phoneNumber;
	}
	
	public String getNumber(){
		return format.getPnone(this.phoneNumber);
	}
	
}
