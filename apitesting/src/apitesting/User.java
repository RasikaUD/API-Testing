package apitesting;

import java.awt.List;

public class User {
	private String firstName;
	private String lastName;
	private boolean isAlive;
	private Integer age;
	private Address address;
	//private List phoneNumbers;
	private String spouse;	
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public boolean getIsALiveStatus(){
		return isAlive;
	}
	public Integer getAge(){
		return age;
	}
	public Address getAddress(){
		return address;
	}
	/*public List getPhoneNumbers(){
		return phoneNumbers;
	}*/
	public String getSpouse() {
		return spouse;
	}
	

}
