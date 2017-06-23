package com.devix.www;

public class Main {

    public static void main(String[] args) {

        display(true);
        display(false);
        display(false);
    }

    static void display(boolean console) {
        if (console) {
            System.out.println("The cat is cute.");
        } else {
            System.out.println("The cat not is cute");
        }
    }
}
