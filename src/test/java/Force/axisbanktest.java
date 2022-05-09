package Force;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class axisbanktest {
 WebDriver driver;
 @BeforeMethod
 public void test1() throws Exception
 {
 ChromeOptions chromeOptions = new ChromeOptions();
 chromeOptions.addArguments("--disable-notifications");
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidyasri\\Desktop\\selenium\\chromedriver.exe");
  driver = new ChromeDriver(chromeOptions);
 driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
 driver.get("https://www.axisbank.com/personal/calculators/fd-monthly-investment-calculator");
 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 }
 @Test
public void searching() throws Exception
 {
 //selecting the type of deposit as monthly investment
  driver.findElement(By.xpath("(//div[@class='sbHolder']//a[@class='sbToggle'])[1]")).click();
Thread.sleep(2000);
 driver.findElement(By.xpath("(//a[@class='sbFocus'])[1]")).click();
 Thread.sleep(5000);
 WebElement we=driver.findElement(By.xpath("//input[@name='ctl00$Body$C002$txtAmount']"));
 we.clear();
 we.sendKeys("30000");
 Thread.sleep(5000);
 driver.navigate().back();
 Thread.sleep(3000);
 String rate=driver.findElement(By.xpath("(//div[@class='interest_rate']//span[@class='inst_amt'])")).getText();
 Thread.sleep(2000);
      System.out.println("Interset rate="+rate);
      System.out.println("Interset rate="+rate);
      System.out.println("Interset rate="+rate);
      System.out.println("Interset rate="+rate);
      Thread.sleep(3000);
      driver.findElement(By.xpath("//a[@id='ctl00_Body_C002_btnCal']")).click();
      Thread.sleep(6000);
     String MaturityAmount= driver.findElement(By.xpath("//span[@class='maturity_amt grossTotal']")).getText();
      System.out.println("Maturity Amount="+MaturityAmount);
      Thread.sleep(3000);
 }
 @AfterMethod
 public void exit()
 {
 driver.quit();
 }
 }


