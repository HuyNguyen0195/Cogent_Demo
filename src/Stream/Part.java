package Stream;

import java.util.stream.Stream;

public class Part {
	String name;
	int weight;
	int number;
	int price;
	int quantity;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Part(String name, int weight, int number, int price, int quantity) {
		super();
		this.name = name;
		this.weight = weight;
		this.number = number;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Part [name=" + name + ", weight=" + weight + ", number=" + number + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
	
	public static void main(String[] args) {
		Stream<Part> partStream= Stream.of(
				new Part("pen", 10, 10, 10, 10),
				new Part("ruler", 10, 10, 10, 10),
				new Part("pencil", 10, 10, 10, 10)
				);
		partStream.forEach( x -> System.out.println(x) );
		System.out.println(partStream);
	}
}
