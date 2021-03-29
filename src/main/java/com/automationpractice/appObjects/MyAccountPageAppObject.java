package com.automationpractice.appObjects;

import com.automationpractice.utils.selenium.Driver;
import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MyAccountPageAppObject{
    
    public WebElement getTitleMisterRadioButton(){
        return ElementsTools.waitForElement(By.id("id_gender1"));
    }
    
    public WebElement getFirstNameTexfield(){
        return ElementsTools.waitForElement(By.id("customer_firstname"));
    }
    
    public WebElement getLastNameTexfield(){
        return ElementsTools.waitForElement(By.id("customer_lastname"));
    }
    
    public WebElement getEmailTexfield(){
        return ElementsTools.waitForElement(By.id("email"));
    }
    
    public WebElement getPasswordTexfield(){
        return ElementsTools.waitForElement(By.id("passwd"));
    }
    
    public Select getDayBirthdayCombobox(){
        return new Select(Driver.getInstance().findElement(By.id("days")));
    }
    
    public Select getMonthBirthdayCombobox(){
        return new Select(Driver.getInstance().findElement(By.id("months")));
    }
    
    public Select getYearBirthdayCombobox(){
        return new Select(Driver.getInstance().findElement(By.id("years")));
    }
    
    public WebElement getCompanyTextfield(){
        return ElementsTools.waitForElement(By.id("company"));
    }
    
    public WebElement getAddressTextfield(){
        return ElementsTools.waitForElement(By.id("address1"));
    }
    
    public WebElement getCityTextfield(){
        return ElementsTools.waitForElement(By.id("city"));
    }
    
    public Select getStateCombobox(){
        return new Select(Driver.getInstance().findElement(By.id("id_state")));
    }
    
    public WebElement getPostCodeTextfield(){
        return ElementsTools.waitForElement(By.id("postcode"));
    }
    
    public Select getCountryCombobox(){
        return new Select(Driver.getInstance().findElement(By.id("id_country")));
    }
    
    public WebElement getPhoneTextfield(){
        return ElementsTools.waitForElement(By.id("phone_mobile"));
    }
    
    public WebElement getRegisterButton(){
        return ElementsTools.waitForElement(By.id("submitAccount"));
    }
}
