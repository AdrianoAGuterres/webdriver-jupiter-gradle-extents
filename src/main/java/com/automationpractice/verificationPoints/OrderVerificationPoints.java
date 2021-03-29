package com.automationpractice.verificationPoints;


import com.automationpractice.appObjects.OrderAppObject;
import com.automationpractice.utils.Verifications;
import org.openqa.selenium.WebElement;

public class OrderVerificationPoints{
    private final OrderAppObject orderAppObject;
    
    public OrderVerificationPoints(){
        this.orderAppObject = new OrderAppObject();
    }
    
    public void verifyItemDetailsCart(String productName, String productUnitPrice, String productQtd, String productTotalPrice){
        
        verifyProductName(productName);
        verifyProductUnitPrice(productUnitPrice);
        verifyProductQtd(productQtd);
        verifyProductTotalPrice(productTotalPrice);
    }
    
    public void verifyOrderDetailsCart(String orderTotalProductPrice, String orderShipping, String orderTotalWithoutTax, String orderIncommingTax, String orderTotalCost){
        
        verifyOrderTotalProductsPrice(orderTotalProductPrice);
        verifyOrderShipping(orderShipping);
        verifyOrderTotalWithoutTax(orderTotalWithoutTax);
        verifyOrderIncommingTax(orderIncommingTax);
        verifyOrderTotalCost(orderTotalCost);
    }
    
    public void verifyProductQtd(String productQtd){
        WebElement element = this.orderAppObject.getProductQtdLabel();
        Verifications.compareWordByElementAttribute("Product Qtd", "value", element, productQtd);
    }
    
    public void verifyProductUnitPrice(String productUnitPrice){
        WebElement element = this.orderAppObject.getProductUnitPriceLabel();
        Verifications.compareElementWord("Product Unit Price", element, "$" + productUnitPrice);
    }
    
    public void verifyProductName(String productName){
        WebElement element = this.orderAppObject.getProductNameLabel();
        Verifications.compareElementWord("Product Name", element, productName);
    }
    
    public void verifyProductTotalPrice(String productTotalPrice){
        WebElement element = this.orderAppObject.getProductTotalPriceLabel();
        Verifications.compareElementWord("Product Total Price", element, "$" + productTotalPrice);
    }
    
    public void verifyOrderTotalProductsPrice(String orderTotalProductsPrice){
        WebElement element = this.orderAppObject.getOrderTotalProductsLabel();
        Verifications.compareElementWord("Order Total Products Price", element, "$" + orderTotalProductsPrice);
    }
    
    public void verifyOrderShipping(String orderShipping){
        WebElement element = this.orderAppObject.getOrderTotalShippinglLabel();
        Verifications.compareElementWord("Order Shipping", element, "$" + orderShipping);
    }
    
    public void verifyOrderTotalWithoutTax(String orderTotalWithoutTax){
        WebElement element = this.orderAppObject.getOrderTotalWithoutTaxLabel();
        Verifications.compareElementWord("Order Total Without Tax", element, "$" + orderTotalWithoutTax);
    }
    
    public void verifyOrderIncommingTax(String orderIncommingTax){
        WebElement element = this.orderAppObject.getOrderTotalTaxlLabel();
        Verifications.compareElementWord("Order Incomming Tax", element, "$" + orderIncommingTax);
    }
    
    public void verifyOrderTotalCost(String orderTotalCost){
        WebElement element = this.orderAppObject.getOrderTotalOrderLabel();
        Verifications.compareElementWord("Order Total Coast", element, "$" + orderTotalCost);
    }
}
