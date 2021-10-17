import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static void main(String Arg[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/liubovrukhlina/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        Thread.sleep(200);
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();

    }
}
