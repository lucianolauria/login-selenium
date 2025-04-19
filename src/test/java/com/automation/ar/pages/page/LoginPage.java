package com.automation.ar.pages.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(id = "email1")
    protected WebElementFacade txtUsername;

    @FindBy(css = "div.p-password.p-component.p-inputwrapper.p-input-icon-right input")
    protected WebElementFacade txtPassword;

    @FindBy(css = "button.p-element.w-full.p-3.text-xl.p-button.p-component")
    protected WebElementFacade btnLogin;
}
