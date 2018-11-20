package designpatterns;

class Person {
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
	
	private Person(PersonBuilder personBuilder) {
		this.id = personBuilder.id;
		this.firstName = personBuilder.firstName;
		this.age = personBuilder.age;
		this.apartmentName = personBuilder.apartmentName;
		this.street = personBuilder.state;
		this.landmark = personBuilder.landmark;
		this.city = personBuilder.city;
		this.state = personBuilder.state;
		this.country = personBuilder.country;
		this.pinCode = personBuilder.pinCode;
	}
	
	public static class PersonBuilder {
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
		
		public PersonBuilder id(int id) {
			this.id = id;
			return this;
		}
			
		public PersonBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public PersonBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public PersonBuilder apartmentName(String apartmentName) {
			this.apartmentName = apartmentName;
			return this;
		}
		
		public PersonBuilder street(String street) {
			this.street = street;
			return this;
		}
		
		public PersonBuilder landmark(String landmark) {
			this.landmark = landmark;
			return this;
		}
		
		public PersonBuilder city(String city) {
			this.city = city;
			return this;
		}
		
		public PersonBuilder country(String country) {
			this.country = country;
			return this;
		}
		
		public PersonBuilder country(int pinCode) {
			this.pinCode = pinCode;
			return this;
		}
		
		public Person build() {
			return new Person(this);
		}
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", age=" + age + ", apartmentName=" + apartmentName
				+ ", street=" + street + ", landmark=" + landmark + ", city=" + city + ", state=" + state + ", country="
				+ country + ", pinCode=" + pinCode + "]";
	}
}


public class PersonBuilderDemo {

	public static void main(String[] args) {
		Person sandeep = new Person.PersonBuilder().id(100).firstName("sandeep").build();
		
		System.out.println(sandeep);
		
	}
}