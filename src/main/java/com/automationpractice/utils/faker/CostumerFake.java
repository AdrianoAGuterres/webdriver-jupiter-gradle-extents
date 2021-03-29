package com.automationpractice.utils.faker;

public class CostumerFake{
    
    private String email;
    private String name;
    private String lastName;
    private String password;
    
    private int dayBirthday;
    private int monthBirthday;
    private int yearBirthday;
    
    private String company;
    private String street;
    private String state;
    private String city;
    private String postalCode;
    private String phone;
    private String country;
    
    public CostumerFake(String email,
                        String name,
                        String lastName,
                        String password,
                        int dayBirthday,
                        int monthBirthday,
                        int yearBirthday,
                        String company,
                        String street,
                        String state,
                        String city,
                        String postalCode,
                        String phone,
                        String country){
        
        setEmail(email);
        setName(name);
        setLastName(lastName);
        setPassword(password);
        setDayBirthday(dayBirthday);
        setMonthBirthday(monthBirthday);
        setYearBirthday(yearBirthday);
        setCompany(company);
        setStreet(street);
        setState(state);
        setCity(city);
        setPostalCode(postalCode);
        setPhone(phone);
        setCountry(country);
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public int getDayBirthday(){
        return dayBirthday;
    }
    
    public void setDayBirthday(int dayBirthday){
        this.dayBirthday = dayBirthday;
    }
    
    public int getMonthBirthday(){
        return monthBirthday;
    }
    
    public void setMonthBirthday(int monthBirthday){
        this.monthBirthday = monthBirthday;
    }
    
    public int getYearBirthday(){
        return yearBirthday;
    }
    
    public void setYearBirthday(int yearBirthday){
        this.yearBirthday = yearBirthday;
    }
    
    public String getCompany(){
        return company;
    }
    
    public void setCompany(String company){
        this.company = company;
    }
    
    public String getStreet(){
        return street;
    }
    
    public void setStreet(String street){
        this.street = street;
    }
    
    public String getState(){
        return state;
    }
    
    public void setState(String state){
        this.state = state;
    }
    
    public String getCity(){
        return city;
    }
    
    public void setCity(String city){
        this.city = city;
    }
    
    public String getPostalCode(){
        return postalCode;
    }
    
    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String getCountry(){
        return country;
    }
    
    public void setCountry(String country){
        this.country = country;
    }
    
    @Override
    public String toString(){
        return "CostumerFake{" + "email='" + email + '\'' + ", name='" + name + '\'' + ", lastName='" + lastName + '\'' + ", password='" + password + '\'' + ", dayBirthday=" + dayBirthday + ", monthBirthday=" + monthBirthday + ", yearBirthday=" + yearBirthday + ", company='" + company + '\'' + ", street='" + street + '\'' + ", state='" + state + '\'' + ", city='" + city + '\'' + ", postalCode='" + postalCode + '\'' + ", phone='" + phone + '\'' + ", country='" + country + '\'' + '}';
    }
}