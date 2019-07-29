import devexpress.Example;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MyFirstSeleniumTest extends Startup{

    @Test
    public void seleniumTest(){
        String webpage = "http://devexpress.github.io/testcafe/example";
        driver.get(webpage);

        Example example = new Example();

        driver.findElement(example.getNameField()).clear();
        driver.findElement(example.getNameField()).sendKeys("Username123456");
//        driver.findElement(By.xpath("//input[@name='name']")).sendKeys(Keys.ENTER);

//        driver.findElement(example.getReuseCheckbox()).click();;
//        driver.findElement(example.getRemoteCheckbox()).click();;

        driver.findElement(example.getEnableSlider()).click();;

        clickSlider(6);

        // The below code finds all the elements which are of a type checkbox and clicks them (clicks all the checkboxes)
        List<WebElement> elements = driver.findElements(By.xpath("//*[@type='checkbox' ]"));
        for(WebElement ele : elements){
            ele.click();
        }

        // Same as above but typing text
        elements = driver.findElements(By.xpath("//*[@type='text' ]"));

        for(WebElement ele : elements){
            ele.clear();
            ele.sendKeys("Hey");
        }

    }

    private void sleep(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void clickSlider(int Number){
        // Example of how to click on the slider on a defined number
        Example example = new Example();

        WebElement slider = driver.findElement(example.getSlider());
        WebElement number = driver.findElement(example.getNumberOnSlider(Number));
        // Get the location of the number
        int xLocation = number.getLocation().getX();
//        Gets the central height of the slider
        int yLocation = (slider.getSize().height/2) + slider.getLocation().getY();

        // Click at a specified point on the page, which is our x and y we got above
        Actions builder = new Actions(driver);
        builder.moveByOffset(xLocation, yLocation).click().build().perform();

    }

}
