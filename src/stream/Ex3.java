package stream;

import java.util.Arrays;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Stream", "GUI", "Java"); 
		boolean anyMatch = names.stream() 
				.anyMatch(name -> name.contains("a"));  //한 요소
		boolean allMatch = names.stream() 
				.allMatch(name -> name.length() <= 3); // 모든 요소
		boolean noneMatch = names.stream() 
				.noneMatch(name -> name.endsWith("s")); // 모든 요소 만족 X

		System.out.println(anyMatch);
		System.out.println(allMatch);
		System.out.println(noneMatch);
	}

}
