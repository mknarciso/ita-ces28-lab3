package ex5;

public class EnglishAddress extends Address {

	public EnglishAddress() {
	}
	
	public String toPrint() {
		return "Street " + main_;
	}

	@Override
	Address generateAddress(String main) {
		main_ = main;
		return this;
	}

}
