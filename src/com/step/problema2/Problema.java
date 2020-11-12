package com.step.problema2;

import java.util.ArrayList;
//2.	Scrieți un program Java care inseareaza 10 elemente intron ArrayList,
// dar fiecare element nou este inserat in prima pozitie a listei.
public class Problema {

    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<String>();

        color.add(0,"Blue");
        color.add(0,"Red");
        color.add(0,"Yellow");
        color.add(0,"Orange");
        color.add(0,"Black");
        color.add(0,"Grey");
        color.add(0,"Green");
        color.add(0,"Purple");
        color.add(0,"Pink");
        color.add(0,"Gold");


        for (int i=0;i<color.size();i++){
            System.out.println(color.get(i));
        }


    }
}
