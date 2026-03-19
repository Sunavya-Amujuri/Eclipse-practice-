package practice;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> al = List.of(4, 6, 7, 5, 2, 9, 1);
		
//		Predicate<Integer> isOff = new Predicate<Integer>() {
//			public boolean test(Integer num) {
//				return num % 2 == 1;
//			}
//		};
		
		//or
		
	//	Predicate<Integer> isOff = num -> num % 2 == 1;
	//  Stream<Integer> s2 = s1.filter(isOff);
		
		// or
		
//		Stream<Integer> s1 = al.stream();
//		Stream<Integer> s2 = s1.filter(num -> num % 2 == 1);
//		Stream<Integer> s3 = s2.map(num -> num*2);
//		int total = s3.reduce(0, (c, e) -> c+e);
//		System.out.println(total);

//		s3.forEach(n -> System.out.println(n));
		//s2.forEach(System.out::println);
		
		// or simply do 
		
		int total = al.stream()
				.filter(num -> num % 2 == 1)
				.map(num -> num*2)
				.reduce(0, (c, e) -> c+e);
		System.out.println(total);
	}

}
