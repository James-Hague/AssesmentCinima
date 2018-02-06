import static org.junit.Assert.*;

import org.junit.Test;

public class TicketTest {

	
	Ticket ticket = new Ticket(8, 6, 6, 4, true) ;
	

	
	@Test
	public void testStandardPrice() {
		
		int expectedPrice = 8; 
		int StanderdT = ticket.getStandard();
		assertEquals(expectedPrice,StanderdT);
		
	
	}
	@Test
	public void testOAPrice() {
		int expectedPrice = 6; 
		int OAPT = ticket.getOAP();
		assertEquals(expectedPrice,OAPT);
	
	}
	@Test
	public void testStudentPrice() {
		int expectedPrice = 6; 
		int StudentT = ticket.getStandard();
		assertEquals(expectedPrice,StudentT);
	
	}
	@Test
	public void testChildPrice() {
		int expectedPrice = 4;
		int ChildT = ticket.getChild();
		assertEquals(expectedPrice,ChildT);
	
	}
	@Test
	public void testISWednesday() {
		
		boolean expectedBoolean = true;
		boolean wednesdayCheck = ticket.isIswednesday();
		assertEquals(expectedBoolean,wednesdayCheck);
		
	}
	@Test
	public void testTotalPrice() {
	
	}
	
	
	
	
	
		

}
