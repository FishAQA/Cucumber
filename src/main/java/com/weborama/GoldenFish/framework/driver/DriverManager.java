package com.weborama.GoldenFish.framework.driver;

import java.util.Objects;

import static com.weborama.GoldenFish.framework.driver.DriverFactory.selectBrowserForDriver;
import static com.weborama.GoldenFish.framework.driver.DriverFactory.setRemoteDriver;

public class DriverManager {

    private static final String DEFAULT_SERVER = "local";

    public static synchronized void initDriver(String server, String driverType){
        selectServer(Objects.requireNonNullElse(server, DEFAULT_SERVER), driverType);
    }

    private static synchronized void initLocalDriver(String driverType) {selectBrowserForDriver(driverType);
    }
    private static synchronized void initRemoteDriver(String driverType) {
        setRemoteDriver(driverType);
    }

    private static synchronized void selectServer(String server, String driverType) {
        switch (server){
            case "local" -> initLocalDriver(driverType);
            case "remote" -> initRemoteDriver(driverType);
            default -> System.out.println("No server provided");
        }
    }
}
