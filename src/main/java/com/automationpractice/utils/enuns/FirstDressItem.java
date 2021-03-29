package com.automationpractice.utils.enuns;

public enum FirstDressItem {
    
    PRODUCT_NAME ("Printed Dress"),
    PRODUCT_UNIT_PRICE ("26.00"),
    PRODUCT_QTD ("1"),
    PRODUCT_TOTAL_PRICE ("26.00"),
    
    ORDER_TOTAL_PRODUCT_PRICE ("26.00"),
    ORDER_SHIPPING ("2.00"),
    ORDER_TOTAL_WITHOUT_TAX ("28.00"),
    ORDER_INCOMMING_TAX ("0.00"),
    ORDER_TOTAL_COST ("28.00");
    
    private final String value;
    
    FirstDressItem(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
}