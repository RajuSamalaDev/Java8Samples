/**
 * 
 */
package com.java8.samples;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * @author Raju
 *
 */
public class PredicateDemo {

	
	public static void main(String[] args) {
		IntStream numbers = IntStream.range(1, 10);
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		System.out.println(sumTotal2(values,e -> true));
		System.out.println(sumTotal2(values,e -> e % 2 == 0));
		System.out.println(sumTotal2(values,e -> e % 2 !=0));
		
		
	}
	
	public static int sumTotal(List<Integer> numbers, Predicate<Integer> selector){
		int total = 0 ;
		for(int num :numbers){
			if(selector.test(num))
				total += num;
		}
		return total;
		
	}
	
	public static int sumTotal2(List<Integer> numbers, Predicate<Integer> selector){
		return numbers.stream()
					  .filter(selector)
					  .reduce(0, (c,e) -> c+e);
	}

}
