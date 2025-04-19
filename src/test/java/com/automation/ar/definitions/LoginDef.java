package com.automation.ar.definitions;

import com.automation.ar.steps.step.LoginStep;
import com.automation.ar.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginDef {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginStep login;

    @Given("el usuario ingresa al sitio web")
    public void userNavigateTo() {
        url.navigateTo("https://sge-frontend-beta.vercel.app/auth/login");
    }

    @When("ingresa credenciales validas")
    public void userLoginWithValidCredentials() throws InterruptedException {
        login.typeUsername("usuarioprueba@gmail.com");
        login.typePassword("12345678");
        login.clickLogin();
    }
}
