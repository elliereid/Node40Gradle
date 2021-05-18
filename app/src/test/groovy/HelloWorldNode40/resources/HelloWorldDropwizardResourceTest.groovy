package HelloWorldNode40.resources

import io.dropwizard.testing.junit.ResourceTestRule
import org.junit.Rule
import spock.lang.Specification
import static javax.ws.rs.core.MediaType.*

class HelloWorldDropwizardResourceTest extends Specification {
    @Rule
    ResourceTestRule resources = ResourceTestRule.builder()
            .addResource(new HelloWorldDropwizardResource())
            .build()


    def "test simpleHello"() {

        when: "curl endpoint is hit"
        String result = resources
                .client()
                .target("/hello-world")
                .request(APPLICATION_JSON_TYPE)
                .get()
        then:
        result == "Hello! How are you today?"

    }
}
