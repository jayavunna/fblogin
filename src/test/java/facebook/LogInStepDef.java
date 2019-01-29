package facebook;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static facebook.Hooks.myDriver;

public class LogInStepDef
{
//    WebDriver mydriver;
    @Given("^As a chrome user$")
    public void user_is_on_chrome() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am in Given");
    }

    @When("^I access Facebook page$")
    public void user_enters_facebook_path()  {
        // Write code here that turns the phrase above into concrete actions
        myDriver.get("https://facebook.com/");
    }

//    @And("^I see the email id$")
//    public void user_is_on_chrome() {
//        System.out.println("I see the email id"

    @Then("^I need to see the Facebook homepage elements$")
    public void it_should_open_facebook_page() {
        Assert.assertEquals(true,myDriver.findElement(By.id("email")).isDisplayed());
        Assert.assertEquals(true,myDriver.findElement(By.id("pass")).isDisplayed());
        // Write code here that turns the phrase above into concrete actions
//        myDriver.findElement(By.id("email")).sendKeys("abcdef");
//       myDriver.findElement(By.id("pass")).sendKeys("ASDF");
//        mydriver.findElement(By.id("u_0_2")).click();
       //mydriver.findElement(By.id("u_0_j")).sendKeys("idjge");
       // mydriver.findElement(By.id("u_0_7")).sendKeys("rryyhe");
//        mydriver.findElement(By.id("u_0_l")).sendKeys("eotrhr");
    }
}
