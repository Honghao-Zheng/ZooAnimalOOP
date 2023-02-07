package com.sparta;

public class Peacock extends Animal implements CanRun{


    public Peacock() {
        super("land and sky", "feather",2);
    }

    @Override
    public String eat(){
        return "Peacock eats grain";
    }
    @Override
    public String run(){
        return "Peacock can run";
    }

}
