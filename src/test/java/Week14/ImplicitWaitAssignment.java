package Week14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitAssignment {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-waits-homework.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement click= driver.findElement(By.xpath("//button[@id='show_text_synchronize_three']"));
        click.click();

        WebElement checkbox= driver.findElement(By.xpath("//input[@value='Option-1']"));
        checkbox.click();

    }
}
