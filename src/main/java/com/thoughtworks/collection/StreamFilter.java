package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

    public List<Integer> filterEven(List<Integer> numbers) {

        return numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());

        //throw new NotImplementedException();
    }

    public List<String> filterEndWithS(List<String> words) {

        return words
                .stream()
                .filter(word -> word.endsWith("s") ||  word.endsWith("S"))
                .collect(Collectors.toList());
        //throw new NotImplementedException();
    }

    public List<Integer> getCommonElements(List<Integer> numbers, List<Integer> anotherNumbers) {


        return numbers
                .stream()
                .filter( number -> anotherNumbers.contains(number) ) //can also use anotherNumbers::contains
                .collect(Collectors.toList());

        //throw new NotImplementedException();
    }


}
