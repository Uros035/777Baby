import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sanity {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Programiranje\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.777baby.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/header/div[3]/ul/li[5]/a")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/main/div[1]/div[3]/ul/li[4]")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/main/div[1]/div[3]/ul/li[3]")).click();
		driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div[2]/div[1]/nav/ul/li[2]")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/main/div[1]/div[3]/ul/li[4]")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/main/div[1]/div[3]/ul/li[5]")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div[2]/div[1]/nav/ul/li[3]")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/main/div[1]/div[3]/ul/li[7]")).click();
		driver.findElement(By.xpath("/html/body/main/div[1]/div[3]/ul/li[24]")).click();
		driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div[2]/div[1]/nav/ul/li[4]")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div[2]/div[1]/nav/ul/li[5]")).click();
		driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div[2]/div[1]/nav/ul/li[6]")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div[2]/div[1]/nav/ul/li[7]")).click();
		driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div[2]/div[1]/nav/ul/li[7]/ul/li[1]")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("/html/body/header/div[3]/ul/li[6]/a")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/main/div/div[2]/div[2]/div/nav/ul[1]/li[2]")).click();
		driver.findElement(By.xpath("/html/body/main/div/div[2]/div[2]/div/nav/ul[2]/li[5]")).click();
		driver.findElement(By.xpath("/html/body/main/div/div[2]/div[2]/div/nav/ul[1]/li[7]")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("/html/body/main/div/div[2]/div[2]/div/nav/ul[1]/li[1]")).click();
		driver.findElement(By.id("game-search")).sendKeys("a");
		Thread.sleep(3000L);
		driver.findElement(By.xpath("/html/body/main/div/div[2]/div[2]/div/nav/ul[2]/li[9]")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/main/div/div[4]/div[2]/div[2]/div[2]/div[1]/div/div[1]/a")).click();
		driver.findElement(By.xpath("/html/body/main/div/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/a")).click();
		driver.findElement(By.xpath("/html/body/main/div/div[4]/div[2]/div[2]/div[2]/div[3]/a[1]")).click();
		Thread.sleep(3000L);
		File src=   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//da uzmem sliku ekrana
		FileUtils.copyFile(src,new File("D:\\Screenshot selenium\\screenshot1.png"));
		driver.findElement(By.xpath("/html/body/footer/div[1]/div[1]/ul/li[1]/a")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/main/div/div[2]/div[3]/ul/li[7]")).click();
		//Ovde sam stao zato sto na engleskom javlja gresku u provajderu

		

	}

}
