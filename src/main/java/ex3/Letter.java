package ex3;

public abstract class Letter {
    protected Date date_;
    protected Person sender_, destinatary_;
    protected String body_;
    protected String content_;
    protected String conclusion_;
    protected String signature_;
    protected Letter(Person sender, Person destinatary, String content, Date date){
        date_ = date;
        content_ = content;
        sender_ = sender;
        destinatary_ = destinatary;
    }
    protected Letter(){}
    public void setDate(Date date){
    	date_ = date;
    }
    public void addContent(String content){
    	content_ = content;
    }
    
    
}