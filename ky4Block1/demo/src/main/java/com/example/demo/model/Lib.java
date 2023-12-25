package com.example.demo.model;

import java.util.HashMap;

public class Lib {
     HashMap<String,String> lib;

    public Lib() {
        this.lib = new HashMap<String,String>();
        this.lib.put("dog","chó");
        this.lib.put("chicken","gà");
        this.lib.put("cow","bò");
        this.lib.put("pen","bút");
        this.lib.put("cat","mèo");
        this.lib.put("laptop","máy tính bảng");
        this.lib.put("tree","cây");
        this.lib.put("free","lửa chùa");
        this.lib.put("car","ô tô");
        this.lib.put("motorbike","xe máy");
    }

    public HashMap<String, String> getLib() {
        return lib;
    }

    public void setLib(HashMap<String, String> lib) {
        this.lib = lib;
    }

    public String search(String world) {
        return lib.get(world);
    }
}
