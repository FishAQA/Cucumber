package com.weborama.admin.page_object.admin;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.weborama.admin.page_object.app.ProjectsPage;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class LeftSideBar {

    public SelenideElement filter = $x("//*[contains(@class, 'input-search')]");

    public SelenideElement  exitArrow = $x("//a[@href='/folderView']");

    public ElementsCollection tabs =
            $$x("//div[contains (@class, 'tabs-item')]");

    public SelenideElement tableContent =
            $x("//div[contains (@class, 'table-content')]");

    public ElementsCollection itemsList =
            $$x("//div[contains (@class, 'table-row')]");
//    exclude(not(visible));
    public ElementsCollection clientsIDs =
            $$x("//div[contains (@class, 'table-content')]//span[@class = 'thin']");

    public ElementsCollection clientsNames =
            $$x("//span[contains (@class, 'firstLetterUppercase')]");

    public SelenideElement addClientButton =
            $x("//*[contains (@class, 'side_footer')]//*[contains (@class, 'add-client')]");

    public ElementsCollection usersNames =
            $$x("//div[contains (@class, 'table-content')]//span[@class = 'thin']");

    public ElementsCollection usersEmails =
            $$x("//span[contains (@class, 'is-truncate')]");

    public SelenideElement addUserButton =
            $x("//*[contains (@class, 'side_footer')]//*[contains (@class, 'add-user')]");

    public void verifyTabSelected(String tab){
        tabs.filter(cssClass("is-active"))
                .shouldHave(size(1))
                .first()
                .shouldHave(exactText(tab));
    }

    public ElementsCollection getClientsIDs(){
        return clientsIDs.shouldHave(sizeGreaterThan(0));
    }
    public ElementsCollection getUsersEmails(){
        return usersEmails.shouldHave(sizeGreaterThan(0));
    }

    public ElementsCollection getClientsNames(){
        return clientsNames.shouldHave(sizeGreaterThan(0));
    }

    public ElementsCollection getUsersNames(){
        return usersNames.shouldHave(sizeGreaterThan(0));
    }

    public SelenideElement getExactItem(String itemName){
        return itemsList.findBy(text(itemName));
    }

    public void selectTab(String selectedTab){
        tabs.findBy(text(selectedTab)).click();
    }

    public ProjectsPage closeAdminMenu(){
        exitArrow.click();
        return new ProjectsPage();
    }
}

