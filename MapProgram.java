package com.designpatterns.cambeeler;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("JAVA", "A compiled, high level, Object Oriented, platform independent language");
        languages.put("PYTHON", "An interpreted, object oriented, high level, dynamic syntax, language");

        languages.put("C", "A compiled, Low level, structured language");
        languages.put("C++", "A compiled, high level, Object Oriented language");
        languages.put("COBOL", "Structured Mainframe language");
        languages.put("LISP", "Therein lies Madness");


        System.out.println("--------------------------------------");
        printlist(languages);
        System.out.println("--------------------------------------");
        System.out.println(languages.replace("LISP", "I really cannot pronounce this one..."));
        System.out.println(languages.replace("ADA", "one of the earliest OO programming languages"));
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");

        printlist(languages);

    }

    public static void printlist( Map<String, String> l){
        Set<String> strings = l.keySet();
        System.out.println(strings);

        for(String i : strings ){
            System.out.println("Key[" + i + "], Value = \"" + l.get(i) + "\"]");
        }
    }
}
