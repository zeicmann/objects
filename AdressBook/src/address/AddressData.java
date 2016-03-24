package address;

import format.AddressFormat;

public class AddressData {
	private AddressFormat country;
	private String postalCode;
	private String city;
	private String street;
	private String house;
	
	AddressData (AddressFormat country, String postalCode, String city, String street, String house){
		this.country = country;
		this.postalCode = postalCode;
		this.city = city;
		this.street = street;
		this.house = house;
	}
	
	//Getters
	public AddressFormat getCountry(){
		return this.country;
	}
	
	public String getPostalCode(){
		return this.postalCode;
	}
	
	public String getCity(){
		return this.city;
	}
	
	public String getHouse(){
		return this.house;
	}
	
	public String getStreet(){
		return this.street;
	}
	
	public String getAddress(){
		return this.country.getAddress(this);
	}
}
