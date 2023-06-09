package steps;

import io.cucumber.java.en.Given;

import static com.weborama.GoldenFish.navigation.GoldenFishNavigation.navigateToKeycloakPage;
import static com.weborama.GoldenFish.page_object.keyclock.Keycloak.loginToGoldenFish;

public class BackgroundSteps {
    @Given("Open Contextual Semantic AI and login")
    public void openContextualSemanticAIAndLogin() {
        navigateToKeycloakPage();
        loginToGoldenFish().verifyProjectsPageIsOpened();
    }
}
