import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
    private static List<String> name = Arrays.asList("Ivan", "Piter", "Nikita", "Roman", "Vova", "Vika", "Karen");
    String result = getOddIndexNames(name);

    private static String getOddIndexNames(List<String> name) {
        return IntStream.range(0, name.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> i + ". " + name.get(i))
                .collect(Collectors.joining(", "));
    }
}
