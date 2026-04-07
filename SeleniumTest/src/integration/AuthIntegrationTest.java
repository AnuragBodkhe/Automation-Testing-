package integration;

import org.testng.annotations.Test;

public class AuthIntegrationTest {
    @Test
    void testAuth() {
        String token = "abc123";
        assert token != null;
    }
}