import java.util.Iterator;

import java.util.stream.Stream;

public class Task5 {


    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        Iterator<T> zippedIterator = new Iterator<T>() {
            private boolean isFirst = true;

            @Override
            public boolean hasNext() {
                return isFirst || firstIterator.hasNext() || secondIterator.hasNext();
            }

            @Override
            public T next() {
                if (isFirst) {
                    isFirst = false;
                    return firstIterator.next();
                }
                if (firstIterator.hasNext()) {
                    isFirst = true;
                    return secondIterator.next();
                }
                return secondIterator.next();
            }
        };

        return Stream.generate(zippedIterator::next).takeWhile(e -> zippedIterator.hasNext());
    }

    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> second = Stream.of(6, 7, 8);
        Stream<Integer> zippedStream = zip(first, second);
        zippedStream.forEach(System.out::println);
    }
}
