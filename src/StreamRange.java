import java.util.stream.IntStream;

public class StreamRange {
	
	public static void main(String[] args) {
		
		IntStream.range(0, 60) 
		.forEach(System.out::println);
		
	}

}
