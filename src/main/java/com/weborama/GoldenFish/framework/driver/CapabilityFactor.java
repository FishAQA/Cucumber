package com.weborama.GoldenFish.driver;

import org.openqa.selenium.remote.DesiredCapabilities;

import static com.weborama.admin.framework.driver.OptionsManager.*;

public class CapabilityFactor {

    public static DesiredCapabilities capabilities;

    public static synchronized DesiredCapabilities getCapabilities(String browser) {
        return switch (browser) {
            case "firefox" -> capabilities = getFirefoxDesiredCapabilities();
            case "edge" -> capabilities = getEdgeDesiredCapabilities();
            default -> capabilities = getChromeDesiredCapabilities();
        };
    }
}
