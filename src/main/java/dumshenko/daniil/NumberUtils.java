package dumshenko.daniil;

import java.util.List;
import java.util.stream.Collectors;

public class NumberUtils {

    public static int getSum(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public static List<Integer> multiplyOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(num -> (num % 2 != 0) ? num * 2 : num)
                .collect(Collectors.toList());
    }
}
