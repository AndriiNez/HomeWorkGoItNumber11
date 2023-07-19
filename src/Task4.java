import java.util.stream.Stream;

public class Task4 {
    private static long seed = 1L;
    private static long a = 25214903917L;
    private static long c = 11L;
    private static long m = (long) Math.pow(2, 48);
    Stream<Long> randomNumbers = generateRandomNumbers(seed, a, c, m);

    private static Stream<Long> generateRandomNumbers(long seed, long a, long c, long m) {
        return Stream.iterate(seed, n -> (a * n + c) % m);
    }

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        task4.randomNumbers.forEach(System.out::println);

    }
}
