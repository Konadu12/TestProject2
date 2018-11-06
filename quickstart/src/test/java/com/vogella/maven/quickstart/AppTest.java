package com.vogella.maven.quickstart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     * @throws InterruptedException 
     */
    public AppTest( String testName ) throws InterruptedException
    {
        super( testName );
        WebDriver driver = new SafariDriver();
		driver.get("file:///Users/amankwaah/Desktop/website/vivid-photo/index.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"about\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"popupAboutClose\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"projects\"]")).click();

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"popupProjectsClose\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"blog\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"popupBlogClose\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"contact\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Konadu");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"subject\"]")).sendKeys("Autos");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Testmail@gmail.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("Dies ist nur eine Testnachricht");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"popupContact\"]/div/div[1]/div/form/input[4]")).click();
		
		
		
		
		
		driver.close();
		

		
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
        
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
