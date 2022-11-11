package com.example.javaroad;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonPropertyOrder({"properties","name"})
public class ExtendableBean {
    public String name;
    private Map<String,String> properties;

    @JsonAnyGetter
    public Map<String,String> getProperties() {
        return properties;
    }
    public ExtendableBean(){
        properties = new HashMap<String,String>();
    }

    public void add(String attr, String val) {
        this.properties.put(attr,val);
    }
}
