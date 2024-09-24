package Week14;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsAssignment {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo-homework.php");
//1
        WebElement Alert1= driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        Alert1.click();
        Thread.sleep(2000);
        Alert alert= driver.switchTo().alert();
        alert.accept();
//2
        WebElement Alert2= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        Alert2.click();
        Thread.sleep(2000);
        alert.dismiss();
        String alertConfirmation= driver.findElement(By.xpath("//*[@id='confirm-demo']")).getText();
        System.out.println(alertConfirmation);
//3
        WebElement Alert3= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        Alert3.click();
        Thread.sleep(2000);
        alert.sendKeys("Mellisa");
        alert.accept();
        String displayConfirmation=driver.findElement(By.xpath("//*[@id='prompt-demo']")).getText();
        System.out.println(displayConfirmation);

    }
}
