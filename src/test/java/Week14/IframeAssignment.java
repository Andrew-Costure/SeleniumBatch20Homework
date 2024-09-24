package Week14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeAssignment {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/handle-iframe-homework.php");
//1
        driver.switchTo().frame("dropdownIframe");
        driver.switchTo().frame("checkboxIframe");

        WebElement age= driver.findElement(By.xpath("//input[@class='cb1-element']"));
        age.click();
//2
        driver.switchTo().defaultContent();
        driver.switchTo().frame("dropdownIframe");

        WebElement city= driver.findElement(By.xpath("//*[@id='cities']"));
        Select sel=new Select(city);
        sel.selectByVisibleText("Chicago");
//3
        driver.switchTo().defaultContent();
        driver.switchTo().frame("textfieldIframe");

        WebElement username= driver.findElement(By.xpath("//input[@name='Username']"));
        username.sendKeys("mellisaouttrim");
    }
}
