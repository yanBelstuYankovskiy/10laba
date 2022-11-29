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


public class LaptopPage {
	
	public WebDriver driver;

	public LaptopPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	    this.driver = driver;
	}
	
	@FindBy(xpath = "/html/body/div[10]/div[2]/aside/div[1]/div[3]/div[2]/div/label[1]/input")
	private WebElement discountLabel;
	
	
	
	
	
	public void entryDiscountLabel() {
		new WebDriverWait(driver, Duration.ofSeconds(5))
        .until(ExpectedConditions.visibilityOf(discountLabel));
		discountLabel.click();
	}
	
	
}
