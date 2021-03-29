package com.automationpractice.verificationPoints;

import com.automationpractice.appObjects.AddressAppObject;
import com.automationpractice.utils.Verifications;
import org.openqa.selenium.WebElement;

public class AddressVerificationPoints{
    private final AddressAppObject addressAppObject;
    
    public AddressVerificationPoints(){
        this.addressAppObject = new AddressAppObject();
    }
    
    public void verifyOrderAccountDetails(String name, String company, String street, String cityStatePostcode, String country, String mobile){
        verifyCostumerName(name);
        verifyAddressCompany(company);
        verifyAddressStreet(street);
        verifyAddressCityStatePostcode(cityStatePostcode);
        verifyAddressCountry(country);
        verifyAddressMobile(mobile);
    }
    
    public void verifyAddressMobile(String addressMobile){
        WebElement element = this.addressAppObject.getMobileLabel();
        Verifications.compareElementWord("Address Mobile", element, addressMobile);
    }
    
    public void verifyAddressCountry(String addressCountry){
        WebElement element = this.addressAppObject.getCountryLabel();
        Verifications.compareElementWord("Address Country", element, addressCountry);
    }
    
    public void verifyAddressCityStatePostcode(String addressCityStatePostcode){
        WebElement element = this.addressAppObject.getCityStatePostCodeLabel();
        Verifications.compareElementWord("Address City State Postcode", element, addressCityStatePostcode);
    }
    
    public void verifyAddressStreet(String addressStreet){
        WebElement element = this.addressAppObject.getAddressLabel();
        Verifications.compareElementWord("Address Street", element, addressStreet);
    }
    
    public void verifyAddressCompany(String addressCompany){
        WebElement element = this.addressAppObject.getCompanyLabel();
        Verifications.compareElementWord("Address Company", element, addressCompany);
    }
    
    public void verifyCostumerName(String CostumerName){
        WebElement element = this.addressAppObject.getAddressNameLabel();
        Verifications.compareElementWord("Costumer Name", element, CostumerName);
    }
}
