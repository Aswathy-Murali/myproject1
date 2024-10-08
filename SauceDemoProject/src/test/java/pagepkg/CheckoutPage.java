package pagepkg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CheckoutPage {

	WebDriver driver;
@FindBy(xpath="//*[@id=\"first-name\"]")
WebElement fname;
@FindBy(xpath="//*[@id=\"last-name\"]")
WebElement lname;
@FindBy(xpath="//*[@id=\"postal-code\"]")
WebElement zipcode;
@FindBy(xpath="//*[@id=\"continue\"]")
WebElement continuebtn;
@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
WebElement logout;
@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
WebElement menu;



public CheckoutPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}


public void setAddress(String fname1,String lname1,String zipcode1)
{
	fname.sendKeys(fname1);
	lname.sendKeys(lname1);
	zipcode.sendKeys(zipcode1);
}
public void continueBtn() throws InterruptedException
{
	continuebtn.click();
	Thread.sleep(2000);
	menu.click();
	Thread.sleep(2000);
	logout.click();
}
}
