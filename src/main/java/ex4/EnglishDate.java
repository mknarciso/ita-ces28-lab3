package ex4;

public class EnglishDate extends Date {

	public EnglishDate() {
		
	}
	
	
	public String toPrint() {
		return month_ + "/" + day_ + "/" + year_;
	}
	@Override
	Date generateDate(int day, int month, int year) {
		day_ = day;
		month_ = month;
		year_ = year;
		return this;
	}

}
