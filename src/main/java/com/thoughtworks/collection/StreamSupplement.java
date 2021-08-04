package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSupplement {

    public StreamSupplement() {
    }

    public List<Integer> sortFromMaxToMin(List<Integer> numbers) {
        return numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public double getAverage(List<Integer> numbers) {
        return numbers.stream().reduce(0, Integer::sum).doubleValue() / numbers.size();
    }

    public int getMaxValue(List<Integer> numbers) {
        return numbers.stream().max(Integer::compare).get();
    }

}
