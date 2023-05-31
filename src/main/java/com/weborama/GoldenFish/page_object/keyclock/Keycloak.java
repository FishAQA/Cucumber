package com.weborama.GoldenFish.page_object.keyclock;

import com.weborama.GoldenFish.framework.BasePage;
import com.weborama.GoldenFish.page_object.app.projects.ProjectsPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Keycloak extends BasePage {

    public static ProjectsPage loginToGoldenFish(){
        $(By.id("username")).sendKeys("fishautotests@gmail.com");
        $(By.id("password")).sendKeys("12345Qq!");
        $(By.id("kc-login")).click();
        return new ProjectsPage();
    }
}
