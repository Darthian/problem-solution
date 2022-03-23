package com.example.porblemsolution.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class ProblemSolutionServiceImpl implements ProblemSolutionService {

    public ProblemSolutionServiceImpl() {
    }

    @Override
    public String solveProblem(String numbersArray) {
        List<Integer> sortedNumbers = getIntegers(numbersArray);
        Collections.sort(sortedNumbers);
        final Integer lowestDifferenceValue = getLowestDifferenceValue(sortedNumbers);
        StringBuilder result = new StringBuilder();
        IntStream.range(0, sortedNumbers.size() - 1).forEach(
                i -> {
                    if (sortedNumbers.get(i + 1) - sortedNumbers.get(i) == lowestDifferenceValue) {
                        result.append("(" + sortedNumbers.get(i) + ", " + sortedNumbers.get(i + 1) + ")");
                    }
                });
        return result.toString();
    }

    private Integer getLowestDifferenceValue(List<Integer> sortedNumbers) {
        Integer differenceValue = 10;
        for (int i = 0; i < sortedNumbers.size() - 1; i++) {
            Integer newDifference = sortedNumbers.get(i + 1) - sortedNumbers.get(i);
            if (newDifference < differenceValue) {
                differenceValue = newDifference;
            }
        }

        final Integer lowestDifferenceValue = differenceValue;
        return lowestDifferenceValue;
    }

    private List<Integer> getIntegers(String numbersArray) {
        List<Integer> numbers = Arrays.stream(numbersArray
                        .replaceAll("[^a-zA-Z0-9,]", "")
                        .replaceAll("\\s+", "")
                        .split(","))
                .map(x -> Integer.valueOf(x).intValue()).collect(Collectors.toList());
        List<Integer> sortedNumbers = numbers;
        return sortedNumbers;
    }
}
