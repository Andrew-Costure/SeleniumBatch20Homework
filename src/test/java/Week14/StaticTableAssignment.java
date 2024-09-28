package Week14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaticTableAssignment {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/table-search-filter-demo-homework.php");

        List<WebElement> allUSA= driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[3]"));
        int count=1;
        for(WebElement usa:allUSA){
            String countryValue =usa.getText();
            if(countryValue.equals("USA")){
                WebElement row= driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+count+"]"));
                System.out.println(row.getText());
            }
            count=count+1;
        }

    }
}
