import java.time.*;
import java.util.*;

public class DriversLicense {
	
	// Attributes
	public String firstName;
	public String lastName;
	public HashMap<String, Integer> dob;
	public String height;
	public String gender;
	
	// Constructor
	public DriversLicense(String myFirstName, String myLastName, HashMap<String, Integer> myDob) {
		firstName = myFirstName;
		lastName = myLastName;
		dob = myDob;
	}
	
	
	// Methods
	
	// Return full name
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	// Return age based on DOB
	public int getAge() {
		LocalDate today = LocalDate.now(); // today's date
		
		LocalDate birthday = LocalDate.of(dob.get("year"), dob.get("month"), dob.get("day")); // date of birth
		
		Period period = Period.between(birthday, today);
		
		int age = period.getYears();
		
		return age;
	}
}
