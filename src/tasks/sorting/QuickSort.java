package tasks.sorting;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public List<Integer> sort(List<Integer> payload) {
        if (payload.size() <= 1) {
            return payload;
        }

        int pivot = payload.get(0);
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (int num : payload) {
            if (num < pivot) {
                less.add(num);
            } else if (num == pivot) {
                equal.add(num);
            } else {
                greater.add(num);
            }
        }

        List<Integer> sorted = new ArrayList<>();
        sorted.addAll(sort(less));
        sorted.addAll(equal);
        sorted.addAll(sort(greater));

        return sorted;

    }
}
