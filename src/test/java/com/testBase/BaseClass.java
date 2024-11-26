package com.testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.text.RandomStringGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass 
{
	public Properties p;
	public Logger logger;
	public static WebDriver driver;
	

	@BeforeClass(groups = {"Sanity", "Master", "Regression" })
	@Parameters({"os","browser"})
	 public void setup(String os, String br) throws IOException
	 {
		//Loading config.properties File
		FileReader fr=new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(fr);
		
		logger=LogManager.getLogger(this.getClass());
		/*
		if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			// The URL will be IP address of hub machine + hub port + /wd/hub
			// http://192.168.13.1:4444/wd/hub    or    http://localhost:4444/wd/hub
			
			DesiredCapabilities capabilities=new DesiredCapabilities();
			
			// if os and browser name not from xml file
			
			//capabilities.setPlatform(Platform.WIN10);          **-capabilities.setPlatform(Platform.MAC);
			//capabilities.setBrowserName("chrome");             **-capabilities.setBrowserName("MicrosoftEdge");
			
			
			// if OS and Browser namer coming from xml file
			
			// Operating System
			if(os.equalsIgnoreCase("windows"))
			{
				capabilities.setPlatform(Platform.WIN10);
			}
			else if(os.equalsIgnoreCase("mac"))
			{
				capabilities.setPlatform(Platform.MAC);
			}
			else
			{
				System.out.println("No Matching OS "); 
				return;
			}
			
			// Browser 
			switch (br.toLowerCase()) 
			{
			case "chrome" : capabilities.setBrowserName("chrome"); break;
			case "edge" : capabilities.setBrowserName("MicrosoftEdge"); break;
			case "firefox": capabilities.setBrowserName("firefox");	break;
			default: System.out.println("No matching browser found"); return;
			}
			
			// Add URL Of Hub Here  
			
			URL url=new URI("http://localhost:4444/wd/hub").toURL();
			
			driver=RemoteWebDriver(url,capabilities);              // Modify Accordingly *****************************
			
			//======================= ABove COde Was Deprecated  
		}*/
		
		if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			URL gridUrl;
            try 
            {
                //gridUrl = new URI("http://192.168.0.100:4444/wd/hub").toURL();
                //http://localhost:4444/wd/hub
                	gridUrl = new URI("http://localhost:4444/wd/hub").toURL();
            } catch (MalformedURLException e) 
            {
                e.printStackTrace();
                return;
            } catch (Exception e) 
            {
                e.printStackTrace();
                return;
            }
            
            switch (br.toLowerCase()) 
            {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                setPlatformCapability(chromeOptions, os);
                driver = new RemoteWebDriver(gridUrl, chromeOptions);
                break;

            case "firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                setPlatformCapability(firefoxOptions, os);
                driver = new RemoteWebDriver(gridUrl, firefoxOptions);
                break;

            case "edge":
                EdgeOptions edgeOptions = new EdgeOptions();
                setPlatformCapability(edgeOptions, os);
                driver = new RemoteWebDriver(gridUrl, edgeOptions);
                break;

            default:
                System.out.println("No matching browser found");
                return;
            }
		
		}// Closing For remote ENvironment
		
		
		
		
		
		if(p.getProperty("execution_env").equalsIgnoreCase("local"))
		{
			
			switch(br.toLowerCase())
			{
			case "chrome" : driver =new ChromeDriver();break;
			case "firefox" : driver =new FirefoxDriver();break;
			case "edge" : driver =new EdgeDriver(); break;
			default : System.out.println("Invalid Browser Name...."); return	;
			}
			
			
		}
	/*
		if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			DesiredCapabilities capabilities=new DesiredCapabilities();
			
			//os
			if(os.equalsIgnoreCase("windows"))
			{
				capabilities.setPlatform(Platform.WIN11);
			}
			else if(os.equalsIgnoreCase("linux"))
			{
				capabilities.setPlatform(Platform.LINUX);
				
			}
			else if (os.equalsIgnoreCase("mac"))
			{
				capabilities.setPlatform(Platform.MAC);
			}
			else
			{
				System.out.println("No matching os");
				return;
			}
			
			//browser
			switch(br.toLowerCase())
			{
			case "chrome": capabilities.setBrowserName("chrome"); break;
			case "edge": capabilities.setBrowserName("MicrosoftEdge"); break;
			case "firefox": capabilities.setBrowserName("firefox"); break;
			default: System.out.println("No matching browser"); return;
			}
			
			driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
		}
		*/
				
		if(p.getProperty("execution_env").equalsIgnoreCase("local"))
		{

			switch(br.toLowerCase())
			{
			case "chrome" : driver=new ChromeDriver(); break;
			case "edge" : driver=new EdgeDriver(); break;
			case "firefox": driver=new FirefoxDriver(); break;
			default : System.out.println("Invalid browser name.."); return;
			}
		}
		
	
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(p.getProperty("AppURL"));  // reading url from Property File
		driver.manage().window().maximize();
		 
	 }
	
    private void setPlatformCapability(MutableCapabilities options, String os) {
        if (os.equalsIgnoreCase("windows")) {
            options.setCapability("platformName", "Windows");
        } else if (os.equalsIgnoreCase("mac")) {
            options.setCapability("platformName", "macOS");
        }else if(os.equalsIgnoreCase("linux"))
        {
        	options.setCapability("platformName", "linux");
        }
        else {
            System.out.println("No Matching OS");
        }
    }
	
	
	
	
	@AfterClass(groups = {"Sanity", "Master", "Regression" })
	 public void tearDown()
	 {
		 driver.quit();
	 }
	
	//================ ScreenShot Method on Failure of testCse ===========================
	
	public String captureScreen(String tname) throws IOException
	{
		//Create Time Stamp
		String 	timeStamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		// take Screenshot by TakeScreenshot 
		TakesScreenshot takeScreenshot=(TakesScreenshot) driver;
		File sourceFile=takeScreenshot.getScreenshotAs(OutputType.FILE);
		// creating File path with class Name and time stamp
		//String targetFilePath="/AutomationTestStore/screenshots/"+tname+"_"+timeStamp+".png";
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		// rename
		sourceFile.renameTo(targetFile);
		
		return targetFilePath;
	}
	
	 public String generateRandomString(int length) 
	  {
	        // Create a RandomStringGenerator
	        RandomStringGenerator generator = new RandomStringGenerator.Builder()
	            .withinRange('a', 'z') // Specify the range for lowercase letters
	            .build();

	        // Generate and return the random string of the specified length
	        return generator.generate(length);
	   }
	  
	  public String randomNumeric()
	  {
		  Random random = new Random();
	        
	        // Generate a random number with 10 digits
	        StringBuilder phoneNumber = new StringBuilder();
	        // Ensure the first digit is not 0
	        phoneNumber.append(random.nextInt(9) + 1); // First digit (1-9)
	        
	        // Next 9 digits (0-9)
	        for (int i = 1; i < 10; i++) {
	            phoneNumber.append(random.nextInt(10)); // Add random digit
	        }
	        
	        return phoneNumber.toString();
	  }
	   
	  //=======================
	  
	  public String randomAlphaNumberic(int length)
	  {
		  // Create a RandomStringGenerator
	        RandomStringGenerator generator = new RandomStringGenerator.Builder()
	            .withinRange('a', 'z') // Specify the range for lowercase letters
	            .build();

	        String text=generator.generate(length);
	        // Generate and return the random string of the specified length
		  
	        Random random = new Random();
	        
	        // Generate a random number with 10 digits
	        StringBuilder phoneNumber = new StringBuilder();
	        // Ensure the first digit is not 0
	        phoneNumber.append(random.nextInt(9) + 1); // First digit (1-9)
	        
	        // Next 9 digits (0-9)
	        for (int i = 1; i < 10; i++) {
	            phoneNumber.append(random.nextInt(10)); // Add random digit
	        }
	        
	        String phoneNumberText =phoneNumber.toString();
	        return (text+phoneNumberText);
	  }
	
	
}
