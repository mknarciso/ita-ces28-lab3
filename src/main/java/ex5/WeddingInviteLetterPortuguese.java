package ex5;

public class WeddingInviteLetterPortuguese extends Letter implements LetterBuilder {

	private Person bFather_, bMother_, gFather_, gMother_, bride_, groom_, receiver_;
    private Date date_;
    private Address cerimonyAddr_, receiverAddr_;
    WeddingInviteLetterPortuguese(){}
    WeddingInviteLetterPortuguese(Person bFather, Person bMother, Person gFather, Person gMother,
            Person receiver ,Person bride , Person groom, Date date, Address cerimonyAddr, 
            Address receiverAddr) {
        bFather_ = bFather;
        bMother_ = bMother;
        gFather_ = gFather;
        gMother_ = gMother;
        receiver_ = receiver;
        bride_ = bride;
        groom_ = groom;
        date_ = date;
        cerimonyAddr_ = cerimonyAddr;
        receiverAddr_ = receiverAddr;
    }
    public String model() {
    return header() + body() + conclusion() + signature();
    }
    public String header() {
    return "Para:\n  " + receiver_.name() + "\n  "+receiverAddr_.toPrint()+"\n\n";
    }
    public String body() {
    return "Estamos honrados em convida-los ao casamento dos nossos filhos\n  "+
    bride_.name() + " & "+ groom_.name() +"\n\n A cerimônia sera em \n" + cerimonyAddr_.toPrint() +
    " em " + date_.toPrint() + "\n\n";
    }
    public String conclusion() {
    return "Por favor, confirme sua presença:" + bride_.phone();
    }
    public String signature() {
    return "\n\n __________________\n "
    + bFather_.name() + ", "+ bMother_.name() + ", "+ gFather_.name()+" and "+ gMother_.name()+".";
    }
    public void addSender(Person sender, Address senderAddr){
    	bride_ = sender;
    	cerimonyAddr_ = senderAddr;
    }
    public void addRelatives(){
    	
    }
    public void addReceiver(Person receiver, Address receiverAddr){
    	receiver_ = receiver;
    	receiverAddr_ = receiverAddr;
    }
	public void addCity(String city) {
		System.out.println("Não é previsto inserir cidade em WeddingInviteLetter");
		
	}
    public void setDate(Date date){
    	date_ = date;
    }
    public void addContent(String content){
    	System.out.println("Não é previsto inserir conteúdo em WeddingInviteLetter");
    }
	@Override
	public void addRelatives(Person groom, Person bFather, Person bMother, Person gFather, Person gMother) {
        bFather_ = bFather;
        bMother_ = bMother;
        gFather_ = gFather;
        gMother_ = gMother;
        groom_ = groom;
	}

}
