package Week13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpathAssignment {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath-homework.php");

        WebElement least1= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        least1.sendKeys("java");

        WebElement least2= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        least2.sendKeys("selenium");

        WebElement least3= driver.findElement(By.xpath("//input[@id='least-favorite']"));
        least3.sendKeys("cucumber");

        WebElement favorite1= driver.findElement(By.xpath("//input[@id='favouriteBook']"));
        favorite1.sendKeys("mcqueen");

        WebElement favorite2= driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
        favorite2.sendKeys("mater");

        WebElement favorite3= driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[2]"));
        favorite3.sendKeys("sally");

        WebElement name1= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        name1.sendKeys("gma");

        WebElement name2= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        name2.sendKeys("mom");

        WebElement name3= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        name3.sendKeys("me");

    }
}
