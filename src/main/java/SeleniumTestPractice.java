import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SeleniumTestPractice {
    public static void main(String[] args){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        // creating a new code driver instance
        WebDriver  driver = new ChromeDriver();

//Navigate into the web page
        driver.get("https://www.google.com/");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("facebook");
        searchBox.submit();

        String title = driver.getTitle();
        if (title.contains("selenium")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

       // driver.quit();


    }

}
