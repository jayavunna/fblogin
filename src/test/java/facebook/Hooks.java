package facebook;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    static WebDriver myDriver;

    @Before
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\jayav\\Downloads\\selenium\\chromedriver.exe");
        myDriver=new ChromeDriver();
    }

    @After
    public void afterMethod(){
        myDriver.quit();
    }
}
