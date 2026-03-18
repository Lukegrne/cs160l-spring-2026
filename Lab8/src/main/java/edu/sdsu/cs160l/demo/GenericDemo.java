package edu.sdsu.cs160l.demo;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {

    String mtd1(String a) {
        System.out.println("some logic");
        return a;
    }

    Integer mtd1(Integer a) {
        System.out.println("some logic");
        return a;
    }

    List l = new ArrayList();

     void genericMtd(List<? super Number> parameter) {


    }

    public static void main(String[] args) {

        GenericDemo demo = new GenericDemo();


        List<Integer> intList = new ArrayList<>();
        intList.add(1);



    }

}
