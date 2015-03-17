package midterm1;

public class Staff extends People{
	private String Title;
	
	public Staff(String title){
		this.Title = title;
		}
	public String getTitle(){
		return Title;
		}
	public void setTitle(String title){
		this.Title =title;
		}
	 public String toString(){
	    	return this.getName();
	    	}
	
}
