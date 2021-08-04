package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

    private static final List<String> ALPHABET = Arrays.asList(
            "a", "b", "c", "d", "e", "f", "g",
            "h", "i", "j", "k", "l", "m", "n",
            "o", "p", "q", "r", "s", "t", "u",
            "v", "w", "x", "y", "z");

    public StreamMap() {

    }

    public List<Integer> getTriple(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> number * 3)
                .collect(Collectors.toList());
    }

    public List<String> mapLetter(List<Integer> numbers) {
//        throw new NotImplementedException();
        return numbers.stream()
                .map(number -> ALPHABET.get(number-1))
                .collect(Collectors.toList());
    }

    public List<Integer> mapLength(List<String> words) {
//        throw new NotImplementedException();
        return words.stream()
                .map(word ->  word.length())
                .collect(Collectors.toList());

    }
}
