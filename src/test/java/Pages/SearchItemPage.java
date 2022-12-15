package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class SearchItemPage extends TestBase{
	
	@FindBy(css ="ul > li.preview")
	WebElement item;

	@FindBy(xpath = "//button[contains(text(), 'Add to cart')]")
	WebElement addtoCartBtn;
	
	public SearchItemPage() throws InterruptedException {
		Thread.sleep(100);
		PageFactory.initElements(driver, this);
	}
	public boolean isItemListed() {
		return item.isDisplayed();
	}
	
    //select item
	public void selectItem() throws InterruptedException {
		Thread.sleep(100);
		item.click();
	}
	
	public void addToCart() throws InterruptedException {
		Thread.sleep(100);
		addtoCartBtn.click();
	}
	

}
