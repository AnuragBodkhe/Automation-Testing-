package nonfunctional;

public class LoadTest {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.println("User " + i + " request sent");
        }
    }
}