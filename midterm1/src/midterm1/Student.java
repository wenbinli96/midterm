package midterm1;

public class Student extends People{
	private String GradeLevel;
	
	public String getGradeLevel(int Level){
		String GradeLevel= "";
		switch(Level){
		case 1: GradeLevel = "Freshmen";
		break;
		case 2: GradeLevel = "Sophomore";
		break;
		case 3: GradeLevel = "Junior";
		break;
		case 4: GradeLevel = "Senior";
		break;
		}
		return GradeLevel;
	}
	public String setGradeLevel(String GradeLevel){
		return this.GradeLevel;
	}
	public String toString(){
		return this.getName();
		}
}

