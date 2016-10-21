package ex4;

public abstract class Date {
    protected int day_, month_, year_;
    
    abstract Date generateDate(int day, int month, int year);
    
    public String toPrint() {
    	return day_ + "/" +  month_ + "/"+  year_;
    }
}
