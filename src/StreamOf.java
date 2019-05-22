import java.util.stream.Stream;

public class StreamOf {
	
	public static void main(String[] args) {
		
		Stream.of("a1", "a2", "a3")
	    	.map(s -> s.substring(1))
	    	.mapToInt(Integer::parseInt)
	    	.max()
	    	.ifPresent(System.out::println);
		
		System.out.println("---------------------------------------------");
		
		Stream.of(1.0, 2.0, 3.0)
	    	.mapToInt(Double::intValue)
	    	.mapToObj(i -> "a" + i)
	    	.forEach(System.out::println);

		System.out.println("---------------------------------------------");
			     
	    Stream.of("d2", "a2", "b1", "b3", "c")
	    	.filter(s -> {
	    		System.out.println("filter: " + s);
	        return true;
	    })
	    	.forEach(s -> System.out.println("forEach: " + s));
	  
		System.out.println("---------------------------------------------");

	    Stream.of("d2", "a2", "b1", "b3", "c")
	    	.map(s -> {
	    		System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    	.anyMatch(s -> {
	    		System.out.println("anyMatch: " + s);
	        return s.startsWith("A");
	    });

	}
	

}
