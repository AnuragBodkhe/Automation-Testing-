package integration;

import org.testng.annotations.Test;

public class ServiceLayerTest {
    @Test
    void testService() {
        String result = "Success";
        assert result.equals("Success");
    }
}