package com.automationpractice.appObjects;

import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrderAppObject{
    
    public WebElement getProductNameLabel(){
        return ElementsTools.waitForElement(By.cssSelector("td.cart_description > .product-name > a"));
    }
    
    public WebElement getProductUnitPriceLabel(){
        return ElementsTools.waitForElement(By.cssSelector("td.cart_unit > .price > .price"));
    }
    
    public WebElement getProductQtdLabel(){
        return ElementsTools.waitForElement(By.cssSelector(".cart_quantity_input"));
    }
    
    public WebElement getProductTotalPriceLabel(){
        return ElementsTools.waitForElement(By.cssSelector("td.cart_total > .price"));
    }
    
    public WebElement getOrderTotalProductsLabel(){
        return ElementsTools.waitForElement(By.cssSelector("#total_product"));
    }
    
    public WebElement getOrderTotalShippinglLabel(){
        return ElementsTools.waitForElement(By.cssSelector("#total_shipping"));
    }
    
    public WebElement getOrderTotalWithoutTaxLabel(){
        return ElementsTools.waitForElement(By.cssSelector("#total_price_without_tax"));
    }
    
    public WebElement getOrderTotalTaxlLabel(){
        return ElementsTools.waitForElement(By.cssSelector("#total_tax"));
    }
    
    public WebElement getOrderTotalOrderLabel(){
        return ElementsTools.waitForElement(By.cssSelector("#total_price"));
    }
    
    public WebElement getProceedToCheckoutButton(){
        return ElementsTools.waitForElement(By.cssSelector("a.standard-checkout > span"));
    }
}
