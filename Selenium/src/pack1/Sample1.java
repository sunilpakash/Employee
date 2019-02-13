package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.puma.com/catalog/product/view/id/90001/s/hybrid_runner_unrest-191507/category/62/?oid=20&csku=19150701");
		
		WebElement price1 = driver.findElement(By.xpath("//fieldset[@id='product-options-wrapper']//span[contains(@id,'product-price')]/../..//p[@class='old-price']"));
		String oldPrice=price1.getText();
		oldPrice=oldPrice.substring(1);
		oldPrice=oldPrice.replaceAll(",", "");
		System.out.println("Old Price="+oldPrice);
		WebElement price2 = driver.findElement(By.xpath("//fieldset[@id='product-options-wrapper']//span[contains(@id,'product-price')]"));
		String newPrice=price2.getText();
		newPrice=newPrice.substring(1);
		newPrice=newPrice.replaceAll(",", "");
		System.out.println("New Price="+newPrice);
		driver.close();
		
		int p1=Integer.parseInt(oldPrice);
		int p2=Integer.parseInt(newPrice);
		System.out.println("Discount amount="+(p1-p2));
		
	}
  
}
