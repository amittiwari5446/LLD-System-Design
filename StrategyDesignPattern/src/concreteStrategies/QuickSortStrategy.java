package concreteStrategies;

import strategyInterface.SortingStrategy;

public class QuickSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using QuickSort");
    }
}
