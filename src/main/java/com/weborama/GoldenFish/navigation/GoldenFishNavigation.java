package com.weborama.GoldenFish.navigation;

import com.weborama.GoldenFish.page_object.keyclock.Keycloak;

public class GoldenFishNavigation{

    public static void navigateToKeycloakPage() {
        new Keycloak().navigate("https://contextual-preprod.weborama.com/");
    }
}
