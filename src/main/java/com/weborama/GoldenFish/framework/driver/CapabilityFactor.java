package com.weborama.GoldenFish.framework.driver;

import org.openqa.selenium.remote.DesiredCapabilities;

import static com.weborama.GoldenFish.framework.driver.OptionsManager.*;

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
