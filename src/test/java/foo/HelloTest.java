package foo;

import org.junit.*;
import io.dropwizard.*;
import io.dropwizard.setup.*;
import io.dropwizard.testing.*;
import io.dropwizard.testing.junit.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.core.Response;

import static org.junit.Assert.*;

public class HelloTest {
    @ClassRule
    public static final DropwizardAppRule<TestConfiguration> RULE =
            new DropwizardAppRule<>(MyApp.class, "", ConfigOverride.config("server.applicationConnectors[0].port", "0"));

    @Test
    public void loginHandlerRedirectsAfterPost() {
        Client client = RULE.client();

        Response response = client.target(
                 String.format("http://localhost:%d/", RULE.getLocalPort()))
                .request()
                .get();

        assertEquals(404, response.getStatus());
    }

    @Test
    public void test() {
        assertEquals(1, 1);
    }

    public static class MyApp extends Application<TestConfiguration> {
        @Override
        public void run(TestConfiguration config, Environment environment) throws Exception {

        }
    }

    public static class TestConfiguration extends Configuration {

    }
}
