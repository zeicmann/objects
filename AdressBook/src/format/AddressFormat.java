package format;

import address.AddressData;
import address.BasicAddressInt;

public enum AddressFormat implements BasicAddressInt{
	country1{
		public String getAddress(AddressData address) {
			return "Postal code: " + address.getPostalCode() +
					", Country: " + address.getCountry().toString() +
					", city: " + address.getCity() + ", street: " +
					address.getStreet() + ", house: " + address.getHouse();
		}
	},
	country2{
		public String getAddress(AddressData address){
			return "House: " + address.getHouse() + ", street: " + address.getStreet() +
					", city: " + address.getCity() + ", postal code: " 
					+ address.getPostalCode() +", Country: " 
					+ address.getCountry().toString();
		}
	}
}
