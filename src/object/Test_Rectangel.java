package object;
import java.util.Scanner;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;


class Rectangel{	
	int lenght;
	int breadth;
	int area;
	
	
	public int getLenght() {
		return lenght;
	}


	public void setLenght(int lenght) {
		this.lenght = lenght;
	}


	public int getBreadth() {
		return breadth;
	}


	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}


	public int getArea() {
		return area;
	}


	public void setArea(int area) {
		this.area = area;
	}

	public Rectangel(int lenght, int breadth, int area) {
		super();
		this.lenght = lenght;
		this.breadth = breadth;
		this.area = area;
	}

	public String toString() {
		return "Rectangle"+"-lenght:"+lenght+"-breadth:"+breadth+"-area:"+area;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Rectangel) {
			Rectangel t=(Rectangel)obj;
			if(lenght==t.getLenght() && breadth==t.getBreadth() && area == t.getArea()) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}

}

public class Test_Rectangel{
	public static void main(String[] args) {
		Rectangel r1=new Rectangel(1, 2, 3);
		Rectangel r2=new Rectangel(1, 2, 3);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println("==:"+(r1==r2));
		System.out.println("equal:"+(r1.equals(r2)));
	}
}

