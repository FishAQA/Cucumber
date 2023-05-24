package com.weborama.admin.navigation;

import com.weborama.admin.page_object.admin.AdminPage;

public class AdminPageNavigation {

    public static void navigateToAdminPage() {
        new AdminPage().navigate("https://contextual-preprod.weborama.com/admin");
    }
}
