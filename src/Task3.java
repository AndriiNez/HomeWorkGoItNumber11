import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {
    private static String[] numbers = new String[]{"1, 2, 0", "4, 5"};
    String sortedNumbers = sortNumber(numbers);

    private static String sortNumber(String[] numbers) {
        return Arrays.stream(numbers)
                .flatMap(s -> Arrays.stream(s.split(",\\s*")))
                .map(String::trim)
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
