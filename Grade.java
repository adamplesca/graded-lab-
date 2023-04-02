// GradeApp.java
// Adam Plesca
// 14/3/23

//edited since I relised that the code wasn't finished 2/4


public class Grade{
	//data members
	private String grade, ans;
	private int mark;
	//constructor
	public Grade(){
		mark = 0;
		grade = " ";
		ans = " ";
	}
	//setters
	public void setGrade(String grade){
		this.grade = grade;
	}
	public void setAns(String ans){
			this.ans = ans;
	}
	public void setMark(int mark){
			this.mark = mark;
	}
	//compute
	public void compute(){ //added the compute method (if statement)
		if(mark <= 70 || mark >= 100){
			grade = "Distinction";
		}
		else if(mark >= 60 || mark <= 70){
			grade = "Merit 2";
		}
		else if(mark >= 50 || mark <= 60){
			grade = "Merit 1";
		}
		else if(mark >= 40 || mark <= 50){
			grade = "Pass";
		}
		else if(mark <= 40){
			grade = "Fail";
		}
	}
	//getter
	public String getGradeResult(){
		return grade;
	}
}
//added the compute method (if statement) + finished the getter.