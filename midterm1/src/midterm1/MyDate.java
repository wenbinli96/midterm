package midterm1;

public class MyDate extends People{
	private int year;
	private int month;
	private int day;
	
	public void setYear(int Year){
        this.year = Year;
    }

    public int getYear(){
        return this.year;
    }
    
    public void setMonth(int Month){
        this.month = Month;
    }

    public int getMonth(){
        return this.month;
    }
    public void setDay(int Day){
    	this.day = Day;
    }
    public int getDay(){
    	return this.day;
    }
    public String toString(){
    	return this.getName();
    	}
}
