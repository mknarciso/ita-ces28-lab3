package ex1;

public class PortugueseDate extends Date {

	public PortugueseDate() {
		
	}
	
	public String toPrint() {
		return day_ + "/" + month_ + "/" + year_; 
	}

	@Override
	Date generateDate(int day, int month, int year) {
		day_ = day;
		month_ = month;
		year_ = year;
		return this;
	}

}
