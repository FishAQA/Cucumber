package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.weborama.GoldenFish.navigation.GoldenFishNavigation.navigateToKeycloakPage;
import static com.weborama.GoldenFish.page_object.app.projects.ProjectsPage.logOutAction;
import static com.weborama.GoldenFish.page_object.keyclock.Keycloak.loginToGoldenFish;

public class AppHooks {
    @Before
    public void openContextualSemanticAIAndLogin() {
        navigateToKeycloakPage();
        loginToGoldenFish().verifyProjectsPageIsOpened();
    }

    @After
    public void logOut() {
        logOutAction();
    }
}
