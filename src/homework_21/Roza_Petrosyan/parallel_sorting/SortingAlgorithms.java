package homework_21.Roza_Petrosyan.parallel_sorting;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class SortingAlgorithms {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] generatedArray = new int[10000];
        for (int i = 0; i < generatedArray.length; i++) {
            generatedArray[i] = rd.nextInt();
        }

        List<LongSummaryStatistics> statistics = Arrays.stream(SortingTypes.values())
                .map(type -> calculateSortingTime(generatedArray, SorterFactory.getSorter(type)))
                .map(longs -> longs.stream().mapToLong(value -> value)
                        .summaryStatistics()).toList();

        for (LongSummaryStatistics statistic : statistics) {
            System.out.println(statistic.getMax() + " millisecond");
        }
    }

    private static List<Long> calculateSortingTime(int[] generatedArray, AbstractSorter sorter) {
        int attempts = 1;
        ExecutorService executorService = Executors.newFixedThreadPool(attempts);
        List<Long> runResults = new ArrayList<>();
        runResults.add(sorter.getTime(generatedArray));
        for (int i = 0; i < attempts; i++) {
            executorService.submit(() -> runResults);
        }
        calculateMinMax(generatedArray, sorter);
        executorService.shutdown();
        return runResults;
    }

    private static void calculateMinMax(int[] generatedArray, AbstractSorter sorter) {
        IntStream ints = IntStream.of(sorter.sort(generatedArray));
        System.out.println(sorter.getClass().getSimpleName() + " " + ints.summaryStatistics());
    }
}
