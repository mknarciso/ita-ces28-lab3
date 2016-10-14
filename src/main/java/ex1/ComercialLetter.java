package ex1;

class ComercialLetter extends Letter{
    ComercialLetter(Person sender, Person destinatary,
    Address addressSender, Address addressDestiny, Date date) {
    // armazena todos os dados necessarios
    }
    public String model() {
    return header() + body() + conclusion() + signature();
    }
    protected String header() {
    return date_.toPrint() + "\n\n" + sender_.name() + "\n"
    +
    addressSender_.toPrint() + "\n" + destinatary_.name() +
    addressDestiny_.toPrint() + "\n";
    }
    protected String body() {
    return "Dear " + destinatary_.name() + "\n" ;
    }
    protected String conclusion() {
    return "\nSincerely,\n";
    }
    protected String signature() {
    return "\n\n __________________\n"
    + sender_.name() + "\n " + sender.phone().toPrint() +
    "\n email:" + sender.email();
    //espaços representam justificação à direita.keep it simple!
    }
}//class Commercial Letter

// o cliente desta classe apenas precisa chamar:
//String lettermodel = CommercialLetter.model();
// agora lettermodel pode ser trabalhada por um editor de texto.