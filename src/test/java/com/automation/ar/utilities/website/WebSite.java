package com.automation.ar.utilities.website;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class WebSite {

    @Steps(shared = true)
    PageObject bhy;

    @Step("Navegar a la aplicacion web")
    public void navigateTo(String url) {
        bhy.setDefaultBaseUrl(url);
        bhy.open();
    }
}
