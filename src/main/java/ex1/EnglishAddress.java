package ex1;

public class EnglishAddress extends Address {

	public EnglishAddress(String main) {
		super(main);
	}
	
	public String toPrint() {
		return "Street " + main_;
	}

}
