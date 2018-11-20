

public class PersonWithoutBuilderDemo {
	public static void main(String[] args) {
		person sandeep = new person(100, "Sandeep", 0, null, null, null, null, null, null, 0);
		
		System.out.println(sandeep);
	}
}	
	
class person {
	private int id;
	private String firstName;
	private int age;
	private String apartmentName;
	private String street;
	private String landmark;
	private String city;
	private String state;
	private String country;
	private int pinCode;

	public person(int id, String firstName, int age, String apartmentName, String street, String landmark, String city,
			String state, String country, int pinCode) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.age = age;
		this.apartmentName = apartmentName;
		this.street = street;
		this.landmark = landmark;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getApartmentName() {
		return apartmentName;
	}

	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", age=" + age + ", apartmentName=" + apartmentName
				+ ", street=" + street + ", landmark=" + landmark + ", city=" + city + ", state=" + state + ", country="
				+ country + ", pinCode=" + pinCode + "]";
	}
}
