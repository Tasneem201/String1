public class MakeAbba {

    // Method to return abba-formatted string
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    // Main method to test the function
    public static void main(String[] args) {
        MakeAbba m = new MakeAbba();

        System.out.println(m.makeAbba("Hi", "Bye"));       // HiByeByeHi
        System.out.println(m.makeAbba("Yo", "Alice"));     // YoAliceAliceYo
        System.out.println(m.makeAbba("What", "Up"));      // WhatUpUpWhat
    }
}

