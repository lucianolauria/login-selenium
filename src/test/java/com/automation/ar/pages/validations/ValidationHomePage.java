package com.automation.ar.pages.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidationHomePage extends PageObject {

    @FindBy(xpath = "//span[contains(@class, 'layout-menuitem-text') and text() = 'Inicio']")
    protected WebElementFacade menuHome;
}
