package ex5;

public class ComercialLetterEnglish extends Letter implements LetterBuilder{
	private Address addressSender_, addressDestiny_;
    public ComercialLetterEnglish(Person sender, Person destinatary,
    Address addressSender, Address addressDestiny, String content, Date date) {
        super(sender, destinatary, content, date);
        addressSender_ = addressSender;
        addressDestiny_ = addressDestiny;
    }
    public ComercialLetterEnglish(){
    	super();
    }
    public String model() {
    	return header() + body() + conclusion() + signature();
    }
    public String header() {
    	return date_.toPrint() + "\n\nFrom: \n  " + sender_.name() + "\n  "
	    +
	    addressSender_.toPrint() + "\nTo: \n  " + destinatary_.name() +
	    "\n  " + addressDestiny_.toPrint() + "\n\n";
    }
    public String body() {
    	return "Dear " + destinatary_.name() + ",\n" + content_ + "\n";
    }
    public String conclusion() {
    	return "\nSincerely,\n";
    }
    public String signature() {
	    return "\n\n __________________\n "
	    + sender_.name() + "\n " + sender_.phone() +
	    "\n email:" + sender_.email();
    }
    public void addSender(Person sender, Address senderAddr){
    	sender_ = sender;
    	addressSender_ = senderAddr;
    }
    public void addReceiver(Person receiver, Address receiverAddr){
    	destinatary_ = receiver;
    	addressDestiny_ = receiverAddr;
    }
	public void addCity(String city) {
		System.out.println("Não é previsto inserir cidade em ComercialLetter");
		
	}

}
