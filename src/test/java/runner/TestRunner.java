package com.weborama.GoldenFish.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports/CucumberTestRunner.html",
                "json:target/cucumber-reports/CucumberTestRunner.json",
                "junit:target/cucumber-reports/CucumberTestRunner.xml"},
        monochrome = true,
        tags = "@all",
        glue = "com.weborama.GoldenFish",
        features = "classpath:com/weborama/GoldenFish/features/"
)
public class TestRunner{
}