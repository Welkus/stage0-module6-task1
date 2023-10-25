package com.epam.mjc.stage0;

public class Animal {
    
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
       // This animal is mostly (color). It has (numberOfPaws) paws and ('a'/'no' -> depends on value of
        // hasFur) fur."
        String pluralPaw = numberOfPaws == 1 ? "paw" : "paws";
        String fur = hasFur ? "a fur" : "no fur";
        return String.format("This animal is mostly %s. It has %d %s and %s.",color,numberOfPaws,pluralPaw,fur);
    }
}
