package Week13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommandsAssignment {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");
//1
        WebElement attribute= driver.findElement(By.xpath("//div[@id='textattr']"));
        String attributeVal=attribute.getAttribute("data-text-attr");
        System.out.println(attributeVal);
//2
        WebElement musicFestival= driver.findElement(By.xpath("//input[@value='music_festival']"));
        boolean stateofMF=musicFestival.isEnabled();
        System.out.println("The state of radio button is enabled: "+stateofMF);
        musicFestival.click();

        WebElement techTalk= driver.findElement(By.xpath("//input[@value='tech_talk']"));
        boolean stateofTT= techTalk.isEnabled();
        System.out.println("The state of radio button is enabled: "+stateofTT);

        WebElement toggle= driver.findElement(By.xpath("//button[text()='Show More Options']"));
        toggle.click();

        WebElement artExhib= driver.findElement(By.xpath("//input[@value='art_exhibition']"));
        boolean displayofAE=artExhib.isDisplayed();
        System.out.println("The radio button is displayed: "+displayofAE);
        artExhib.click();
//3
        WebElement mystery= driver.findElement(By.xpath("//div[@id='hidden_message']"));
        String mysteryAttr=mystery.getAttribute("data-text");
        System.out.println(mysteryAttr);
//4
        WebElement checkbox1= driver.findElement(By.xpath("//input[@name='CheckboxFirst']"));
        boolean stateofCB1= checkbox1.isEnabled();
        System.out.println("The state of radio button is enabled: "+stateofCB1);
        checkbox1.click();

        WebElement checkbox2= driver.findElement(By.xpath("//input[@name='disabledCheckbox']"));
        boolean stateofCB2= checkbox2.isEnabled();
        System.out.println("The state of radio button is enabled: "+stateofCB2);
//5
        WebElement input= driver.findElement(By.xpath("//input[@id='inputField']"));
        input.clear();
        input.sendKeys("Here is the custom text entered");




    }
}
