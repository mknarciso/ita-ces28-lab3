package ex5;

public abstract class Date implements Cloneable{
    protected int day_, month_, year_;
    
    abstract Date generateDate(int day, int month, int year);
    
    public String toPrint() {
    	return day_ + "/" +  month_ + "/"+  year_;
    }
    
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
