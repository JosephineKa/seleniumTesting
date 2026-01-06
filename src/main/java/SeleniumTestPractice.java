import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTestPractice {
    public static void main(String[] args){
        // creating a new code driver instance
        WebDriver  driver = new ChromeDriver();

//Navigate into the web page
        driver.get("https://www.saucedemo.com/");

        WebElement  searchBox = driver.findElement(By.name("q"));

        searchBox.sendKeys("Selenium");

        searchBox.submit();

    }

}
