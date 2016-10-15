package ex1;

class ComercialLetter extends Letter{
    protected Address addressSender_, addressDestiny_;
    ComercialLetter(Person sender, Person destinatary,
    Address addressSender, Address addressDestiny, String content, Date date) {
        super(sender, destinatary, content, date);
        addressSender_ = addressSender;
        addressDestiny_ = addressDestiny;
    }
    public String model() {
    return header() + body() + conclusion() + signature();
    }
    protected String header() {
    return date_.toPrint() + "\n\nFrom: \n  " + sender_.name() + "\n  "
    +
    addressSender_.toPrint() + "\nTo: \n  " + destinatary_.name() +
    "\n  " + addressDestiny_.toPrint() + "\n\n";
    }
    protected String body() {
    return "Dear " + destinatary_.name() + ",\n" + content_ + "\n";
    }
    protected String conclusion() {
    return "\nSincerely,\n";
    }
    protected String signature() {
    return "\n\n __________________\n "
    + sender_.name() + "\n " + sender_.phone() +
    "\n email:" + sender_.email();
    //espaços representam justificação à direita.keep it simple!
    }
}//class Commercial Letter

// o cliente desta classe apenas precisa chamar:
//String lettermodel = CommercialLetter.model();
// agora lettermodel pode ser trabalhada por um editor de texto.