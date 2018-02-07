
public class Ticket {
	


	
	
	
	public static int getStandard() {
		return Standard;
	}
	public void setStandard(int standard) {
		Standard = standard;
	}
	public static int getOAP() {
		return OAP;
	}
	public void setOAP(int oAP) {
		OAP = oAP;
	}
	public static int getStudent() {
		return Student;
	}
	public void setStudent(int student) {
		Student = student;
	}
	public int getChild() {
		return Child;
	}
	public void setChild(int child) {
		Child = child;
	}
	public boolean isIswednesday() {
		return iswednesday;
	}
	public void setIswednesday(boolean iswednesday) {
		Ticket.iswednesday = iswednesday;
	}
	public Ticket(int standard, int oAP, int student, int child, boolean iswednesday) {
		super();
		Standard = standard;
		OAP = oAP;
		Student = student;
		Child = child;
		Ticket.iswednesday = iswednesday;
	}
	 static int Standard = 8;
	 static int OAP = 6;
	 static int Student = 6;
	 static int Child = 4;
	 static boolean iswednesday = true;
	


}
