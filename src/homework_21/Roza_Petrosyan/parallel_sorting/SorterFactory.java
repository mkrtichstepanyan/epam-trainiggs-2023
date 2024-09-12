package homework_21.Roza_Petrosyan.parallel_sorting;

import java.util.HashMap;
import java.util.Map;

public class SorterFactory {
    private static final Map<SortingTypes, AbstractSorter> sorters = new HashMap<>();
    static {
        sorters.put(SortingTypes.BUBBLE, new BubbleSort());
        sorters.put(SortingTypes.SELECTION, new SelectionSort());
        sorters.put(SortingTypes.QUICK, new QuickSort());
        sorters.put(SortingTypes.MERGE, new MergeSort());
    }

    public static AbstractSorter getSorter(SortingTypes type) {
        return sorters.get(type);
    }
}
