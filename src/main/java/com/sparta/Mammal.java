package com.sparta;

public abstract class Mammal extends Animal{
    public Mammal(java.lang.String mobility, java.lang.String skinType, int numberOfFeet) {
        super(mobility, skinType, numberOfFeet);
    }
    public String Breeding="female reproductive system";
    public abstract String mammalBehaviour();
}
