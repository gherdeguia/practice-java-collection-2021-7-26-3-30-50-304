package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;

public class StreamReduce {

    public StreamReduce() {
    }

    public int getLastOdd(List<Integer> numbers) {
        return numbers.stream()
                .reduce(null, (current,next) -> next % 2 == 1 ? next : current);
    }



    public String getLongest(List<String> words) {
        return words
                .stream()
                .reduce("",(current,next) -> next.length() > current.length() ? next : current);
    }

    public int getTotalLength(List<String> words) {
//        throw new NotImplementedException();
        return words.stream()
                .reduce("", (current, next) -> current + next)
                .length();
    }
}
