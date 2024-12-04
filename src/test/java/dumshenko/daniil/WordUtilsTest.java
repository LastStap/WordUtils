package dumshenko.daniil;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordUtilsTest {

    @Test
    void shouldReturnShortestWord() {
        // Given
        List<String> words = Arrays.asList("apple", "banana", "cat", "dog", "elephant");

        // When
        String result = WordUtils.getShortestWord(words);

        // Then
        assertEquals("cat", result, "Shortest word should be 'cat'");
    }

    @Test
    void shouldHandleEmptyListWhenFindingShortestWord() {
        // Given
        List<String> words = new ArrayList<>();

        // When
        String result = WordUtils.getShortestWord(words);

        // Then
        assertEquals("No words provided", result, "Should handle empty list gracefully");
    }

    @Test
    void shouldReturnUniqueWords() {
        // Given
        String sentence = "apple banana cat dog apple cat dog";

        // When
        Set<String> result = WordUtils.getUniqueWords(sentence);

        // Then
        Set<String> expected = new HashSet<>(Arrays.asList("apple", "banana", "cat", "dog"));
        assertEquals(expected, result, "Unique words should match the expected set");
    }

    @Test
    void shouldReturnDuplicateWords() {
        // Given
        String sentence = "apple banana cat dog apple cat dog";

        // When
        Set<String> result = WordUtils.getDuplicates(sentence);

        // Then
        Set<String> expected = new HashSet<>(Arrays.asList("apple", "cat", "dog"));
        assertEquals(expected, result, "Duplicate words should match the expected set");
    }

    @Test
    void shouldCountWordOccurrences() {
        // Given
        String sentence = "apple banana cat dog apple cat dog";

        // When
        Map<String, Integer> result = WordUtils.countWordOccurrences(sentence);

        // Then
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 2);
        expected.put("banana", 1);
        expected.put("cat", 2);
        expected.put("dog", 2);
        assertEquals(expected, result, "Word occurrences should match the expected map");
    }
}
