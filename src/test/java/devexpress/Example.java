package devexpress;

import org.openqa.selenium.By;

public class Example {

    public By getNameField() {
        return nameField;
    }

    public By getPopulateButton() {
        return populateButton;
    }

    public By getRemoteCheckbox() {
        return remoteCheckbox;
    }

    public By getReuseCheckbox() {
        return reuseCheckbox;
    }

    private By nameField = By.xpath("//input[@name='name']");
    private By populateButton = By.id("populate");

    private By remoteCheckbox = By.id("remote-testing");
    private By reuseCheckbox = By.xpath("//input[@type='checkbox' and @name='re-using']");

    public By getNumber3Slider() {
        return number3Slider;
    }

    public By getEnableSlider() {
        return enableSlider;
    }

    public By getSlider() {
        return slider;
    }

    private By enableSlider = By.id("tried-test-cafe");
    private By number3Slider = By.xpath("//*[@class='slider-value' and text()='3' ]");

    public By getNumberOnSlider(int number) {
        return By.xpath("//*[@class='slider-value' and text()='"+number+"' ]");
    }

    private By number4Slider = By.xpath("//*[@class='slider-value' and text()='4' ]");
    private By slider = By.xpath("//*[@id='slider' ]");
}
