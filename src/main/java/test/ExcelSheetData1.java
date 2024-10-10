package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheetData1 {
    public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
        
        FileInputStream fis = new FileInputStream("C:\\SampleWorkspace\\1st-prism-web-integration-test\\OpenCartV21\\TestProject\\TestData\\LoginData.xlsx");
        Workbook w1 = WorkbookFactory.create(fis);
        
        // Get the first row from the sheet
        Row row = w1.getSheet("Sheet1").getRow(0);
        
        // Retrieve username and password based on cell type
        String username = getCellValue(row.getCell(0));
        String password = getCellValue(row.getCell(1));
        
        // Initialize WebDriver and perform login
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")).click();
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
        driver.findElement(By.xpath("(//input[@value='Login'])[1]")).click();
    }

    // Method to get cell value based on its type
    private static String getCellValue(Cell cell) {
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return String.valueOf((int) cell.getNumericCellValue()); // Cast to int if you want to get rid of decimal places
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula(); // Handle formulas if necessary
            case BLANK:
                return "";
            default:
                return "";
        }
    }
}
