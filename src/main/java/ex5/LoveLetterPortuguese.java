package ex5;

public class LoveLetterPortuguese extends Letter implements LetterBuilder {
	private String city_;
    LoveLetterPortuguese(Person sender, Person destinatary,
    String city, String content, Date date) {
        super(sender, destinatary, content, date);
        city_ = city;
    }
    public LoveLetterPortuguese() {
    	super();
	}
	public String model() {
		return header() + body() + conclusion() + signature();
    }
    public String header() {
    	return city_ + ", " + date_.toPrint() + "\n\n";
    }
    public String body() {
    return "Querido " + destinatary_.name() + ",\n" + content_ + "\n";
    }
    public String conclusion() {
    return "\nCom amor,\n";
    }
    public String signature() {
    return "\n           " + sender_.name();
    }
    public void addSender(Person sender, Address senderAddr){
    	sender_ = sender;
    }
    public void addReceiver(Person receiver, Address receiverAddr){
    	destinatary_ = receiver;
    }
	public void addCity(String city) {
		city_ = city;
	}

}
