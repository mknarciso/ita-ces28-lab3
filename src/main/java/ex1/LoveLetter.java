package ex1;

public class LoveLetter extends Letter implements LetterBuilder{
    protected String city_;
    LoveLetter(Person sender, Person destinatary,
    String city, String content, Date date) {
        super(sender, destinatary, content, date);
        city_ = city;
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
}