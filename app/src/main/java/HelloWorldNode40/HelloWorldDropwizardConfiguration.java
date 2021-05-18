package HelloWorldNode40;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotEmpty;

public class HelloWorldDropwizardConfiguration extends Configuration {
    @NotEmpty
    private String template;

    @JsonProperty
    public String getTemplate() {
        return template;
    }

}
