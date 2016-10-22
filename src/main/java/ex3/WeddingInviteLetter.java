package ex3;

public class WeddingInviteLetter implements LetterBuilder{
    private Person bFather_, bMother_, gFather_, gMother_, bride_, groom_, receiver_;
    private Date date_;
    private Address cerimonyAddr_, receiverAddr_;
    WeddingInviteLetter(Person bFather, Person bMother, Person gFather, Person gMother,
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
    return "To:\n  " + receiver_.name() + "\n  "+receiverAddr_.toPrint()+"\n\n";
    }
    public String body() {
    return "We are honored to invite you to the wedding of our sons\n  "+
    bride_.name() + " & "+ groom_.name() +"\n\n The cerimony will be at \n" + cerimonyAddr_.toPrint() +
    " on " + date_.toPrint() + "\n\n";
    }
    public String conclusion() {
    return "Please confirm your presence:" + bride_.phone();
    }
    public String signature() {
    return "\n\n __________________\n "
    + bFather_.name() + ", "+ bMother_.name() + ", "+ gFather_.name()+" and "+ gMother_.name()+".";
    }
}
