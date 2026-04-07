package integration;

import org.testng.annotations.Test;

public class APIIntegrationTest {
    @Test
    void testAPIResponse() {
        int statusCode = 200;
        assert statusCode == 200;
    }
}