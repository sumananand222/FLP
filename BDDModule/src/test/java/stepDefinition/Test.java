package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepBean.*;

public class Test {

	private WebDriver driver;
	private Bean bean;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver_win32\\chromedriver.exe" );
		
		driver= new ChromeDriver();
	}
	

@Given("^I want to add the product to cart$")
public void i_want_to_add_the_product_to_cart() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  //  throw new PendingException();
	driver.get("D:\\Selenium Workspace\\BDDModule\\product.html");
	bean = new Bean(driver);

}

@When("^I press the Add to Cart button$")
public void i_press_the_Add_to_Cart_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
	bean.setCart();
}


@Then("^Product is added to Cart$")
public void product_is_added_to_Cart() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	String exmessage="Product is added to cart.";
	String acmessage=driver.switchTo().alert().getText();
	Assert.assertEquals(exmessage,acmessage);
	driver.switchTo().alert().accept();
	Thread.sleep(1000);
	driver.close();

}

@Given("^I want to add the product to wishlist$")
public void i_want_to_add_the_product_to_wishlist() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  //  throw new PendingException();
	driver.get("D:\\Selenium Workspace\\BDDModule\\product.html");
	bean = new Bean(driver);

}

@When("^I press the Add to Wishlist button$")
public void i_press_the_Add_to_Wishlist_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
	bean.setWishlist();
}

@Then("^Product is added to Wishlist$")
public void product_is_added_to_Wishlist() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
	String exmessage="Product is added to wishlist.";
	String acmessage=driver.switchTo().alert().getText();
	Assert.assertEquals(exmessage,acmessage);
	driver.switchTo().alert().accept();
	Thread.sleep(1000);
	driver.close();
}

}
