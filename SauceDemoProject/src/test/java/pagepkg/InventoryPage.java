package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends BaseClass {
	
WebDriver driver;
@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
WebElement button1;

@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
WebElement button2;

@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
WebElement button3;

@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
WebElement button4;

@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
WebElement button5;

@FindBy(xpath="//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
WebElement button6;

@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
WebElement cartButton;


	public InventoryPage (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
		
	}
	
	public void clickAddToCart()
	{
		button1.click();
		button2.click();
		button3.click();
		button4.click();
		button5.click();
		button6.click();
		
	}
	public void goToCart()
	{
		cartButton.click();
	}
	
	
}
