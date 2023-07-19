import java.util.*;

import java.util.stream.Stream;

public class Task5 {


    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        List<T> result = new ArrayList<>();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            result.add(firstIterator.next());
            result.add(secondIterator.next());
        }

        Collections.shuffle(result);

        return result.stream();
    }

    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> second = Stream.of(6, 7, 8);
        Stream<Integer> zippedStream = zip(first, second);
        zippedStream.forEach(System.out::println);
    }
}
