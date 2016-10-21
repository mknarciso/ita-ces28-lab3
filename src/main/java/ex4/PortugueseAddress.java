package ex4;

public class PortugueseAddress extends Address {

	public PortugueseAddress() {	
	}
	
	@Override
	public String toPrint() {
		return "Rua " + main_;
	}

	@Override
	Address generateAddress(String main) {
		main_ = main;
		return this;
	}

}
