package concreteStrategies;

import strategyInterface.SortingStrategy;

public class MergeSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using MergeSort");
    }
}
