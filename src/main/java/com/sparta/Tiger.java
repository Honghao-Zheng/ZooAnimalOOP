package com.sparta;

public class Tiger extends Mammal implements CanRun, canAttack{
    public Tiger() {
        super("Land", "Fur", 4);
    }

    @Override
    public String eat(){
        return "Tiger eats meat";
    }

    @Override
    public String mammalBehaviour(){
        return "Tider has female reproductive system";
    }

    @Override
    public String run(){
        return "Tiger can run";
    }


}
