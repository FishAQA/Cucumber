package com.weborama.GoldenFish.page_object.app;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ProjectsPage {

    public final static SelenideElement adminButton = $("button.icon.admin");
    public final static SelenideElement newProject = $x("//button[contains (@class, 'createfolder')]");

    public SelenideElement headerTabs = $x("//nav[contains (@class, 'app-header-wrapper__menu')]");

    public void verifyProjectsPageIsOpened(){
        headerTabs.find(By.className("is-active")).shouldHave(text("projects"));
    }

    public static void openAdminMenu(){
        adminButton.click();
    }

    public static void openCreateProjectModal(){
        newProject.click();
    }
}