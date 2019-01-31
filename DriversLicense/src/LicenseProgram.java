import java.util.*;

public class LicenseProgram {

	public static void main(String[] args) {

		// Instantiate drivers license 1
		HashMap<String, Integer> dl1Map = new HashMap<String, Integer>();
		dl1Map.put("year", 1985);
		dl1Map.put("month", 8);
		dl1Map.put("day", 14);
		DriversLicense dl1 = new DriversLicense("Rick", "Ross", dl1Map);
		
		// Instantiate drivers license 1
		HashMap<String, Integer> dl2Map = new HashMap<String, Integer>();
		dl2Map.put("year", 1965);
		dl2Map.put("month", 1);
		dl2Map.put("day", 1);
		DriversLicense dl2 = new DriversLicense("Jane", "Doe", dl2Map);
		
		// Instantiate drivers license 1
		HashMap<String, Integer> dl3Map = new HashMap<String, Integer>();
		dl3Map.put("year", 1977);
		dl3Map.put("month", 11);
		dl3Map.put("day", 21);
		DriversLicense dl3 = new DriversLicense("John", "Doe", dl3Map);
		
		// Print names and ages
		System.out.println(dl1.getFullName() + " " + dl1.getAge());
		System.out.println(dl2.getFullName() + " " + dl2.getAge());
		System.out.println(dl3.getFullName() + " " + dl3.getAge());
		
	}

}
