package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v106.input.Input;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jdk.javadoc.internal.tool.Start;

import java.time.Duration;

public class MainPage {
	
	
	public WebDriver driver;
	
	
	public MainPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	     this.driver = driver;
	}
	
	@FindBy(xpath = "/html/body/div[3]/header/div/div/div[1]/div[2]/div/form/input")
	private WebElement StartMenu;
	
	
	@FindBy(xpath = "/html/body/div[22]/div/div[1]/div/div/form/input")
	private WebElement InputMenu;
	
	
	@FindBy(xpath = "/html/body/div[22]/div/div[1]/div/div[2]/div/div[2]/div/div[1]/a")
	private WebElement LinkLaptops;
	
	@FindBy(xpath = "/html/body/div[13]/div[2]/div/div/div[1]/div/div[1]/div/div/div[2]/div[2]/div[2]/div[2]")
	private WebElement favouriteDiv;
	
	@FindBy(xpath = "/html/body/div[4]/div[3]/div/div[5]/a[3]")
	private WebElement linkFavourite;
	
	public void entryStartMenu() {
		new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.visibilityOf(StartMenu));
		StartMenu.click();
	}
	
	public void sendInputMenu(String search) {
		 new WebDriverWait(driver, Duration.ofSeconds(5))
         .until(ExpectedConditions.visibilityOf(InputMenu));
		InputMenu.click();
		InputMenu.sendKeys(search);
	}
	
	public void clickLinkLaptop() {
		new WebDriverWait(driver, Duration.ofSeconds(5))
        .until(ExpectedConditions.visibilityOf(LinkLaptops));
		LinkLaptops.click();
	}
	
	public void entryFavouriteDiv() {
		new WebDriverWait(driver, Duration.ofSeconds(5))
        .until(ExpectedConditions.visibilityOf(favouriteDiv));
		new Actions(driver).moveToElement(favouriteDiv).click().perform();
	}
	
	public void entryFavoutite() {
		new WebDriverWait(driver, Duration.ofSeconds(5))
        .until(ExpectedConditions.visibilityOf(linkFavourite));
		linkFavourite.click();
	}
	
}
