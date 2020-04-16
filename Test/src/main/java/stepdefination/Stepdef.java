package stepdefination;
//djsdnskdn
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {
	WebDriver driver;

@Given("^Open the chrome and launch the application$")
public void open_the_chrome_and_launch_the_application() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanagan2\\Desktop\\JMH\\Selenium project\\Drivers\\chromedriver1.exe");
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanagan2\\Downloads\\chromedriver.exe");
	
	//driver = new ChromeDriver();
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanagan2\\Downloads\\chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver", chromeDriverPath);

	ChromeOptions options = new ChromeOptions();
	options.addArguments("test-type"); 
	options.addArguments("start-maximized"); 
	options.addArguments("--js-flags=--expose-gc"); 
	options.addArguments("--enable-precise-memory-info"); 
	options.addArguments("--disable-popup-blocking"); 
	options.addArguments("--disable-default-apps"); 
	options.addArguments("test-type=browser"); 
	options.addArguments("disable-infobars"); 
	options.addArguments("no-sandbox");
	options.setExperimentalOption("useAutomationExtension", false);
	options.addArguments("disable-extensions");
	 
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	/*System.setProperty("webdriver.ie.driver", "C:\\Users\\sanagan2\\Downloads\\IEDriverServer.exe");
	
	DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
	desiredCapabilities = DesiredCapabilities.internetExplorer();
	desiredCapabilities.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING,false);
	desiredCapabilities.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
	desiredCapabilities.setCapability(InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR, true);
	desiredCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	desiredCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true); 
	desiredCapabilities.setJavascriptEnabled(true);
	InternetExplorerOptions options = new InternetExplorerOptions(desiredCapabilities);
	desiredCapabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
	
	driver = new InternetExplorerDriver(desiredCapabilities);*/
	driver.get("http://demo.guru99.com/v4/");
	driver.manage().window().maximize();
	
}

@When("^Enter the Username User(\\d+) and Password password(\\d+)$")
public void enter_the_Username_User_and_Password_password(String username, String password) throws Throwable {
	driver.findElement(By.name("uid")).sendKeys(username);					
    driver.findElement(By.name("password")).sendKeys(password);
}

@Then("^Reset the credential$")
public void reset_the_credential() throws Throwable {
	driver.findElement(By.name("btnReset")).click();
	driver.close();
}


}
