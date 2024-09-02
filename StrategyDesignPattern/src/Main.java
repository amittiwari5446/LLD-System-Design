import concreteStrategies.BubbleSortStrategy;
import concreteStrategies.MergeSortStrategy;
import concreteStrategies.QuickSortStrategy;
import context.SortingContext;

public class Main {
    public static void main(String[] args) {
        SortingContext sortingContext=new SortingContext(new BubbleSortStrategy());
        int[] array1={2,5,3,8,6,1,0,8};
        sortingContext.performSort(array1);

        sortingContext.setSortingStrategy(new MergeSortStrategy());
        int[] array2={1,2,5,3,2,6,1,0,9};
        sortingContext.performSort(array2);

        sortingContext.setSortingStrategy(new QuickSortStrategy());
        int[] array3={1,12,5,30,2,601,1,110,9};
        sortingContext.performSort(array3);
    }
}