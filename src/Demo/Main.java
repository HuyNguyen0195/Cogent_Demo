package Demo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car civic = new Car();
		Engine eg = new Engine();
		eg.setType("turbor");

		MusicSystem ms = new MusicSystem();
		ms.setId(1); ms.setType("apple car play");
		
		civic.setEngine(eg); civic.setMs(ms);
		civic.start();
		
		civic.stop();
		civic.music();
	}
	
}
