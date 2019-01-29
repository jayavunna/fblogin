package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginPage {
    WebElement emailInput;
    WebElement pwdInput;
//    WebElement firstnameInput;
//    WebElement surnameInput;
//    WebElement mobilenumerInput;
//    WebElement newpasswordInput;
//    WebElement dayDropDown;
//    WebElement monthDropDown;
//    WebElement yearDropDown;
//    WebElement signupButton;
//    WebElement loginButton;

    public FacebookLoginPage(WebDriver myDriver) {
        emailInput = myDriver.findElement(By.id("email"));
        pwdInput = myDriver.findElement(By.id("Pass"));
//        firstnameInput = myDriver.findElement(By.id("firstname"));
//        surnameInput = myDriver.findElement(By.id("u_0_l"));
//        mobilenumerInput = myDriver.findElement(By.id("u_0_o"));
    }
}
