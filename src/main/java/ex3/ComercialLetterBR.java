package ex3;

class ComercialLetterBR extends Letter implements LetterBuilder{
    private Address addressSender_, addressDestiny_;
    public ComercialLetterBR(Person sender, Person destinatary,
    Address addressSender, Address addressDestiny, String content, Date date) {
        super(sender, destinatary, content, date);
        addressSender_ = addressSender;
        addressDestiny_ = addressDestiny;
    }
    public ComercialLetterBR(){
    	super();
    }
    public String model() {
    return header() + body() + conclusion() + signature();
    }
    public String header() {
    return date_.toPrint() + "\n\nRemetente: \n  " + sender_.name() + "\n  "
    +
    addressSender_.toPrint() + "\nDestinatário: \n  " + destinatary_.name() +
    "\n  " + addressDestiny_.toPrint() + "\n\n";
    }
    public String body() {
    return "Caro " +destinatary_.treatment() +" "+ destinatary_.name() + ",\n" + content_ + "\n";
    }
    public String conclusion() {
    return "\nAtenciosamente,\n";
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