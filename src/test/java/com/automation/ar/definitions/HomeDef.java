package com.automation.ar.definitions;

import com.automation.ar.steps.validations.ValidationHomeStep;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class HomeDef {
    @Steps(shared = true)
    ValidationHomeStep validate;

    @Then("la aplicacion muestra el Home")
    public void systemOpen(){
        Assert.assertTrue(validate.iconIsVisible());
    }
}
