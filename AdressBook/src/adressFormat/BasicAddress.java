package adressFormat;

abstract class BasicAddress{
	
	private String postalCode;
	private String city;
	private String street;
	private String house;
	
	public String getPostalCode(){
		return this.postalCode;
	}
	
	public String getCity(){
		return this.city;
	}
	
	public String getStreet(){
		return this.street;
	}
	
	public String getHouse(){
		return this.house;
	}
	
	BasicAddress(String city, String postalCode, String street, String house){
		this.city = city;
		this.postalCode = postalCode;
		this.street = street;
		this.house = house;
	}
		
	public abstract String toString();
}
