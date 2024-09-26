package Week14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitAssignment {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait-homework.php");
//1
        WebElement textButton= driver.findElement(By.xpath("//button[@id='changetext_button']"));
        textButton.click();

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"),"Ssyntaxtechs"));

        WebElement changedText= driver.findElement(By.xpath("//h2[@id='headingtext']"));
        System.out.println(changedText.getText());
//2
        WebElement enableButton= driver.findElement(By.xpath("//button[@id='enable_button']"));
        enableButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));

        WebElement button= driver.findElement(By.xpath("//button[text()='Button']"));
        button.click();
//3
        WebElement checkboxButton= driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        checkboxButton.click();

        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox']")));

        WebElement checkbox= driver.findElement(By.xpath("//input[@id='checkbox']"));
        System.out.println("The checkbox is selected: "+checkbox.isSelected());
    }
}
