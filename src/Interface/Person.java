package Interface;


public class Person implements Drawable {
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		Drawable.super.draw();
		System.out.println("person draw");
	}
	public static void main(String[] args) {
		Person p=new Person();
		p.draw();
		p.drawInQuote();
	}
}
