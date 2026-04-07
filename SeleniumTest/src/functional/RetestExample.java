package functional;

public class RetestExample {

    static boolean login(String user, String pass) {
        return user.equals("admin") && pass.equals("1234");
    }

    public static void main(String[] args) {

        if (login("admin", "1234")) {
            System.out.println("Bug Fixed - Retest Passed");
        }
    }
}