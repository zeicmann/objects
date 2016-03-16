package adressFormat;

class AddressCountry1 extends BasicAddress{
	
	AddressCountry1(String city, String postalCode, String street, String house) {
		super(city, postalCode, street, house);
	}

	@Override
	public String toString() {
		return  "Postal code: " + this.getPostalCode() + "Country: Country1" +
				", city: " + this.getCity() + ", house: " + this.getHouse();
	}
}
