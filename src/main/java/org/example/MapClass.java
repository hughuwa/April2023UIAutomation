package org.example;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
    @Test
    public void mapTest() {
        Map<String, Integer> StudentAge = new HashMap<>();
        StudentAge.put("Tomi", 25);
        StudentAge.put("Yemi", 29);
        StudentAge.put("Bismark", 30);
        StudentAge.put("Bismark", 40);
        StudentAge.put("Ebun", 27);
        StudentAge.put("Lateef", 26);
        System.out.println(StudentAge.get("Bismark"));
        System.out.println(" ");
        //How to print out all value in the Mapset
        //It does not print out duplicate and always selects the highest
        for(Map.Entry i:StudentAge.entrySet()){
            System.out.println(i.getKey() + " "+ i.getValue());
        }
    }
}

