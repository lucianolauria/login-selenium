package com.automation.ar.steps.validations;

import com.automation.ar.pages.validations.ValidationHomePage;
import net.thucydides.core.annotations.Step;

public class ValidationHomeStep extends ValidationHomePage {

    @Step("Se visualiza el Home")
    public Boolean iconIsVisible() {
        return menuHome.isDisplayed();
    }
}
