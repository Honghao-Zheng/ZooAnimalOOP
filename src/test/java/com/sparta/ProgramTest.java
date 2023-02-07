package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ProgramTest {
    @Test
    @DisplayName("Animal can eat")
    public void animalEat(){
        String expected="The animal eats food";
        Animal animal=new Animal();
        String result=animal.eat();
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Peacock can eat grain")
    public void PeacockEat(){
        String expected="Peacock eats grain";
        Animal peacock=new Peacock();
        String result=peacock.eat();
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Peacock can run")
    public void PeacockRun(){
        String expected="Peacock can run";
        Peacock peacock=new Peacock();
        String result=peacock.run();
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Tiger can eat grain")
    public void TigerEat(){
        String expected="Tiger eats meat";
        Animal tiger=new Tiger();
        String result=tiger.eat();
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Tiger can run")
    public void TigerRun(){
        String expected="Tiger can run";
        Tiger tiger=new Tiger();
        String result=tiger.run();
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Tiger has female reproductive system")
    public void TigerBreeding(){
        String expected="Tider has female reproductive system";
        Tiger tiger=new Tiger();
        String result=tiger.mammalBehaviour();
        Assertions.assertEquals(expected, result);
    }
}
