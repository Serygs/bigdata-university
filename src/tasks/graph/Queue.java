package tasks.graph;

import java.util.LinkedList;

public class Queue<T> {
    private final LinkedList<T> queue;

    public Queue() {
        queue = new LinkedList<>();
    }

    public void enqueue(T item) {
        queue.addLast(item);
    }

    public void dequeue() {
        queue.pollFirst();
    }

    public T peek() {
        return queue.peekFirst();
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public String toString() {
        return String.format("Size of queue: %s, elements: %s", size(), queue);
    }
}
