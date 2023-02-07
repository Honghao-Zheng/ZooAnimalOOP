package com.sparta;

public class Starter {
    public static void start(){
        Animal tiger=new Tiger();
        Animal peacock=new Peacock();
        Animal[] animals={tiger,peacock};

        for (Animal a:animals){
            //Polymorphism
            System.out.println(a.eat());
            //inheritance
            System.out.println("is it true that it has a head? "+a.isHasHead());
            //Abstraction and Polymorphism
            DescribeAnimal.print(a);

        }
        System.out.println("");
        //result of implementing interface
        Peacock peacock1=new Peacock();
        Tiger tiger1=new Tiger();
        System.out.println(peacock1.run());
        System.out.println(tiger1.run());
        System.out.println(tiger1.attack());
        //result of extending abstract
        System.out.println(tiger1.mammalBehaviour());
    }


}
