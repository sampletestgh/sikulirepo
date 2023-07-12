package Sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenExcel {

	public static void main(String[] args) throws Throwable {
		
	//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		Screen scr= new Screen();
		Pattern miniBar=new Pattern("C:\\Users\\Admin\\eclipse-workspace\\Sikuli_Project\\miniBar.png");
		scr.click(miniBar);
	}

}
