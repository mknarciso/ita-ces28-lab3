package ex1;

public class LoveLetter extends Letter{
    protected String city_;
    LoveLetter(Person sender, Person destinatary,
    String city, String content, Date date) {
        super(sender, destinatary, content, date);
        city_ = city;
    }
    public String model() {
    return header() + body() + conclusion() + signature();
    }
    protected String header() {
    return city_ + ", " + date_.toPrint() + "\n\n";
    }
    protected String body() {
    return "Dear " + destinatary_.name() + ",\n" + content_ + "\n";
    }
    protected String conclusion() {
    return "\nWith love,\n";
    }
    protected String signature() {
    return "\n           " + sender_.name();
    }
}