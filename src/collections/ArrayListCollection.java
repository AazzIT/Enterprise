package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListCollection {
    private final List<Integer> arrayList = new ArrayList<Integer>();

    private long startTime;
    private long estimatedTime;

    public long add(int count) {
        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            this.arrayList.add(i);
        }
        estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }

    public long get(int count) {
        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            this.arrayList.get(i);
        }
        estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }

    public long remove(int count) {
        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            this.arrayList.remove(i);
        }
        estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }

    public long contains(int count) {
        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            this.arrayList.contains(i);
        }
        estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }

    public long populate() {
        startTime = System.currentTimeMillis();
        List<Integer> newArrayList  = new ArrayList<Integer>(arrayList);
        estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }

    public long iteratorAdd() {
        startTime = System.currentTimeMillis();
        for (ListIterator<Integer> it = arrayList.listIterator(); it.hasNext();){
            it.next();
            it.add(it.previous());
        }
        estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }

    public long iteratorRemove() {
        startTime = System.currentTimeMillis();
        for (ListIterator<Integer> it = arrayList.listIterator(); it.hasNext();){
            it.next();
            it.remove();
        }
        estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }

}
