package LambdasDemo;

import java.util.List;

public class LambdaDemo1 {
    public static void show(){
        List<Integer> list = List.of(1,2,3,4);

        //Imperative Programming (for, if/else, switch/case)
        for (Integer item : list){
            System.out.println(item);
        }

        //Declarative Programming
        list.forEach(item-> System.out.println(item)); //This forEach need it a Consumer function interface

    }
}
