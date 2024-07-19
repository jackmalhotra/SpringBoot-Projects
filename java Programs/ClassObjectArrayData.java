package ttsttsts;
import java.util.*;

class Student {	
	public int roll_No;
	public String student_name;
}

public class ClassObjectArrayData {

	public static void main(String args[]) {
		// Create objects of class Student
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Students");
		int num = sc.nextInt();

		System.out.println("Enter Students Roll_No & Name");
		// Initialize Student class objects
		Student[] student = new Student[num];
		for (int i=0;i<num;i++) {
			student[i]=new Student();
			student[i].roll_No = sc.nextInt();
			student[i].student_name = sc.nextLine();
		}
		// Print object data
		for (int i=0;i<num;i++) {
			System.out.println("Details: " + student[i].roll_No + " " + student[i].student_name);
		}

	}

}
