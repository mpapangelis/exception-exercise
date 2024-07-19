package com.mycompany.exceptionsexercise;

import com.mycompany.exceptionsexercise.exception.TooIntenseException;
import com.mycompany.exceptionsexercise.exception.TooLowIntensityException;


public class VirtualFitnessCenter {
    
    public static void guideCustomer(VirtualPerson person, FitnessActivity activity) {
        try {
            person.performActivity(activity);
        } catch(TooIntenseException | TooLowIntensityException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
