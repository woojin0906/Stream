package stream;

import java.util.Optional;

public class Ex1 {

	public static void main(String[] args) {
		
		//Optional<String> opt = null;
		Optional<String> opt = Optional.empty();
		System.out.println("opt=" + opt);
		
		String str = "";
		
		str = opt.orElse("Null"); // Optional에 저장된 값이 null이면 지정한 값 반환
		//str = opt.orElseGet(()->"Null");
		System.out.println("str=" + str);
	
		}

}
