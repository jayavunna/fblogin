package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLoginPage2 {
    @FindBy(id = "email")
    static WebElement  emailInput;

    @FindBy (id = "pass")
    static WebElement passInput;

    public static void assertEmailInputDisplayed (){
        Assert.assertEquals(true,emailInput.isDisplayed());
    }

    public static void enterEmailInput (String emailId){
        emailInput.sendKeys(emailId);
    }

}
