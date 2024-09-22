package Week13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDownwithoutSelectTagAssignment {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");
//1
        WebElement fruit= driver.findElement(By.xpath("//div[@id='dream_fruits']"));
        fruit.click();

        List<WebElement> optionsF= driver.findElements(By.xpath("//ul[@class='dropdown-menu single-dropdown-menu']/li/a"));

        for (WebElement option:optionsF){
            String optionText=option.getText();

            if(optionText.equals("Mango")){
                option.click();
            }
        }
//2
        WebElement hobbies= driver.findElement(By.xpath("//div[@id='favorite_hobbies']"));
        hobbies.click();

        List<WebElement> optionsH= driver.findElements(By.xpath("//ul[@class='dropdown-menu multi-dropdown-menu']/li/a"));

        for(WebElement option:optionsH){
            String optionText=option.getText();

            if(optionText.equals("Reading")){
                option.click();
            }
        }


    }
}
