package com.mycompany.exceptionsexercise;


public class Tester {

    public static void main(String[] args) {
        VirtualPerson person = new VirtualPerson();
        FitnessActivity activity1 = new FitnessActivity(3, 20);
        FitnessActivity activity2 = new FitnessActivity(6, 20);
        FitnessActivity activity3 = new FitnessActivity(10, 40);
        
        VirtualFitnessCenter.guideCustomer(person, activity1);
        VirtualFitnessCenter.guideCustomer(person, activity2);
        VirtualFitnessCenter.guideCustomer(person, activity3);
    }
}
