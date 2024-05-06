import java.util.ArrayList;

public class Student {
	private String studentName;
	private int ID;
	private ArrayList<Subject>SubjectGrades;
	
	public Student(String studentName, int iD,ArrayList<Subject>grades) {
		super();
		this.studentName = studentName;
		ID = iD;
		SubjectGrades = grades;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public int getGradeFromGrades(SubjectName subject) {
		for(int i=0;i<SubjectGrades.size();i++) {
			if(SubjectGrades.get(i).getSubjectName()==subject) {
				return SubjectGrades.get(i).getSubjectGrade();
			}
		}
		return -1;
	}
	public void addSubjectToGrades(Subject subject) {
		SubjectGrades.add(subject);
	}
	public void deleteSubjectFromGrades(Subject subject){
		SubjectGrades.remove(subject);
	}
	
	
}
