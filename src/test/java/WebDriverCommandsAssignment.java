import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommandsAssignment {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.syntaxprojects.com/");
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.close();

    }
}
