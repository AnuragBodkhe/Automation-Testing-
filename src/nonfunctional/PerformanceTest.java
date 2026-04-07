package nonfunctional;

public class PerformanceTest {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            System.out.println("Test");
        }

        long end = System.currentTimeMillis();

        System.out.println("Time Taken: " + (end - start));
    }
}