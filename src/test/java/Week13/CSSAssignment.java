package Week13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSAssignment {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector-homework.php");

        WebElement userId= driver.findElement(By.cssSelector("input[id='UserID']"));
        userId.sendKeys("1234567890");

        WebElement userName= driver.findElement(By.cssSelector("input[id='UserName']"));
        userName.sendKeys("mellisa");

        WebElement lectureIntro= driver.findElement(By.cssSelector("input[name='LectureIntro']"));
        lectureIntro.sendKeys("css");

        WebElement feedbackRay= driver.findElement(By.cssSelector("input[id='FeedbackFromRay']"));
        feedbackRay.sendKeys("hard");

        WebElement feedbackDucky= driver.findElement(By.cssSelector("input[id='FeedbackfromDucky']"));
        feedbackDucky.sendKeys("easy");

        WebElement clientId= driver.findElement(By.cssSelector("input[name='ClientID']"));
        clientId.sendKeys("0987654321");

        WebElement email= driver.findElement(By.cssSelector("input[name='email']"));
        email.sendKeys("mellisaouttrim@gmail.com");

        WebElement courseTopic= driver.findElement(By.cssSelector("input[name='CourseTopic']"));
        courseTopic.sendKeys("selenium");

    }
}
