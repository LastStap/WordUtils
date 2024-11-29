package dumshenko.daniil;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "cat", "dog", "elephant");
        System.out.println("Shortest word: " + WordUtils.getShortestWord(words));

        String sentence = "apple banana cat dog apple cat dog";
        System.out.println("Unique words: " + WordUtils.getUniqueWords(sentence));
        System.out.println("Duplicate words: " + WordUtils.getDuplicates(sentence));
        System.out.println("Word occurrences: " + WordUtils.countWordOccurrences(sentence));


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Sum of numbers: " + NumberUtils.getSum(numbers));
        System.out.println("Multiplied odd numbers: " + NumberUtils.multiplyOddNumbers(numbers));
    }
}
