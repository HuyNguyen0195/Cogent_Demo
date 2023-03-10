package Comparable;

public class Student implements Comparable<Student>{
	private int id;
	private String firstName;
	private String lastName;
	public Student(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.id == o.getId()) {
			return 0;
		} else if (this.id < o.getId()) {
			return -1;
		} else {
			return 1;
		}
	}
}
