package com.deven;

import java.util.stream.IntStream;
import java.util.IntSummaryStatistics;

public class Q10 {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 10).sum();
        IntSummaryStatistics stats = IntStream.rangeClosed(1, 10).summaryStatistics();
        System.out.println(sum);
        System.out.println(stats);
    }
}
