package com.wendeveloper.guestlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] guests = new String[10];
        Scanner scanner = new Scanner(System.in);

        guests[0] = "Jacob";
        guests[1] = "Edward";
        guests[2] = "Rose";
        guests[3] = "Molly";
        guests[4] = "Christopher";

        //will perform the task and then show the menu again so the user can continue interact with program
        do {
            System.out.println();
            System.out.println("1 - Display All Guests");
            System.out.println("2 - Add Guest");
            System.out.println("3 - Remove Guest");
            System.out.println("4 - Exit the program");
            System.out.println("Option: ");
            int option = scanner.nextInt();
            System.out.println();

            if (option == 1) {
                //display all guests
                for (int i = 0; i < guests.length; i++) {
                    System.out.println("guest: " + guests[i]);
                }
            }
            else if(option == 2){
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.println("Name: ");
                        guests[i] = scanner.next();
                        //once name has been added, exit back to main
                        break;
                    }
                }

            }
            else if(option == 3){
                System.out.println("Name: ");
                String name = scanner.next();
                //find name in guests and delete it
                for (int i = 0; i < guests.length; i++) {

                    // if the value at particular index is not null &&
                    // if the value at particular index equals the name entered
                    if (guests[i] != null && guests[i].equals(name) ){
                        guests[i] = null;
                        break;
                    }
                }
            }
            else if(option == 4){
                break;
            }
        } while(true);
        System.out.println("Exiting...");
    }
}