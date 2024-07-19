package com.mycompany.exceptionsexercise;

import com.mycompany.exceptionsexercise.exception.TooIntenseException;
import com.mycompany.exceptionsexercise.exception.TooLowIntensityException;


public class VirtualPerson {
    
    public void performActivity(FitnessActivity fitnessActivity) throws TooIntenseException, TooLowIntensityException{
        int intensity = fitnessActivity.getIntensity();
        int duration = fitnessActivity.getDuration();
        
        if (intensity >= 7) {
            throw new TooIntenseException("Intensity is too high!");
        }
        else if (intensity < 4) {
            throw new TooLowIntensityException("Intensity is too low!");
        }
        else {
            System.out.println("Performing fitness activity with intensity " + intensity + " for " + duration + " minutes.");
        }
    } 
}
