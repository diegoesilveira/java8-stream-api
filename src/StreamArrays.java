import java.util.Arrays;

public class StreamArrays {

	public static void main(String[] args) {

		Arrays.stream(new int[] { 0, 1, 2, 3, 4, 5, 10, 11, 50, 51 })
		.max()
		.ifPresent(System.out::println);

		Arrays.stream(new int[] { 0, 1, 2, 3, 4, 5, 10, 11, 50, 51 })
		.min()
		.ifPresent(System.out::println);

		Arrays.stream(new int[] { 1, 2, 3, 4, 5, 10, 11, 50, 51 })
		.average()
		.ifPresent(System.out::println);

	}

}
