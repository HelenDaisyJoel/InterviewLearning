import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class windowHandles {
	 public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("ChatGPT");
		 Thread.sleep(1000);
		 List<WebElement> list=driver.findElements(By.xpath("//div[@class='erkvQe']//ul/li"));
		 int size=list.size();
		 System.out.println(size);
		 
		 WebElement thirdSuggestion = list.get(2);  // Index 2 is the 3rd element
         System.out.println("Third suggestion: " + thirdSuggestion.getText());

         // Click the third suggestion
         thirdSuggestion.click();
		 
		 
		 
		 // Open a new tab and switch to it
	        ((JavascriptExecutor)driver).executeScript("window.open('about:blank', '_blank');");
	        
	        // Switch to the new tab
	        for (String tabHandle : driver.getWindowHandles()) {
	        	System.out.println(tabHandle);
	            driver.switchTo().window(tabHandle);
	        }
	        
	        // Navigate to Google in the new tab
	        driver.get("https://chatgpt.com/?ref=dotcom");
	        
	        // You can now continue to interact with the Google page
		 
	 }

}
