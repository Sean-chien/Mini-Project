package week5;

import java.util.ArrayList;

public class ContactList {
    private ArrayList<Contact> ContactItems;

    public ContactList(){
        this.ContactItems = new ArrayList<>();
    }

    public void listContacts(){
        int i = 0;
        for (Contact contact: ContactItems){
            System.out.println(i + ": " + contact);
            i ++;
        }

    }
    public void addContacts(){
        String name = InputController.getMandatoryUserInputAsString("Your name : ");
        String moblie = InputController.getMandatoryUserInputAsString("Your moblie : ");
        String work = InputController.getOptionalUserInputAsString("Your work : ");
        String home = InputController.getOptionalUserInputAsString("Your home : ");
        String city = InputController.getOptionalUserInputAsString("Your city : ");
        System.out.println("<" + name + ">" + "(" + moblie + " , " + " " + "job: " + work + " , home: " + home + " , city: " + city +")");

    }
    public void updateContact() {
        listContacts();
        int indexupdate = InputController.getUserMandatoryInputAsInt("Select the index of the contact to remove: ",0,2);
        System.out.println(indexupdate);
    }

    public void removeContact() {
        listContacts();
        int indexToRemove = InputController.getUserMandatoryInputAsInt("Select the index of the contact to remove: ", 0, 2);
        System.out.println(indexToRemove);
        String name = InputController.getMandatoryUserInputAsString("Your name : ");
        String moblie = InputController.getMandatoryUserInputAsString("Your moblie : ");
        String work = InputController.getOptionalUserInputAsString("Your work : ");
        if (indexToRemove == 0){
            System.out.println("name: " + name + "," + "moblie: " + moblie + "," + "work: " + work);
        }else if (indexToRemove == 1){
            System.out.println("name: " + name + "," + "moblie: " + moblie + "," + "work: " + work);

        }else if (indexToRemove == 2){
            System.out.println("name: " + name + "," + "moblie: " + moblie + "," + "work: " + work);

        }else{
            System.out.println("try to do again!!");
        }

    }



}
