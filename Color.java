package com.LifeGarage;

import java.lang.Enum;

public enum Color {
    Red("FF0000"), Green("80FF00"), Blue("0022FF");

    protected String code = "";

    Color(String code){
        this.code  = code;
    }
    public String toString() {
        return "Color{" +
                "code='" + code + '\'' +
                '}';
    }
}
