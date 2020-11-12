package com.step.problemapatru;

import java.util.ArrayList;
import java.util.Random;
//4.	Scrieti un program java capabil sa combine 2 ArrayList-uri cu valori de tip String.
public class ProblemaPatru {

    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<String>();
        ArrayList<String> person = new ArrayList<String>();

        color.add(0,"Blue");
        color.add(1,"Red");
        color.add(2,"Yellow");
        color.add(3,"Orange");
        color.add(4,"Black");
        person.add(0,"Andrei");
        person.add(1,"Ina");
        person.add(2,"Catalin");
        person.add(3,"Cristian");
        person.add(4,"Ion");


        for(int i=0;i<color.size();i++){
            System.out.println(color.get(i)+" "+person.get(i));
        }


    }

}
