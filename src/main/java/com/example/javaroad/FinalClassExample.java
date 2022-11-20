package com.example.javaroad;

import java.util.HashMap;
import java.util.Iterator;

public final class FinalClassExample {

    // fields of the FinalClassExample class
    private final int id;

    private final String name;

    private final HashMap<String, String> testMap;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Getter function for mutable objects

    public HashMap<String, String> getTestMap() {
        return (HashMap<String, String>) testMap.clone();
    }

    // Constructor method performing deep copy

    public FinalClassExample(int i, String n, HashMap<String, String> hm) {
        System.out.println("Performing Deep Copy for Object initialization");

        // "this" keyword refers to the current object
        this.id = i;
        this.name = n;

        HashMap<String, String> tempMap = new HashMap<String, String>();
        String key;
        Iterator<String> it = hm.keySet().iterator();
        while (it.hasNext()) {
            key = it.next();
            tempMap.put(key, hm.get(key));
        }
        this.testMap = tempMap;
    }

}