package com.automationpractice.appObjects;

import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddressAppObject{
    
    public WebElement getAddressNameLabel(){
        return ElementsTools.waitForElement(By.cssSelector("li[class='address_firstname address_lastname']"));
    }
    
    public WebElement getCompanyLabel(){
        return ElementsTools.waitForElement(By.cssSelector("li[class='address_company']"));
    }
    
    public WebElement getAddressLabel(){
        return ElementsTools.waitForElement(By.cssSelector("li[class='address_address1 address_address2']"));
    }
    
    public WebElement getCityStatePostCodeLabel(){
        return ElementsTools.waitForElement(By.cssSelector("li[class='address_city address_state_name address_postcode']"));
    }
    
    public WebElement getCountryLabel(){
        return ElementsTools.waitForElement(By.cssSelector("li[class='address_country_name']"));
    }
    
    public WebElement getMobileLabel(){
        return ElementsTools.waitForElement(By.cssSelector("li[class='address_phone_mobile']"));
    }
    
    public WebElement getProceedCheckoutButton(){
        return ElementsTools.waitForElement(By.name("processAddress"));
    }
    
}
