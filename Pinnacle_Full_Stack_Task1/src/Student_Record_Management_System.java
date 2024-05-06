import java.util.ArrayList;

public class Student_Record_Management_System {
	
	private ArrayList<Student>studentArrayList;

	public Student_Record_Management_System(ArrayList<Student> studentArrayList) {
		super();
		this.studentArrayList = studentArrayList;
	}
	
	public void addStudent(Student student) {
		studentArrayList.add(student);
	}
	public void deleteStudent(Student student) {
		studentArrayList.remove(student);
	}
	public ArrayList<Student> getStudentFromName(String Name) {
		ArrayList<Student> tempArrayList=new ArrayList<Student>();
		for(int i =0;i<studentArrayList.size();i++) {
			if(studentArrayList.get(i).getStudentName()==Name) {
				tempArrayList.add(studentArrayList.get(i));				
			}
		}
		return tempArrayList;			
	}
	public ArrayList<Student> getStudentFromID(int id) {
		ArrayList<Student> tempArrayList=new ArrayList<Student>();
		for(int i =0;i<studentArrayList.size();i++) {
			if(studentArrayList.get(i).getID()==id) {
				tempArrayList.add(studentArrayList.get(i));				
			}
		}
		return tempArrayList;		
	}
	public void displayStudent(int id) {
		ArrayList<Student>tempArrayList=new ArrayList<Student>();
		tempArrayList=getStudentFromID(id);
		for(int i =0;i<tempArrayList.size();i++) {
			Student tempStudent=tempArrayList.get(i);
			}
     }
	public static void main(String[] args) {
		Student s1=new Student("Omar", 1, null);
		Student s2=new Student("Emmanuel", 2, null);
		Student s3=new Student("Gamal", 1, null);
		Student s4=new Student("Sane", 1, null);
		

		

		
	}
}
