/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Ashby
 */

import java.util.Scanner;

public class APP {

    public static void main(String[] args){
        System.out.println("Enter a noun:");
        Scanner sc = new Scanner(System.in);
        String noun = sc.nextLine();
        System.out.println("Enter a verb:");
        String verb = sc.nextLine();
        System.out.println("Enter a adjective:");
        String adjective = sc.nextLine();
        System.out.println("Enter a adverb:");
        String adverb = sc.nextLine();

        System.out.print("Did you "+ verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious");



    }
}
