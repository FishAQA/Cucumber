package com.weborama.GoldenFish.page_object.app.projects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class ProjectsPage {
    
    public final static SelenideElement logOutButton = $x("//button[contains(@class,'icon logout')]");
    public final static SelenideElement newProject = $x("//button[contains (@class, 'createfolder')]");

    public SelenideElement headerTabs = $x("//nav[contains (@class, 'app-header-wrapper__menu')]");

    public SelenideElement breadcrumb = $x("//div[contains(@class,'breadcrumb')]");

    public SelenideElement emptyProjectsTree =
             $x("//div[contains(@class,'tree-view__list')]/div[contains (@class, 'message-empty')]");

    public ElementsCollection ProjectsTreeItems =
            $$x("//div[contains(@class,'tree-view__list')]//label");

    public SelenideElement segmentsBreakdown = $x("//header/h1[normalize-space (text() = 'Project')]");

    public void verifyProjectsPageIsOpened(){
        headerTabs.find(By.className("is-active")).shouldHave(text("projects"));
    }

    public static NewProjectModal openCreateProjectModal(){
        newProject.click();
        return new NewProjectModal();
    }

    public static void logOutAction(){
        logOutButton.click();
    }
}