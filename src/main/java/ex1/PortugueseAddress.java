package ex1;

public class PortugueseAddress extends Address {

	public PortugueseAddress(String main) {
		super(main);
		
	}
	
	@Override
	public String toPrint() {
		return "Rua " + main_;
	}

}
