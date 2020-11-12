package com.step.problema3;

import java.util.ArrayList;
import java.util.Random;

//3.	Scrieți un program Java pentru a extrage un element (la un index specificat) dintr-un ArrayList.
public class ProblemaTrei {

    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<String>();

        color.add(0,"Blue");
        color.add(1,"Red");
        color.add(2,"Yellow");
        color.add(3,"Orange");
        color.add(4,"Black");
        color.add(5,"Grey");
        color.add(6,"Green");
        color.add(7,"Purple");
        color.add(8,"Pink");
        color.add(9,"Gold");


        Random random = new Random();

        System.out.println(color.get(random.nextInt(10)));


    }
}
