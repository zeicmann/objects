package format;

import phone.BasicPhoneInt;

public enum PhoneFormat implements BasicPhoneInt{
	
	country1{
		public String getPnone(String phone) {
			return phone.substring(0, 1) + "-" + phone.substring(1, 4) +
					"-" + phone.substring(4, 6) + "-" + phone.substring(6, 8) + "-" + 
					phone.substring(8);
		}
		public int getDigits() {
			return 10;
		}
	},
	country2{
		public String getPnone(String phone) {
			return phone.substring(0, 5) + "-" + phone.substring(5, 9) + "-" + phone.substring(8);
		}
		public int getDigits() {
			return 10;
		}
	}
}