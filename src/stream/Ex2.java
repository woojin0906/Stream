package stream;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex2 {

	public static void main(String[] args) {
		String[] strArr = {
				"Java", "Lambda", "stream",
				"Optional", "IntStream", "count", "sum"
				};
		
		Stream.of(strArr)
		//.parallel()  // 병렬로 처리
		.forEach(System.out::println);
		//.forEachOrdered(System.out::println);
		
		System.out.println("====================");
		
		boolean noEmptyStr = Stream.of(strArr).noneMatch(s->s.length()==0);
		System.out.println("noEmptyStr=" + noEmptyStr);
		
		System.out.println("====================");
		
		Optional<String> sWord = Stream.of(strArr)
				.filter(s->s.charAt(0)=='s')
				.findFirst();
				//.parallel()
				//.findAny();
	
		System.out.println("sWord=" + sWord.get());
		
		System.out.println("====================");
		
		// String::length   ==  (s) -> s.length()
		IntStream intS1 = Stream.of(strArr).mapToInt(String::length);
		IntStream intS2 = Stream.of(strArr).mapToInt(String::length);
		IntStream intS3 = Stream.of(strArr).mapToInt(String::length);
		IntStream intS4 = Stream.of(strArr).mapToInt(String::length);

		int count = intS1.reduce(0, (a,b) -> a + 1);
		int sum = intS2.reduce(0, (a,b) -> a + b);
		OptionalInt max = intS3.reduce(Integer::max);
		OptionalInt min = intS4.reduce(Integer::min);
		
		System.out.println("count=" + count);
		System.out.println("sum=" + sum);
		System.out.println("max=" + max.orElse(0));
		System.out.println("min=" + min.orElse(0));
	}
}

