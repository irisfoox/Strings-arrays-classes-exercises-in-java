package second;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //staff & students in college: for staff members-receive brute salary
		//and reduce 30% tax , for student calculate intuition=num of courses*1000
		//per course
		String a=JOptionPane.showInputDialog("write teacher's name");
		String b=JOptionPane.showInputDialog("write teacher's id");
		int c=Integer.parseInt((JOptionPane.showInputDialog("write teacher's salary")));
		Staff teacher0=new Staff(a,b,c);
		a=JOptionPane.showInputDialog("write teacher's name");
		b=JOptionPane.showInputDialog("write teacher's id");
		c=Integer.parseInt((JOptionPane.showInputDialog("write teacher's salary")));
		Staff teacher1=new Staff(a,b,c);
		Staff[] staff= new Staff[2];
		staff[0]=teacher0;
		staff[1]=teacher1;
		for(int i=0;i<staff.length;i++) {
			System.out.println(staff[i].toString());
			System.out.println("neto salary: "+staff[i].getNeto(staff[i].getBruSalary()));
		}
		Student s0=new Student("gadi",1111,0);
		Student s1=new Student("meir",22222,0);
		Student[] students=new Student[2];
		students[0]=s0;
		students[1]=s1;
		for(int i=0;i<students.length;i++) {
			c=Integer.parseInt(JOptionPane.showInputDialog("write num of courses for student "+students[i].getName()+students[i].getId()));
            students[i].setNumCourses(c);
			System.out.println(students[i].toString());
			System.out.println("intuition: "+students[i].getIntuition());
		}
	}

}
