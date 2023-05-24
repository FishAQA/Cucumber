package com.weborama.admin.page_object.admin;

import com.weborama.admin.framework.BasePage;

public class AdminPage extends BasePage {

    LeftSideBar sideBar;
    RightArea rightArea;

    public AdminPage() {
        this.sideBar = new LeftSideBar();
        this.rightArea = new RightArea();
    }
}
