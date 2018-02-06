
public class Ticket {
	
	
	public int getStandard() {
		return Standard;
	}
	public void setStandard(int standard) {
		Standard = standard;
	}
	public int getOAP() {
		return OAP;
	}
	public void setOAP(int oAP) {
		OAP = oAP;
	}
	public int getStudent() {
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
		this.iswednesday = iswednesday;
	}
	public Ticket(int standard, int oAP, int student, int child, boolean iswednesday) {
		super();
		Standard = standard;
		OAP = oAP;
		Student = student;
		Child = child;
		this.iswednesday = iswednesday;
	}
	private int Standard = 8;
	private int OAP = 6;
	private int Student = 6;
	private int Child = 4;
	private boolean iswednesday = true;
	
	


}
