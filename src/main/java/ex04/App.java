package ex04;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Naomi Palm
 */

import java.util.Scanner;

public class App {

    static Scanner input = new Scanner(System.in);

    public static void main (String[] args){

        App newApp = new App();

        System.out.println("Enter a noun: ");
        String noun = input.nextLine();

        System.out.println("Enter a verb: ");
        String verb = input.nextLine();

        System.out.println("Enter a adjective: ");
        String adjective = input.nextLine();

        System.out.println("Enter a adverb: ");
        String adverb = input.nextLine();

        String outPut = newApp.stringConCat(noun, verb, adjective, adverb);

        System.out.println(outPut);
    }
    private String stringConCat(String noun, String verb, String adjective, String adverb){
        return "Do you " + verb + " your " + adjective + " " + noun + " " + adverb + " ? That's hilarious!";
    }
}
