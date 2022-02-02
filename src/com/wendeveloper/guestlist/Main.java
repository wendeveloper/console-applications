package com.wendeveloper.guestlist;

import java.util.Scanner;

public class Main {
    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        guests[0] = "Jacob";
//        guests[1] = "Edward";
//        guests[2] = "Rose";
//        guests[3] = "Molly";
//        guests[4] = "Christopher";

        //will perform the task and then show the menu again so the user can continue interact with program
        do {
            displayGuests();
            displayMenu();
            int option = getOption();

            if(option == 1){
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.println("Name: ");
                        guests[i] = scanner.next();
                        //once name has been added, exit back to main
                        break;
                    }
                }
            }
            else if(option == 2){
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

                //temp array to reposition elements in array
                String[] tempArray = new String[guests.length];
                int tempIndex = 0;
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] != null){
                        tempArray[tempIndex] = guests[i];
                        tempIndex++;
                    }
                }
                guests = tempArray;
            }
            else if(option == 3){
                break;
            }
        } while(true);
        System.out.println("Exiting...");
    }

    public static void displayGuests(){
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

    public static void displayMenu(){
        System.out.println("______________________________\n- Menu -\n");  // \n <--new line
        System.out.println("1 - Add Guest");
        System.out.println("2 - Remove Guest");
        System.out.println("3 - Exit the program");

    }

    public static int getOption(){
        System.out.println("Option: ");
        int option = scanner.nextInt();
        System.out.println();
        return option;
    }
}
