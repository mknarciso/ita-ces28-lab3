package ex5;

public abstract class Address implements Cloneable {
    protected String main_;
    
    public String toPrint(){
        return main_;
    }
    
    abstract Address generateAddress(String main);
    
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
