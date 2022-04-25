package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/credentials.properties"})
public class CredentialsConfig extends Config {

    String user();

    String key();
}
