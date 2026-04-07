package integration;

class Database {
    String getData() {
        return "User Data";
    }
}

class Service {
    Database db = new Database();

    String fetchData() {
        return db.getData();
    }
}

public class ServiceIntegrationTest {

    public static void main(String[] args) {
        Service service = new Service();
        System.out.println(service.fetchData());
    }
}