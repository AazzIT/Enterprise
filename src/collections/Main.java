package collections;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
        System.out.println(System.nanoTime());
        System.out.println(System.nanoTime());
        System.out.println(System.nanoTime());
        System.out.println(System.nanoTime());
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println(estimatedTime);
    }
}
