package Week14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTableAssignment {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        List<WebElement> allIDs= driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        boolean notFound= true;
        while(notFound) {
            int count = 1;
            for (WebElement id : allIDs) {
                String idNo = id.getText();
                if (idNo.equals("111005A")) {
                    WebElement checkBox = driver.findElement(By.xpath("//table//tbody/tr[" + count + "]/td[1]"));
                    checkBox.click();
                    notFound=false;
                }
                count = count + 1;
            }
            if(notFound) {
                WebElement nextButton= driver.findElement(By.xpath("//a[text()='Next'][1]"));
                nextButton.click();
                allIDs= driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

            }
        }


    }
}
