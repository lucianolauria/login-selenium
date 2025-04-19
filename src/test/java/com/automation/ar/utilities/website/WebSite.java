package com.automation.ar.utilities.website;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class WebSite {

    @Steps(shared = true)
    PageObject sge;

    @Step("Navegar a la aplicacion web")
    public void navigateTo(String url) {
        sge.setDefaultBaseUrl(url);
        sge.open();
    }
}
