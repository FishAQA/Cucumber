package com.weborama.admin.page_object.admin;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RightArea {

    public SelenideElement defaultView = $x("//div[contains (@class, 'no-data')]");
}
