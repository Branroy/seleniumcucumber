package app.pageobjects;

import org.openqa.selenium.WebDriver;

public class SingUpServices {

    private WebDriver driver;
    private SingUpPageObject singUpPageObject;

    public SingUpServices(WebDriver driver){
        this.driver = driver;
        singUpPageObject = new SingUpPageObject(driver);
    }
    public void go(String url) {this.driver.get(url);}

    public void writeUsername(String username){
        this.singUpPageObject.getUserNameField().sendKeys(username);
    }
    public void writePassword(String password){
        this.singUpPageObject.getPasswordField().sendKeys(password);
    }

    public void clicLoginButton(){
        this.singUpPageObject.getLoginbutton().click();
    }
}
