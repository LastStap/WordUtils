package dumshenko.daniil;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberUtilsTest {

    @Test
    void shouldCalculateSumOfNumbers() {
        // Given
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // When
        int result = NumberUtils.getSum(numbers);

        // Then
        assertEquals(15, result, "Sum should be 15");
    }

    @Test
    void shouldHandleEmptyListWhenCalculatingSum() {
        // Given
        List<Integer> numbers = new ArrayList<>();

        // When
        int result = NumberUtils.getSum(numbers);

        // Then
        assertEquals(0, result, "Sum of an empty list should be 0");
    }

    @Test
    void shouldMultiplyOddNumbers() {
        // Given
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // When
        List<Integer> result = NumberUtils.multiplyOddNumbers(numbers);

        // Then
        List<Integer> expected = Arrays.asList(2, 2, 6, 4, 10);
        assertEquals(expected, result, "Multiplied odd numbers should match the expected list");
    }

    @Test
    void shouldHandleEmptyListWhenMultiplyingOddNumbers() {
        // Given
        List<Integer> numbers = new ArrayList<>();

        // When
        List<Integer> result = NumberUtils.multiplyOddNumbers(numbers);

        // Then
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, result, "Multiplying an empty list should return an empty list");
    }

    @Test
    void shouldReturnSameListWhenNoOddNumbers() {
        // Given
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8);

        // When
        List<Integer> result = NumberUtils.multiplyOddNumbers(numbers);

        // Then
        List<Integer> expected = Arrays.asList(2, 4, 6, 8);
        assertEquals(expected, result, "List with no odd numbers should remain unchanged");
    }
}
