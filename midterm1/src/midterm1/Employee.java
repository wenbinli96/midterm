package midterm1;

import java.util.Date;

public class Employee extends People{
	private String Office;
    private float Salary;
    private Date date_hire;
    
    public void setOffice(String office){
    	this.Office = office;
    	}
    public String getOffice(){
    	return Office;
    }
    public float getSalary(){
    	return Salary;
    	}
    public void setSalary(float salary){
    	this.Salary = salary;
    	}
    public void setHire(Date hire){
        this.date_hire = hire;
    }

    public Date getHire(){
        return this.date_hire;
    }
    public String toString(){
    	return this.getName();
    	}
}
