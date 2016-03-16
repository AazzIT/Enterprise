package collections;

import java.util.*;

public class TreeSetCollection {
    private final Set<Integer> treeSet = new TreeSet<Integer>();

    private long startTime;
    private long estimatedTime;

    public long add(int count) {
        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            this.treeSet.add(i);
        }
        estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }

    public long get(int count) {
        startTime = System.currentTimeMillis();

        for (Iterator<Integer> it = treeSet.iterator(); it.hasNext();){
            it.next();
        }

        estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }

    public long remove(int count) {
        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            this.treeSet.remove(i);
        }
        estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }

    public long contains(int count) {
        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            this.treeSet.contains(i);
        }
        estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }

    public long populate() {
        startTime = System.currentTimeMillis();
        List<Integer> newLinkedList  = new LinkedList<Integer>(treeSet);
        estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }

    public long iteratorAdd() {
        startTime = System.currentTimeMillis();
        for (Iterator<Integer> it = treeSet.iterator(); it.hasNext();){
            it.next();
        }
        estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }

    public long iteratorRemove() {
        startTime = System.currentTimeMillis();
        for (Iterator<Integer> it = treeSet.iterator(); it.hasNext();){
            it.next();
            it.remove();
        }
        estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }
}
