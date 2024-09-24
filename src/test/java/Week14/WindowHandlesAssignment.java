package Week14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesAssignment {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo-homework.php");
//1
        WebElement b1= driver.findElement(By.xpath("//a[text()='Open B1 Page ']"));
        b1.click();
//2
        WebElement b2= driver.findElement(By.xpath("//a[text()=' Open B2 Page ']"));
        b2.click();
    }
}
