import java.util.Scanner;

public class Booking {

	
public static int Input(String usersInput) {
		
		

		int ticketPrice = 0;

		if (usersInput.equalsIgnoreCase("Standard")) {
			ticketPrice += 8;
		}
		if (usersInput.equalsIgnoreCase("Student")) {
			ticketPrice += 6;
		}
		if (usersInput.equalsIgnoreCase("OAP")) {
			ticketPrice += 6;
		}
		if (usersInput.equalsIgnoreCase("Child")) {
			ticketPrice += 4;
		} else {
			System.out.println("please enter valid ticket name");
		}

		return ticketPrice;
	}
	
}
