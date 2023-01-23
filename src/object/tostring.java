package object;

import java.util.Objects;

class Person{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
}
public class tostring {
	public static void main(String[] args) {
		Person p1=new Person("huy",10);
		Person p2=new Person("huy",10);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
		System.out.println("s"=="s");
	}
}
