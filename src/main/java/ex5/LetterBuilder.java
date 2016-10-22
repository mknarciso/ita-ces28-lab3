package ex5;

public interface LetterBuilder {
    public String model();
    public String header();
    public String body();
    public String conclusion();
    public String signature();
    public void addSender(Person sender, Address senderAddr);
    public void addReceiver(Person receiver, Address receiverAddr);
    public void setDate(Date date);
	public void addContent(String content);
	public void addCity(String city);
	public void addRelatives(Person groomName, Person brideFatherName, Person brideMotherName, 
			Person groomFatherName, Person groomMotherName);
}
