package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListCollection {
    private final List<Integer> linkedList = new LinkedList<Integer>();

    private long startTime;
    private long estimatedTime;

    public long add(int count) {
        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            this.linkedList.add(i);
        }
        estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }

    public long get(int count) {
        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            this.linkedList.get(i);
        }
        estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }

    public long remove(int count) {
        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            this.linkedList.remove(i);
        }
        estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }

    public long contains(int count) {
        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            this.linkedList.contains(i);
        }
        estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }

    public long populate() {
        startTime = System.currentTimeMillis();
        List<Integer> newLinkedList  = new LinkedList<Integer>(linkedList);
        estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }

    public long iteratorAdd() {
        startTime = System.currentTimeMillis();
        for (ListIterator<Integer> it = linkedList.listIterator(); it.hasNext();){
            it.add(it.next());
        }
        estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }

    public long iteratorRemove() {
        startTime = System.currentTimeMillis();
        for (ListIterator<Integer> it = linkedList.listIterator(); it.hasNext();){
            it.next();
            it.remove();
        }
        estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }
}
