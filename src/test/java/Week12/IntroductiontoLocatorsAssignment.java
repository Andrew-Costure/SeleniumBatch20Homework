package Week12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroductiontoLocatorsAssignment {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/locator-homework.php");

        WebElement fullName=driver.findElement(By.id("fullName"));
        fullName.sendKeys("Mellisa Outtrim");

        WebElement email=driver.findElement(By.name("yourEmail"));
        email.sendKeys("mellisaouttrim@gmail.com");

        WebElement clientName= driver.findElement(By.id("clientNameId"));
        clientName.sendKeys("Emma");

        WebElement clientID=driver.findElement(By.name("ClientId"));
        clientID.sendKeys("1234567890");

        WebElement clientFeedback=driver.findElement(By.id("ClientfeedbackId"));
        clientFeedback.sendKeys("asdfghjkl");

        WebElement projectName=driver.findElement(By.id("ProjectNameId"));
        projectName.sendKeys("Project1");

        WebElement projectDeadlineTime=driver.findElement(By.id("ProjectTimeId"));
        projectDeadlineTime.sendKeys("Tomorrow");

        WebElement currentAddress=driver.findElement(By.name("CurrentAddress"));
        currentAddress.sendKeys("123 Street");

        WebElement permanentAddress=driver.findElement(By.name("PermanentAddress"));
        permanentAddress.sendKeys("123 Lane");

        WebElement link1= driver.findElement(By.partialLinkText("Click"));
        link1.click();
        WebElement submit=driver.findElement(By.name("btn-submit"));
        submit.click();



    }
}
