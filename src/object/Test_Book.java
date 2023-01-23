package object;


class Book{
	String title;
	String author;
	int page;
	double price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(String title, String author, int page, double price) {
		super();
		this.title = title;
		this.author = author;
		this.page = page;
		this.price = price;
	}
	public String toString() {
		return title+" "+author+" "+page+" "+price;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book b=(Book)obj;
			if(author.compareTo(b.getAuthor()) ==0 
				&& title.compareTo(b.getTitle()) == 0
				&& page==b.getPage()
				&& price==b.getPrice() ) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}
public class Test_Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book("huy", "nguyen", 3, 4.5);
		Book b2=new Book("huy", "nguyen", 3, 4.5);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
	}

}
