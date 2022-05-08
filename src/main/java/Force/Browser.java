package Force;
	   
	   import java.util.concurrent.TimeUnit;
	   import org.openqa.selenium.WebDriver;
	   import org.openqa.selenium.chrome.ChromeDriver;
	   import org.openqa.selenium.chrome.ChromeOptions;
	   import org.openqa.selenium.ie.InternetExplorerDriver;
	   public class Browser {
	   public WebDriver driversetup(String browser){
	    if(browser.equals("chromedriver")){
	    ChromeOptions co= new ChromeOptions();
	    co.addArguments("--disable-notifications");
	    System.setProperty("webdriver.chrome.driver","E:\\CtsTraining\\Drivers\\selenium\\chromedriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.navigate().to("https://www.goibibo.com/");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    return driver;
	    }
	    else if(browser.equals("iedriver")){
	    System.setProperty("webdriver.ie.driver", "C:\\Users\\779709\\Documents\\Selenium\\chromedriver_win32\\IEDriverServer.exe");
	    WebDriver driver = new InternetExplorerDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.navigate().to("https://www.goibibo.com/");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    return driver;
	    }
	    return null;
	   }
	   }


