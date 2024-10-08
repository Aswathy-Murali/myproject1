package testpkg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.CartPage;
import pagepkg.InventoryPage;
import pagepkg.LoginPage;
import pagepkg.CheckoutPage;
public class TestPage {
	WebDriver driver;
	@BeforeTest
	public void loadURL()
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	@Test(priority=1)
	public void loginPage() throws InterruptedException
	{
	LoginPage loginobj=new LoginPage(driver);
	String password="secret_sauce";
	loginobj.sendLoginValues("locked_out_user1", password);
	loginobj.clickLogin();
	loginobj.sendLoginValues("problem_user2", password);
	loginobj.clickLogin();
	loginobj.sendLoginValues("performance_glitch_user4", password);
	loginobj.clickLogin();
	loginobj.sendLoginValues("standard_user", password);
	loginobj.clickLogin();	
	}
	@Test(priority=2)
	public void InventoryPage() throws InterruptedException
	{
	InventoryPage InventoryObj=new InventoryPage(driver);
	InventoryObj.clickAddToCart();
	Thread.sleep(2000);
	InventoryObj.goToCart();
	Thread.sleep(2000);
	}
	
	@Test(priority=3)
	public void cartPage() throws InterruptedException
	{
		CartPage CartPageObj=new CartPage(driver);
		CartPageObj.checkout();
		Thread.sleep(2000);
	}
	
	@Test(priority=4)
	public void CheckoutPage() throws InterruptedException
	{
		CheckoutPage checkoutObj=new CheckoutPage(driver);
		checkoutObj.setAddress("Aswathy", "Murali","343543");
		Thread.sleep(2000);
		checkoutObj.continueBtn();
		Thread.sleep(2000);
	}
}
