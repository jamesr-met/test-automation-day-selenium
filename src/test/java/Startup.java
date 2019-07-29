import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Startup {

    WebDriver driver;

    @Before
    public void setUP(){
        System.setProperty("webdriver.gecko.driver","C:\\WebDrivers\\geckodriver.exe");
//        The below can be used as an alternative to the line above. This uses the library webdrivermanager to set the webdriver
//        WebDriverManager.firefoxdriver().setup();

        this.driver = new FirefoxDriver();
    }

    @After
    public void tearDown(){
        this.driver.quit();
    }
}
