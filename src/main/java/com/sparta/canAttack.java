package com.sparta;

public interface canAttack {
    public default String attack(){
        return "It can attack";
    }
}
