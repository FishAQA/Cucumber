package com.weborama.admin.page_object.utils;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.CollectionCondition.*;

public class Methods {

    public static void assertEachItemHasName(ElementsCollection itemsNames, int items){
        itemsNames.shouldHave(noneMatch("Some clients don't have name",
                        element -> element.getText().isBlank()))
                .shouldHave(size(items));
    }

    public static void assertItemsListHasCorrectOrder(ElementsCollection itemsNames){
        itemsNames.shouldHave(containExactTextsCaseSensitive
                        (itemsNames.texts().stream().sorted().toList()));
    }
}
