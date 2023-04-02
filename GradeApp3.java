// GradeApp3.java (Sential control loop)
// Adam Plesca
// 14/3/23

//edited since I relised that the code wasn't finished 2/4/23



import javax.swing.JOptionPane;
public class GradeApp3{
	public static void main(String args[]){

		String grade, ans;
		int mark;

		Grade myGrade = new Grade();

		do{

			mark = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a mark"));
			myGrade.setMark(mark);

			myGrade.compute();

			grade = myGrade.getGradeResult(); //edited the getting name to getGradeResult
			if(grade.equalsIgnoreCase("Error")){
				JOptionPane.showMessageDialog(null, "Sorry, you entered an invalid mark");
			}
			else{
				JOptionPane.showMessageDialog(null, "That grade is "+grade);
			}
			ans = JOptionPane.showInputDialog(null, "would you like to enter another grade, enter yes or no");
		}while(ans.equalsIgnoreCase("yes"));
	}



}