package guru.qa.tests.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/tests.properties"})
public interface CredentialsConfig extends Config {
    String login();
    String password();
}