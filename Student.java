package second;

public class Student {
	private String name;
	private int id;
	private int numCourses;
	private int coursePrice=1000;
	public int getIntuition() {
		return numCourses*coursePrice;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", numCourses=" + numCourses
				+ "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumCourses() {
		return numCourses;
	}
	public void setNumCourses(int numCourses) {
		this.numCourses = numCourses;
	}
	public int getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}
	public Student(String name, int id, int numCourses) {
		
		this.name = name;
		this.id = id;
		this.numCourses = numCourses;
		this.coursePrice = coursePrice;
	}
	

}
