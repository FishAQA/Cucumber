package steps;

import com.codeborne.selenide.Condition;
import com.weborama.GoldenFish.page_object.app.projects.NewProjectModal;
import com.weborama.GoldenFish.page_object.app.projects.ProjectsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.weborama.GoldenFish.page_object.app.projects.ProjectsPage.openCreateProjectModal;

public class TestSteps {

    ProjectsPage projectsPage = new ProjectsPage();

    NewProjectModal newProjectModal;

    String newProjectName = "NewProject";

    @Given("User clicks on the New project button")
    public void userClicksOnTheNewProjectButton() {
        newProjectModal = openCreateProjectModal();
    }

    @When("Inserts unique project name")
    public void insertsUniqueProjectName() {
        newProjectModal
                .verifyNewProjectModalIsOpened()
                .projectName
                .shouldBe(visible)
                .sendKeys(newProjectName);
    }

    @And("Confirms project creation")
    public void confirmsProjectCreation() {
        newProjectModal
                .createProjectButton
                .shouldBe(and("clickable", visible, enabled))
                .click();
    }

    @Then("New project is created successfully")
    public void newProjectIsCreatedSuccessfully() {
        newProjectModal.
                verifyNewProjectModalIsClosed().
                successMessage
                .should(Condition.appear)
                .shouldHave(Condition.text("Project successfully created"))
                .should(Condition.disappear);

    }

    @And("New project is opened in the Project tree")
    public void newProjectIsOpenedInTheProjectTree() {
        projectsPage.emptyProjectsTree
                .should(exist);
    }

    @And("New project is opened in the Breadcrumbs next to the Home icon")
    public void newProjectIsOpenedInTheBreadcrumbsNextToTheHomeIcon() {
        projectsPage.breadcrumb
                .lastChild()
                .shouldHave(attributeMatching("title", newProjectName))
                .shouldHave(cssClass("is-active"))
                .preceding(0)
                .find(By.tagName("button"))
                .shouldHave(cssClass("home"));
    }

    @And("New project is opened in the Segments Breakdown table")
    public void newProjectIsOpenedInTheSegmentsBreakdownTable() {
        projectsPage.segmentsBreakdown
                .lastChild()
                .shouldHave(text(newProjectName));
    }

    @Given("A subproject exists in the root folder")
    public void aSubprojectExistsInTheRootFolder() {
        projectsPage.ProjectsTreeItems
                .findBy(text(newProjectName)).should(exist);
    }

    @And("Selects the subproject")
    public void selectsTheSubproject() {
        newProjectModal.treeItems
                .findBy(text(newProjectName)).click();
    }

    @And("New project is opened in the Breadcrumbs next to the parent project")
    public void newProjectIsOpenedInTheBreadcrumbsNextToTheParentProject() {
        projectsPage.breadcrumb
                .lastChild()
                .find(By.className("is-active"))
                .shouldHave(attributeMatching("title", newProjectName))
                .parent().preceding(0)
                .shouldHave(attributeMatching("title", newProjectName));
    }
}
