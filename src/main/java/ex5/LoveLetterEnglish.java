package ex5;

public class LoveLetterEnglish extends Letter  implements LetterBuilder {
    private String city_;
    LoveLetterEnglish(Person sender, Person destinatary,
    String city, String content, Date date) {
        super(sender, destinatary, content, date);
        city_ = city;
    }
    public LoveLetterEnglish() {
    	super();
	}
	public String model() {
		return header() + body() + conclusion() + signature();
    }
    public String header() {
    	return city_ + ", " + date_.toPrint() + "\n\n";
    }
    public String body() {
    	return "Dear " + destinatary_.name() + ",\n" + content_ + "\n";
    }
    public String conclusion() {
    	return "\nWith love,\n";
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
