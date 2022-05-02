package drivers;

public class DeviceDriver {

    public static String getDeviceDriver () {
        String deviceHost = System.getProperty("deviceHost");

        switch (deviceHost) {
            case "browserstack":
                return BrowserstackMobileDriver.class.getName();
            case "emulation":
                return EmuMobileDriver.class.getName();
            default:
                throw new RuntimeException("Select device: browserstack / emulation");
        }
    }
}
