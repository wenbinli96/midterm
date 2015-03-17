package midterm1;

public class Faculty extends People{
	private String Office_Hours;
	private String Rank;
	
	public void setofficeHours(String officeHours){
        this.Office_Hours = officeHours;
    }

    public String getofficeHours(){
        return this.Office_Hours;
    }
    
    public void setrank(String rank){
        this.Rank = rank;
    }

    public String getrank(){
        return this.Rank;
    }
    public String toString(){
    	return this.getName();
    	}
}
