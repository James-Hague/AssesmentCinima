import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Enter your requested tickets ");
		Scanner scanner = new Scanner(System.in);
		String usersInput = scanner.nextLine();
		
		
		Booking.Input(usersInput);

		

		List<Integer> cinemaTickets = new ArrayList<>();

		Boolean isWednesday = Boolean.TRUE;

		cinemaTickets.add(Ticket.getStandard());
		cinemaTickets.add(Ticket.getOAP());
		cinemaTickets.add(Ticket.Student);
		cinemaTickets.add(Ticket.Child);

		int ticketTotal = 0;

		for (int value : cinemaTickets) {
			if (isWednesday) {
				ticketTotal = ticketTotal + value - 2;
			} else {
				ticketTotal = ticketTotal + value;
			}

		}
		System.out.println("test" + ticketTotal);
	}

	

}
