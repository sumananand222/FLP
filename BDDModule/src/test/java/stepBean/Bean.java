package stepBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bean {
	
	WebDriver driver;

	@FindBy(name="cart")
	@CacheLookup
	WebElement cart;
	
	@FindBy(name="wishlist")
	@CacheLookup
	WebElement wishlist;
	
	public Bean(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getCart() {
		return cart;
	}

	public void setCart() {
		this.cart.click();
	}

	public WebElement getWishlist() {
		return wishlist;
	}

	public void setWishlist() {
		this.wishlist.click();
	}

	
}
