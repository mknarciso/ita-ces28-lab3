package ex1;

public class Date {
    protected int day_, month_, year_;
    public Date(int day, int month,int  year){
        day_ = day;
        month_ = month;
        year_ = year;
    }
    
    public String toPrint() {
    	return day_ + "/" +  month_ + "/"+  year_;
    }
}
