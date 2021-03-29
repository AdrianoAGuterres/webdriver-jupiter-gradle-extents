package com.automationpractice.utils.selenium;

import com.automationpractice.utils.config.ConfigurationTool;
import com.automationpractice.utils.exceptions.BrowserTypeNotImplementedException;
import com.google.inject.Singleton;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.SneakyThrows;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

@Singleton
public class Driver{
    
    private static WebDriver DRIVER = null;
    private static final String HEADLESS = ConfigurationTool.getProperty("NAV_TYPE");
    private static final String DEFAULT_URL = ConfigurationTool.getProperty("DEFAULT_URL");
    private static final String DEFAULT_TIMEOUT = ConfigurationTool.getProperty("DEFAULT_TIMEOUT");
    private static final String DEFAULT_PAGE_LOAD = ConfigurationTool.getProperty("DEFAULT_PAGE_LOAD");
    
    private Driver(){
        // Método protegido
    }
    
    @SneakyThrows
    public static WebDriver getInstance(){
        if(DRIVER == null){
            String browser = ConfigurationTool.getProperty("DEFAULT_BROWSER");
            if(browser.equalsIgnoreCase("chrome")){
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.setHeadless(Boolean.parseBoolean(HEADLESS));
                DRIVER = new ChromeDriver(options);
                
            }else if(browser.equalsIgnoreCase("firefox")){
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions options = new FirefoxOptions();
                options.setHeadless(Boolean.parseBoolean(HEADLESS));
                DRIVER = new FirefoxDriver();
                
            }else{
                throw new BrowserTypeNotImplementedException("Não há implementação para o Browser "+browser+" !");
            }
            
            DRIVER.manage().deleteAllCookies();
            DRIVER.manage().window().maximize();
            DRIVER.manage().timeouts().implicitlyWait(Integer.parseInt(DEFAULT_TIMEOUT), TimeUnit.SECONDS);
            DRIVER.manage().timeouts().pageLoadTimeout(Integer.parseInt(DEFAULT_PAGE_LOAD), TimeUnit.SECONDS);
            
            DRIVER.get(DEFAULT_URL);
        }
        
        return DRIVER;
    }
    
    public static void killDriver(){
        if(DRIVER != null){
            DRIVER.close();
            DRIVER.quit();
        }
        DRIVER = null;
    }
    
    public static String getScreenshotBase64(){
        if(DRIVER == null){
            getInstance();
        }
        return ((TakesScreenshot) DRIVER).getScreenshotAs(OutputType.BASE64);
    }
}