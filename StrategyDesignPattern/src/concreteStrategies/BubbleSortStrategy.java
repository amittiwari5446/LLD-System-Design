package concreteStrategies;

import strategyInterface.SortingStrategy;

public class BubbleSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using BubbleSort");
    }
}
