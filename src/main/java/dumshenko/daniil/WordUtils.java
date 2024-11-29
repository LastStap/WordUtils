package dumshenko.daniil;

import java.util.*;

public class WordUtils {

    public static String getShortestWord(List<String> words) {
        return words.stream()
                .min(Comparator.comparingInt(String::length))
                .orElse("No words provided");
    }

    public static Set<String> getUniqueWords(String sentence) {
        List<String> words = Arrays.asList(sentence.split("\\s+")); // regex пiдказав чат
        return new HashSet<>(words);
    }

    public static Set<String> getDuplicates(String sentence) {
        String[] words = sentence.split("\\s+");
        Set<String> duplicates = new HashSet<>();
        Set<String> seen = new HashSet<>();

        for (String word : words) {
            if (!seen.add(word)) {
                duplicates.add(word);
            }
        }

        return duplicates;
    }

    public static Map<String, Integer> countWordOccurrences(String sentence) {
        String[] words = sentence.split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return wordCount;
    }
}
