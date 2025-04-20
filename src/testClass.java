import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testClass {

	WebDriver driver = new EdgeDriver();
	String URL = "https://www.saucedemo.com/";

	@BeforeTest
	public void MySetup() {
		driver.manage().window().maximize();
		driver.get(URL);

	}

	@Test(priority = 1)
	public void Login() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
	}

	@Test(priority = 2)
	public void AddOneRandomItem() throws InterruptedException {

		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(3000);

	}

	@Test(priority = 3, enabled = false)
	public void RemoveItemFromCart() {
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();

	}
	@Test(priority = 4, enabled = false)
	public void Logout() throws InterruptedException {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("logout_sidebar_link")).click();

	}

	@AfterTest
	public void DoNothing() {
		
	}


}
