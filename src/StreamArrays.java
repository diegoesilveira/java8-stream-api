import java.util.Arrays;

public class StreamArrays {

	public static void main(String[] args) {

		Arrays.stream(new int[] { 0, 1, 2, 3, 4, 5, 10, 11, 50, 51 })
			.max()
			.ifPresent(System.out::println);

		Arrays.stream(new int[] { -1, -10, 0, 1, 2, 3, 4, 5, 10, 11, 50, 51 })
			.min()
			.ifPresent(System.out::println);

		double asDouble = Arrays.stream(new int[] {0, 1, 1, 3, 2, 3, 4, 5, 10, 11, 50, 51 })
			.distinct()
			.average()
			.getAsDouble();
			
		System.out.println("Média array: " +(int)asDouble);
		
		long countArray = Arrays.stream(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
			.count();
		
		System.out.println("Conta quantas posições tem o array: " +countArray);
		
		long sumArrays = Arrays.stream(new int[] { 1, 1, 3, 3, 4, 4, 5, 5, 2, 3, 4, 5, 10, 11, 50, 51 })
			.distinct()
			.sum();
			
		System.out.println("Soma arrays diferentes: " +sumArrays);
		
		

	}

}
