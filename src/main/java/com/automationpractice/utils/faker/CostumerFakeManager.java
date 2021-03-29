package com.automationpractice.utils.faker;

import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;
import io.codearte.jfairy.producer.person.PersonProperties;

import java.util.Locale;
import java.util.Random;

public class CostumerFakeManager{
    
    private static final Random random = new Random();
    
    public static CostumerFake getNewCostumerFake(){
        Fairy fairy = Fairy.create(Locale.US);
        Person person = fairy.person(PersonProperties.male(), PersonProperties.minAge(18));
    
        return new CostumerFake(person.getEmail(),
                                person.getFirstName(),
                                person.getLastName(),
                                person.getPassword(),
                                person.getDateOfBirth().getDayOfMonth(),
                                person.getDateOfBirth().getMonthOfYear(),
                                person.getDateOfBirth().getYearOfEra(),
                                person.getCompany().getName(),
                                person.getAddress().getStreet(),
                                generateState(),
                                person.getAddress().getCity(),
                                person.getAddress().getPostalCode(),
                                person.getTelephoneNumber(),
                                "United States");
    }
    
    public static String generateState(){
        String[] states = {"Alabama", "Alaska", "California", "Colorado", "Delaware", "Georgia", "Maine", "Montana", "New Mexico", "Tennessee"};
        return states[random.nextInt(states.length - 1)];
    }
    
}
