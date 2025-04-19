package com.automation.ar.steps.step;

import com.automation.ar.pages.page.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep extends LoginPage {

    @Step("Ingresar usuario")
    public void typeUsername(String username) {
        txtUsername.waitUntilVisible().sendKeys(username);
    }

    @Step("Ingresar contraseña")
    public void typePassword(String password) {
        txtPassword.waitUntilVisible().sendKeys(password);
    }

    @Step("Click en el boton login")
    public void clickLogin() {
        btnLogin.waitUntilClickable().click();
    }
}
