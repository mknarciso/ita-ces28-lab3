package ex1;

public interface WriteAPI {
    public void writeProfessional(Person sender, Person destinatary, Address addressSender,
    Address addressDestiny, Date date);
    public void writePersonal(Person sender, Person destinatary, Date date);
    public String model();
    protected String header();
    protected String body();
    protected String conclusion();
    protected String signature();
}
