package com.weborama.GoldenFish.page_object.app.projects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class NewProjectModal {

    public SelenideElement modal = $x("//div[contains (text(),'item')]");
    public SelenideElement projectName = $x("//input[contains (@placeholder, 'Project Name')]");
    public SelenideElement createProjectButton = $x("//button[contains (text(), 'Create project in')]");

    public SelenideElement successMessage = $x("//div[@class = 'notification-content']");

    public ElementsCollection treeItems = $$x("//span[contains(@class,'tree-menu-node__label')]");

    public NewProjectModal verifyNewProjectModalIsOpened(){
        modal.should(and("opened", exist, visible));
            return this;
    }

    public NewProjectModal verifyNewProjectModalIsClosed(){
        modal.shouldNotBe(visible);
        return this;
    }
}
