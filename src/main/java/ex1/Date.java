package ex1;

public class Date {
    protected int day, month, year;
    public Date(int d, int m, int y){
        day = d;
        month = m;
        year = y;
    }
    public String toPrint(){
        return day + "/" + month + "/" + year;
    }
}
