package com.hisaab.hisaab.model;

public class DocumentCharacterstics {

    String Name;
    String Value;

    public DocumentCharacterstics(String name, String value) {
        Name = name;
        Value = value;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }
}
