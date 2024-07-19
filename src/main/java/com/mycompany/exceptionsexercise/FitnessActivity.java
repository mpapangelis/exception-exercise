package com.mycompany.exceptionsexercise;


public class FitnessActivity {
    
    private int intensity;
    private int duration;

    public FitnessActivity(int intensity, int duration) {
        this.intensity = intensity;
        this.duration = duration;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    
    
}
