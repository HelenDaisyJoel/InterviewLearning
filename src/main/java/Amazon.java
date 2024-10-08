
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Amazon {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	driver.findElement(By.xpath("(//a[@id='icp-touch-link-language'])[1]")).click();
	Thread.sleep(2000);
	Actions actions = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	// Locate the Tamil language option radio button with explicit wait
	WebElement tamilLanguageOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"icp-language-settings\"]/div[4]/div/label/i")));
	actions.moveToElement(tamilLanguageOption).click().perform();
//	tamilLanguageOption.click();
	 // Scroll to the Tamil option using JavaScriptExecutor
//    js.executeScript("arguments[0].scrollIntoView(true);", tamilLanguageOption);
//    
//    // Click the Tamil option to select it
//    tamilLanguageOption.click();

    // Wait for the language change to take effect
    Thread.sleep(2000);

    // Confirm the selection by clicking the "Save Changes" button
    WebElement saveChangesButton = driver.findElement(By.xpath("//span[@class='a-button-inner']/input[@class='a-button-input']"));
    saveChangesButton.click();
    
    // Wait for the language change to take effect
    Thread.sleep(2000);
    
    // Close the browser
    driver.quit();
	
	
	
	
	}

}
