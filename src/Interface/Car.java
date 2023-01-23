package Interface;

public class Car implements Vehicle {
	String brand;
	public Car(String brand) {
		super();
		this.brand = brand;
	}
	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}
	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return "speeding";
	}
	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "slowing";
	}
	
	
	@Override
	public String turnAlarmOn() {
		// TODO Auto-generated method stub
		return "override";
	}
	@Override
	public String turnAlarmOff() {
		// TODO Auto-generated method stub
		return Vehicle.super.turnAlarmOff();
	}
	public static void main(String[] args) {
		Car car=new Car("honda");
		System.out.println(car.getBrand());
		System.out.println(car.speedUp());
		System.out.println(car.slowDown());
		System.out.println(car.turnAlarmOn());
		System.out.println(car.turnAlarmOff());
	}
	
}
