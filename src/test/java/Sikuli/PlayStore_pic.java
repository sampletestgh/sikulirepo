package Sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayStore_pic {

	public static void main(String[] args) throws Throwable  
		
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.cssSelector("svg[class='gb_h']")).click();
		
		Screen src=new Screen();
		Pattern play=new Pattern("C:\\Users\\Admin\\eclipse-workspace\\Sikuli_Project\\playicon.png");
		Thread.sleep(5000);
		//src.wait(play, 20);
	src.click(play);
	
	
	}

}
