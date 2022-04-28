package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/emu.properties"})
public interface EmuConfig  extends Config {

    String appPackage();

    String appActivity();

    String serverUrl();

    String appUrl();

    String appPath();

}
