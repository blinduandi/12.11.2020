package com.step.problema5;

import java.util.ArrayList;

public class ProblemaCinci {

//5.	Scrieți un program Java pentru a căuta un element de tip String dintr-un ArrayList.
//a.	Scrieti un program capabil sa caute elemente de tip Person intr-un ArrayList,
// unde Person este o clasa cu un singur atribut String name;


    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<Person>();
        ArrayList<String> name = new ArrayList<String>();


        person.add(0,new Person("Andrei"));
        person.add(1,new Person("Ina"));
        person.add(2,new Person("Catalin"));
        person.add(3,new Person("Cristian"));
        person.add(4,new Person("Ion"));

        name.add(0,"Andrei");
        name.add(1,"Inga");
        name.add(2,"Cristian");
        name.add(3,"MIhai");
        name.add(4,"Ion");


        for(int i=0;i<name.size();i++) {

            for (int j = 0; j < name.size(); j++) {
                if(name.get(i) == person.get(j).name){
                System.out.println(name.get(i) + " " + person.get(j).name);}
            }
        }

    }
}
