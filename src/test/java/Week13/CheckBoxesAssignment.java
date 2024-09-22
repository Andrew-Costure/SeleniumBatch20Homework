package Week13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxesAssignment {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");
//1
        WebElement subscribe= driver.findElement(By.xpath("//input[@id='newsletter']"));
        subscribe.click();
//2
        List<WebElement> hobbies= driver.findElements(By.xpath("//input[@class='cb-element']"));

        for (WebElement select:hobbies){

            if (select.getAttribute("value").equals("reading")){
                select.click();
            } else if (select.getAttribute("value").equals("cooking")) {
                select.click();
            }
        }
//3
        WebElement support= driver.findElement(By.xpath("//input[@value='Support']"));
        boolean stateofSupport= support.isDisplayed();
        System.out.println("Support is displayed: "+stateofSupport);

        WebElement music= driver.findElement(By.xpath("//input[@value='Music']"));
        boolean stateofMusic= music.isDisplayed();
        System.out.println("Music is displayed: "+stateofMusic);

        WebElement showCheckboxes= driver.findElement(By.xpath("//button[@id='toggleCheckboxButtons']"));
        showCheckboxes.click();
        Thread.sleep(1000);
        music.click();
//4
        WebElement receiveNotif= driver.findElement(By.xpath("//input[@value='Receive-Notifications']"));
        boolean stateofRN= receiveNotif.isEnabled();
        System.out.println("Receive Notifications is enabled: "+stateofRN);

        WebElement enableCheckboxes= driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        enableCheckboxes.click();
        Thread.sleep(1000);
        receiveNotif.click();



    }
}
