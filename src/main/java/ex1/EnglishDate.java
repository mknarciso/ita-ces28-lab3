package ex1;

public class EnglishDate extends Date {

	public EnglishDate(int day, int month, int year) {
		super(day, month, year);
		// TODO Auto-generated constructor stub
	}

	public String toPrint() {
		return month_ + "/" + day_ + "/" + year_;
	}

}
