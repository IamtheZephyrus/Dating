package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your age");

        int user_age = in.nextInt();

        System.out.println("Please enter partner age");

        int partner_age = in.nextInt();

        calculateIfAcceptable(user_age, partner_age);
    }

    private static void calculateIfAcceptable(int user_age, int partner_age){
        while(true){
            if(user_age / 2 + 7 > partner_age){
                System.out.println("you are a perv, and you should be ashamed of yourself! \n" +
                        "Do you wish to try again? Y/N");
                char yes_no = new Scanner(System.in).nextLine().toLowerCase().charAt(0);
                if(yes_no == 'y'){
                    System.out.println("Please enter partner age. We have saved your age");
                    partner_age = new Scanner(System.in).nextInt();
                } else {
                    System.out.println("You either wrote N, or something i don't understand. Either way, i'm terminating");
                    break;
                }
            } else {
                System.out.println("You go get 'em tiger!");
                break;
            }
        }
    }
}
