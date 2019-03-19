package week5;

import java.util.Scanner;

public class InputController {

    public static int getUserMandatoryInputAsInt(String prompt, int min, int max) {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {

                System.out.println(prompt);
                String strInput = in.nextLine();
                int intInput = Integer.parseInt(strInput);
                if (intInput <= max && intInput >= min) {
                    return intInput;
                } else {
                    System.out.println("Invalid Input. Please enter a number between " + min + " and " + max);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Please enter a number.");
            }
        }
    }


    public static String getOptionalUserInputAsString(String prompt) {
        Scanner in = new Scanner(System.in);
        System.out.println(prompt);
        String strInput = in.nextLine();
        return strInput;
    }

    public static String getMandatoryUserInputAsString(String prompt) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println(prompt);
            String strInput = in.nextLine();
            if (strInput.length() > 0) {
                return strInput;
            } else {
                System.out.println("You must enter your input.");
            }
        }
    }

}
