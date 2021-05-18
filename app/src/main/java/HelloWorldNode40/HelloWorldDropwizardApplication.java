package HelloWorldNode40;

import HelloWorldNode40.health.TemplateHealthCheck;
import HelloWorldNode40.resources.HelloWorldDropwizardResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;


public class HelloWorldDropwizardApplication extends Application<HelloWorldDropwizardConfiguration> {
    public static void main(String[] args) throws Exception {
        new HelloWorldDropwizardApplication().run(args);
    }
    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<HelloWorldDropwizardConfiguration> bootstrap) {
        // nothing to do yet
    }
    @Override
    public void run(HelloWorldDropwizardConfiguration configuration, Environment environment)  {
        final HelloWorldDropwizardResource resource = new HelloWorldDropwizardResource();
        final TemplateHealthCheck healthCheck =
                new TemplateHealthCheck(configuration.getTemplate());
        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(resource);
    }
}
