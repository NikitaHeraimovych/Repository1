package com.gmail.nikita00.wade;

public class Model {
    private StringBuilder value;

    public Model () {
        value = new StringBuilder (  );
    }

    public void addValue(String word){
        value.append (" ").append (word);
    }

    public String getValue () {
        return value.toString ();
    }


}