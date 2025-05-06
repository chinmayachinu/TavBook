package stream;

import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {

        //Stream.generate(() -> "chinmaya").forEach(System.out::println); // generate the value infinite time
        Stream.generate(() -> "chinmaya").limit(10).forEach(System.out::println); // so here we limited to generate the value 10 times.

        Stream<String> stream = Stream.of("Chinmaya", "Satya", "Ronny");

        //Stream.iterate(2, i -> i + 1).forEach(System.out::println); // infinite times
        Stream.iterate(2, i -> i + 1).limit(10).forEach(System.out::println); // limit to 10 , start with seed value 2

        Stream.iterate(0, i -> i < 10, i -> i + 1)
                .forEach(System.out::println);
    }
}
