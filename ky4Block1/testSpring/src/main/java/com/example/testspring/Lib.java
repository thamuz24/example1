package com.example.testspring;

import java.util.HashMap;

public class Lib {
    HashMap<String,String> library = new HashMap<String,String>();

    public Lib() {
        this.library.put("dog","cho");
        this.library.put("cat","meow");
        this.library.put("banana","chuoi to");
    }

    public String search(String word) {
        return library.get(word);
    }
}
