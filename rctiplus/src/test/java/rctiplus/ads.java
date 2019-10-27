package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ads {
	WebDriver driver;
	public ads(WebDriver driver) {
		this.driver = driver;
	}
	
	public void testAds() {
		Boolean ads = driver.findElement(By.cssSelector("img[class='img-fluid']")).isDisplayed();
		System.out.println("Apakah iklan Tampil ? " + (ads ? "" : "NOT ") + " Tampil");
		Assert.assertTrue(ads);
	}
}