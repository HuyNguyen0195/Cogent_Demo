package Demo;

public class Car {
	private Engine engine;
	private MusicSystem ms;
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public MusicSystem getMs() {
		return ms;
	}
	public void setMs(MusicSystem ms) {
		this.ms = ms;
	}
	public void start() {
		System.out.println("car has " + this.getEngine().getType() + " start");
	}
	public void stop() {
		System.out.println("car has " + this.getEngine().getType() + " stop");
	}
	public void music() {
		System.out.println("car has "+ this.getMs().getType()+ " audio system");
	}
}
