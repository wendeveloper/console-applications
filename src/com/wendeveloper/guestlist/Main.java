package com.wendeveloper.guestlist;

import java.util.Scanner;

public class Main {
    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        insertTestNames();

        //perform task and then show menu again so the user can continue interacting with program
        do {
            displayGuests();
            displayMenu();
            int option = getOption();

            if(option == 1){
                addGuest();
            }
            else if(option  == 2){
                insertGuest();
            }
            else if(option == 3){
                renameGuest();
            }
            else if(option == 4){
                removeGuest();
            }
            else if(option == 5){
                break;
            }
        } while(true);
        System.out.println("Exiting...");
    }

    static void displayGuests(){
        System.out.println("______________________________\n- Guests -\n");  // \n <--new line
        boolean isEmpty = true;
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null){
                System.out.println(i+1 + ". " + (guests[i]));
                isEmpty = false;
            }
        }
        if (isEmpty){
            System.out.println("Guest list is empty");
        }
    }

    static void displayMenu(){
        System.out.println("______________________________\n- Menu -\n");  // \n <--new line
        System.out.println("1 - Add Guest");
        System.out.println("2 - Insert Guest");
        System.out.println("3 - Rename Guest");
        System.out.println("4 - Remove Guest");
        System.out.println("5 - Exit the program");
    }

    static int getOption(){
        System.out.print("Option: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return option;
    }

    static void addGuest() {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.print("Name: ");
                guests[i] = scanner.nextLine();  //nextLine reads entire line, not just one word.
                break;
            }
        }
    }

    static void insertGuest(){
        System.out.print("Number: ");
        int num = scanner.nextInt();
        scanner.nextLine();  // to consume a line

        if (num >= 1 && num <= 10 && guests[num - 1] != null ) {  //if in range and is valid guest num
            System.out.print("Name: ");
            String name = scanner.nextLine();

            for (int i = guests.length - 1; i > num - 1; i--) {  //take element before it and move it index currently on
                //set index to 1 index less
                guests[i] = guests[i - 1];
            }
            guests[num - 1] = name;  //nextLine reads entire line, not just one word.
        }
        else {
            System.out.println("\nError:  There is no guest with that number.");
        }



    }

    static void renameGuest(){
        System.out.print("Number: ");
        int num = scanner.nextInt();
        scanner.nextLine();  // to consume a line

        if (num >= 1 && num <= 10 && guests[num - 1] != null ) {  //if in range and is valid guest num
            System.out.print("Name: ");
            String name = scanner.nextLine();

            guests[num - 1] = name;  //nextLine reads entire line, not just one word.
        }
        else {
            System.out.println("\nError:  There is no guest with that number.");
        }

    }

    static void removeGuest(){
        System.out.print("Number: ");
        int num = scanner.nextInt();
        if (num >= 1 && num <= 10 && guests[num - 1] != null ) {  //if in range and is valid guest num
            guests[num - 1] = null;
            String[] tempArray = new String[guests.length];  //temp array to reposition elements in array
            int tempIndex = 0;
            for (int i = 0; i < guests.length; i++) {
                if (guests[i] != null) {
                    tempArray[tempIndex] = guests[i];
                    tempIndex++;
                }
            }
            guests = tempArray;
        }
        else {
            System.out.println("\nError:  There is no guest with that number.");
        }
    }


    static void insertTestNames(){
        guests[0] = "Jacob Hughes";
        guests[1] = "Edward Jones";
        guests[2] = "Rose Morrison";
        guests[3] = "Molly Jones";
        guests[4] = "Christopher Morgan";
    }
}
