package ex1;

public class PortugueseDate extends Date {

	public PortugueseDate(int day, int month, int year) {
		super(day, month, year);
		// TODO Auto-generated constructor stub
	}
	
	public String toPrint() {
		return day_ + "/" + month_ + "/" + year_; 
	}

}
