package Week13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathAssignment {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/Xpath-homework.php");

        WebElement hobbies= driver.findElement(By.xpath("//input[@id='yourHobbiesId']"));
        hobbies.sendKeys("automation");

        WebElement button= driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();

        WebElement movies= driver.findElement(By.xpath("//input[@id='favoriteMoviesId']"));
        movies.sendKeys("mcqueen");

        WebElement paragraph= driver.findElement(By.xpath("//label[contains(text(),'amet consectetur adipisicing elit')]"));
        String paragraph1=paragraph.getText();
        System.out.println(paragraph1);

        WebElement city= driver.findElement(By.xpath("//input[@id='yourCity']"));
        city.sendKeys("fairfax");

        WebElement personalEmail= driver.findElement(By.xpath("//input[@id='private_email_id']"));
        personalEmail.sendKeys("mellisaouttrim@gmail.com");

        WebElement officeEmail= driver.findElement(By.xpath("//input[@id='office_email_id']"));
        officeEmail.sendKeys("mellisaouttrim@office.com");

        WebElement professionalEmail= driver.findElement(By.xpath("//input[@id='professional_email_id']"));
        professionalEmail.sendKeys("mellisaouttrim@professional.com");

        WebElement clientName= driver.findElement(By.xpath("//input[@data-detail='one' and @name='clientName']"));
        clientName.sendKeys("emma");

        WebElement clientId= driver.findElement(By.xpath("//input[@data-detail='two' and @name='clientId']"));
        clientId.sendKeys("1234567890");

        WebElement streetNo= driver.findElement(By.xpath("//input[@name='StreetNo']"));
        streetNo.sendKeys("12345");

        WebElement houseNo= driver.findElement(By.xpath("//input[@name='HouseNo']"));
        houseNo.sendKeys("54321");




    }
}
