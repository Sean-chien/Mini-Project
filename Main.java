package week5;

import java.util.Scanner;
import java.util.function.*;
public class Main {
    public static void Mainmenu() {
        System.out.println("\n+===   Contact   App   ===+\n" +
                           "\n| 1. List all Contacts    |\n" +
                           "\n| 2. Add new Contacts     |\n" +
                           "\n| 3. Remove Contacts      |\n" +
                           "\n| 4. Update Contacts      |\n" +
                           "\n| 5. Quit                 |\n" +
                           "\n+=========================+\n");

    }

    public static void main(String[] args) {
        ContactList myContacts = new ContactList();
        while (true){
            Mainmenu();
            int choose = InputController.getUserMandatoryInputAsInt( "Enter your option: ", 1, 5);
            if (choose == 1){
                System.out.println("List all Contacts");
                myContacts.addContacts();
                myContacts.removeContact();

            }
            else if (choose == 2){
                System.out.println("Add new Contacts");
                myContacts.addContacts();
                myContacts.removeContact();

            }
            else if (choose == 3){
                System.out.println("Remove Contacts");
                myContacts.addContacts();
                myContacts.removeContact();
            }
            else if (choose == 4){
                System.out.println("Update Contacts");
                myContacts.addContacts();
                myContacts.removeContact();
            }
            else if (choose == 5){
                System.out.println("Quit");
                myContacts.addContacts();
                myContacts.removeContact();
            }
            else {
                System.out.println("Error");
                break;
            }
        }
    }
}
