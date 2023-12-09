import tasks.algo.PaperCut;
import tasks.dynamicprogramming.Fibonacci;
import tasks.graph.Queue;
import tasks.search.BinarySearch;
import tasks.sorting.QuickSort;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Initialize all tasks
        BinarySearch binarySearch = new BinarySearch();
        QuickSort quickSort = new QuickSort();
        PaperCut paperCut = new PaperCut();
        Fibonacci fibonacci = new Fibonacci();
        Queue<Integer> queue = new Queue<Integer>();
        //Execute all tasks
        //QuickSort
        List<Integer> list = Arrays.asList(3, 1, 2, 5, 4, 33, 2, 5, 81, 124, 21, 4, 12, 645, 47, 8, 234, 97, 23, 6, 5, 2, 3, 554, 3, 2);
        List<Integer> sortedList = quickSort.sort(list);
        System.out.printf("Input List: %s \n", list);
        System.out.printf("Sorted List: %s \n", sortedList);
        //PaperCut
        int height = 13;
        int width = 29;
        System.out.printf("Result of Paper cut algorithm for paper size %sx%s: %s \n", height, width, paperCut.execute(height, width));
        //Fibonacci
        int n = 13;
        System.out.printf("Result of Fibonacci algorithm for %sth element: %s \n", n, fibonacci.fib(n));
        //Queue
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.printf("Queue: %s \n", queue);
        queue.dequeue();
        System.out.printf("Queue after retrieving element: %s \n", queue);
        //BinarySearch
        int[] sortedArray = sortedList.stream().mapToInt(Integer::intValue).toArray();
        System.out.printf("Index of element found with binary search algorithm: %s \n\n        Thanks for attention :)\n", binarySearch.find(sortedArray, 5));
    }
}
