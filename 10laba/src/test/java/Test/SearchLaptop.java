package Test;

import Page.*;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class SearchLaptop {
	private static MainPage mainPage;
	private static LaptopPage laptopPage;
	public static WebDriver driver;
	
	public SearchLaptop() {
	
	}
	
	 @BeforeClass
	    public static void setup() {
	        System.setProperty("webdriver.edge.driver","D:\\browserDrivers\\edgedriver_win64\\msedgedriver.exe");
	        
	        driver = new EdgeDriver();
	        mainPage = new MainPage(driver);
	        laptopPage = new LaptopPage(driver);
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        driver.get("https://www.amd.by/"); 
	    }
	 
	
	
	 
	 @Test
	    public void searchLaptopTest() {
		 mainPage.entryStartMenu();
		 mainPage.sendInputMenu("ноутбук");
		 mainPage.clickLinkLaptop();
		 laptopPage.entryDiscountLabel();
	 }
	 
}
