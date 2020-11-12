package com.step.problema1;

import java.util.ArrayList;
//1.	Scrieți un program Java pentru a crea lista, adăugați câteva culori (șir) și imprimați colecția
public class Main {

    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<String>();

    color.add("Blue");
    color.add("Red");
    color.add("Yellow");

    for (int i=0;i<color.size();i++){
        System.out.println(color.get(i));
    }


    }
}
