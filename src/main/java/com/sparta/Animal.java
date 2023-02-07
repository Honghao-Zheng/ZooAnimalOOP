package com.sparta;

public class Animal {
    //Encapsulation
    private String mobility;
    private String skinType;
    private int numberOfFeet;
    private boolean hasHead=true;
    private boolean hasHeart=true;

    public Animal(){
        this.mobility="land";
        this.skinType="fur";
        this.numberOfFeet=4;
    }
    public Animal(String mobility, String skinType, int numberOfFeet) {
        this.mobility = mobility;
        this.skinType = skinType;
        this.numberOfFeet = numberOfFeet;
    }

    public java.lang.String getMobility() {
        return mobility;
    }

    public void setMobility(java.lang.String mobility) {
        this.mobility = mobility;
    }

    public java.lang.String getSkinType() {
        return skinType;
    }

    public void setSkinType(java.lang.String skinType) {
        this.skinType = skinType;
    }

    public int getNumberOfFeet() {
        return numberOfFeet;
    }

    public void setNumberOfFeet(int numberOfFeet) {
        this.numberOfFeet = numberOfFeet;
    }

    public boolean isHasHead() {
        return hasHead;
    }

    public void setHasHead(boolean hasHead) {
        this.hasHead = hasHead;
    }

    public boolean isHasHeart() {
        return hasHeart;
    }

    public void setHasHeart(boolean hasHeart) {
        this.hasHeart = hasHeart;
    }

    public String eat(){
        return "The animal eats food";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "mobility='" + mobility + '\'' +
                ", skinType='" + skinType + '\'' +
                ", numberOfFeet=" + numberOfFeet +
                ", hasHead=" + hasHead +
                ", hasHeart=" + hasHeart +
                '}';
    }
}
