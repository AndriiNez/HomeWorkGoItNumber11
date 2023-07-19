import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    private static List<String> names = Arrays.asList("Ivan", "Piter", "Nikita", "Roman", "Vova", "Vika", "Karen");
    List<String> sortedName = sortNames(names);

    private static List<String> sortNames(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
