package ex1;

public abstract class Letter {
    protected Date date_;
    protected Person sender_, destinatary_;
    protected String body_;
    protected String conclusion_;
    protected String signature_;
    protected WriteAPI writeAPI_;
    protected Letter(Person sender, Person destinatary, Date date){
        date_ = date;
        sender_ = sender;
        destinatary_ = destinatary;
    }
    //public abstract void write();	
}