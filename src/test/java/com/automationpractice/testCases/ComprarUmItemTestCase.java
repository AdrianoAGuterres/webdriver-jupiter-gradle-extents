package com.automationpractice.testCases;


import com.automationpractice.tasks.*;
import com.automationpractice.utils.faker.CostumerFake;
import com.automationpractice.utils.faker.CostumerFakeManager;
import com.automationpractice.utils.enuns.FirstDressItem;
import com.automationpractice.utils.report.Report;
import com.automationpractice.utils.selenium.Driver;
import com.automationpractice.verificationPoints.AddressVerificationPoints;
import com.automationpractice.verificationPoints.OrderVerificationPoints;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;

class ComprarUmItemTestCase{
    
    private CostumerFake customerFake;
    
    @BeforeEach
    public void setUpTest(){
        Report.initializeReport("comprar itens", "Teste de compra de itens", false);
        this.customerFake = CostumerFakeManager.getNewCostumerFake();
    }
    
    //@BeforeAll
    public static void setUpClass(){
        Report.initializeReport("Suite de compras", "Testes de compras", true);
    }
    
    @AfterEach
    public void tearDown(){
        Driver.killDriver();
        Report.endReport();
    }
    
    @AfterAll
    public static void tearDownClass(){
        Report.endSuiteReport();
    }
    
    @RepeatedTest(5)
    public void testMain(){
        try{
            OrderTasks orderTasks = new OrderTasks();
            PaymentTasks paymentTasks = new PaymentTasks();
            AddressTasks addressTasks = new AddressTasks();
            HomePageTasks homePageTasks = new HomePageTasks();
            ItemPageTasks itemPageTasks = new ItemPageTasks();
            ShippingTasks shippingTasks = new ShippingTasks();
            LoginPageTasks loginPageTasks = new LoginPageTasks();
            MyAccountTasks myAccountTasks = new MyAccountTasks();
            OrderSummaryTasks orderSummaryTasks = new OrderSummaryTasks();
    
            AddressVerificationPoints orderVerificationPoints = new AddressVerificationPoints();
            OrderVerificationPoints addressVerificationPoints = new OrderVerificationPoints();
            
            Report.appendScenarioTest("Comprar um item com sucesso");
            
            Report.addTag("tag_01");
            
            System.out.println();
    
            homePageTasks.selectFirstItemDresses();
    
            itemPageTasks.addFirstItemDressesCart();
    
            addressVerificationPoints.verifyItemDetailsCart(
                    FirstDressItem.PRODUCT_NAME.getValue(),
                    FirstDressItem.PRODUCT_UNIT_PRICE.getValue(),
                    FirstDressItem.PRODUCT_QTD.getValue(),
                    FirstDressItem.PRODUCT_TOTAL_PRICE.getValue());
            
            addressVerificationPoints.verifyOrderDetailsCart(
                    FirstDressItem.ORDER_TOTAL_PRODUCT_PRICE.getValue(),
                    FirstDressItem.ORDER_SHIPPING.getValue(),
                    FirstDressItem.ORDER_TOTAL_WITHOUT_TAX.getValue(),
                    FirstDressItem.ORDER_INCOMMING_TAX.getValue(),
                    FirstDressItem.ORDER_TOTAL_COST.getValue());
            
            orderTasks.clickProceedToCheckoutButton();
            
            loginPageTasks.CreateAccount(this.customerFake.getEmail());
            
            myAccountTasks.fillCostumerForm(
                    this.customerFake.getName(),
                    this.customerFake.getLastName(),
                    this.customerFake.getEmail(),
                    this.customerFake.getPassword(),
                    this.customerFake.getDayBirthday() + "",
                    this.customerFake.getMonthBirthday() + "",
                    this.customerFake.getYearBirthday() + "",
                    this.customerFake.getCompany(),
                    this.customerFake.getStreet(),
                    this.customerFake.getCity(),
                    this.customerFake.getState(),
                    this.customerFake.getPostalCode(),
                    this.customerFake.getCountry(),
                    this.customerFake.getPhone());
            
            myAccountTasks.clickRegisterButton();
            
            orderVerificationPoints.verifyOrderAccountDetails(
                    this.customerFake.getName() + " " + this.customerFake.getLastName(),
                    this.customerFake.getCompany(),
                    this.customerFake.getStreet(),
                    this.customerFake.getCity() + ", " + this.customerFake.getState() + " " + this.customerFake.getPostalCode(),
                    this.customerFake.getCountry(),
                    this.customerFake.getPhone());
            
            addressTasks.clickProceedCheckoutButton();
            
            shippingTasks.confirmShipping();
            
            paymentTasks.clickBankWireButton();
            
            orderSummaryTasks.clickIConfirmButton();
            
            Report.log(Status.INFO, "O teste finalizou!", false);
            
        }catch(Exception e){
            Report.log(Status.FAIL, "O teste falhou: " + e, true);
            fail(e);
        }
        
    }
}