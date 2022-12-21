package app.stepdefinitions;

import app.HookDriver;
import app.pageobjects.SingUpServices;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpStepDefs{
    @Given("cliente quiere logearse")
    public void cliente_quiere_logearse() throws InterruptedException {




        SingUpServices upServices = new SingUpServices(HookDriver.driver);
        HookDriver.driver.manage().window().maximize();
        Thread.sleep(2000);
        upServices.go("https://www.saucedemo.com/");
        upServices.writeUsername("standard_user");
        upServices.writePassword("secret_sauce");
        upServices.clicLoginButton();

        Thread.sleep(2000);

    }

    @When("el ingresa username y password")
    public void el_ingresa_username_y_password() {

    }

    @Then("el visualiza el menu principal")
    public void el_visualiza_el_menu_principal() {

    }


}
