package lamda;

import java.util.Date;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Supplier;

public class Demo {
	
	public void method1(int x) {
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Date> date=()->new Date();
		System.out.println("date: "+date.get());
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		StringBuffer sb=new StringBuffer();
		sb.append(sc.next());
		
	Function<StringBuffer, StringBuffer> reverse=s->s.reverse();
		System.out.println(reverse.apply(sb));
		MyInterface mi=x->System.out.println(x);
		mi.method(10);
		Demo dm=new Demo();
		MyInterface m1=dm::method1;
		m1.method(30);
		
		
	}

}
