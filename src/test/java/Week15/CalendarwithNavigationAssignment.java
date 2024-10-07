package Week15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalendarwithNavigationAssignment {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/jquery-date-picker-demo-homework.php");

        WebElement c1= driver.findElement(By.xpath("//input[@id='from_date']"));
        c1.click();

        boolean dateChoice= false;
        while(!dateChoice){
            WebElement month= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
            String currentMonth= month.getText();
            WebElement year= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
            String currentYear= year.getText();
            if (currentMonth.equals("January") && currentYear.equals("2025")){
                List<WebElement> dates= driver.findElements(By.xpath("//table/tbody/tr/td/a"));
                for(WebElement date:dates){
                    if(date.getText().equals("17")){
                        date.click();
                        dateChoice=true;
                        break;
                    }
                }
            }else {
                WebElement nextButton= driver.findElement(By.xpath("//span[text()='Next']"));
                nextButton.click();
            }
        }


        WebElement c2= driver.findElement(By.xpath("//input[@id='to_date']"));
        c2.click();

        boolean dateChoice2= false;
        while(!dateChoice2){
            WebElement month= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
            String currentMonth= month.getText();
            WebElement year= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
            String currentYear= year.getText();
            if(currentMonth.equals("January") && currentYear.equals("2025")){
                List<WebElement> dates= driver.findElements(By.xpath("//table/tbody/tr/td/a"));
                for(WebElement date:dates){
                    if (date.getText().equals("31")){
                        date.click();
                        dateChoice2= true;
                        break;
                    }
                }
            }else{
                WebElement nextButton= driver.findElement(By.xpath("//span[text()='Next']"));
                nextButton.click();
            }

        }
    }
}
