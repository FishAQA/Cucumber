package com.weborama.admin.navigation;

import com.weborama.admin.page_object.keyclock.Keycloak;

public class GoldenFishNavigation{

    public static void navigateToKeycloakPage() {
        new Keycloak().navigate("https://contextual-preprod.weborama.com/");
    }
}
