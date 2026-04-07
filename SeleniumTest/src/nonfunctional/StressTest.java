package nonfunctional;

public class StressTest {

    public static void main(String[] args) {
        try {
            int[] arr = new int[1000000000];
            System.out.println(arr.length);
        } catch (OutOfMemoryError e) {
            System.out.println("Stress Test: System ran out of memory as expected.");
        }
    }
}