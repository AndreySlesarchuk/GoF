package com.as.gof.behavioral.template;
/**
 * Created by Andrey Slesarchuk on 06/19/2020.
 */
public class Main {
    public static void main(String[] args) {
        Bevarage bevarage = new Coffee();
        bevarage.makeBevarage();
        bevarage = new Tea();
        bevarage.makeBevarage();
    }
}
