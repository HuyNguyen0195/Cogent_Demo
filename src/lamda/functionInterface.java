package lamda;

import java.util.function.Function;
import java.util.function.Predicate;

public class functionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> pr = x -> (x>20);
		System.out.println(pr.test(3));
		
	}

}
