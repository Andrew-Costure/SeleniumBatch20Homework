package Week13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtonsAssignment {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");
//1
        WebElement juice= driver.findElement(By.xpath("//input[@value='Juice']"));
        juice.click();
//2
        List<WebElement> preferredOpt= driver.findElements(By.xpath("//input[@name='working_enviroment']"));

        for (WebElement preferred:preferredOpt){

            if (preferred.getAttribute("value").equals("hybrid")) {
                preferred.click();
            }
        }
//3
        WebElement enableRadio= driver.findElement(By.xpath("//button[@id='enabledFruitradio']"));
        enableRadio.click();

        WebElement spring= driver.findElement(By.xpath("//input[@value='spring']"));
        boolean stateofSpring= spring.isEnabled();
        System.out.println("Spring is enabled: "+stateofSpring);
        spring.click();

        WebElement winter= driver.findElement(By.xpath("//input[@value='winter']"));
        boolean stateofWinter=winter.isDisplayed();
        System.out.println("Winter is displayed: "+stateofWinter);

        WebElement showRadio= driver.findElement(By.xpath("//button[@id='showRadioButtons']"));
        showRadio.click();

        stateofWinter= winter.isDisplayed();
        boolean selectionofWinter=winter.isEnabled();
        System.out.println("Winter is displayed: "+stateofWinter);
        System.out.println("Winter is enabled: "+selectionofWinter);
//4
        List<WebElement> meal=driver.findElements(By.xpath("//input[@name='meal']"));

        for (WebElement favorite:meal){

            if (favorite.getAttribute("value").equals("lunch")){
                favorite.click();
            }
        }

    }
}
