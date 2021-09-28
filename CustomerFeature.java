package assignmentforsem2dreamcoop;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class CustomerFeature {

    public CustomerFeature(List<Node> allUser, int counter) throws IOException {
        new ChangeCurrency(allUser);
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome back " + allUser.get(counter).getData() + ".");
        int choice = 0;
        char ContinueOrNot = 'y';

        while (ContinueOrNot == 'y' || ContinueOrNot == 'Y') {
            System.out.println("Please select the number of the instruction that you want to proceed: ");
            System.out.println("1. Check your profit.");
            System.out.println("2. Check your encrypted name.");
            System.out.println("3. Check your key. ");
            System.out.println("4. Check your whether if your key works.");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your profit now is: " + allUser.get(counter).getConvertedProfit() + " " + allUser.get(counter).getUnit());
                    break;
                case 2:
                    System.out.println("Your encrypted name is: " + allUser.get(counter).getEncryptedName());
                    break;
                case 3:
                    System.out.println("Your key is: " + allUser.get(counter).getKey());
                    break;
                case 4:
                    System.out.println("Please enter your key here: ");
                    s.nextLine();
                    String keyEntered = s.nextLine();
                    allUser.get(counter).Decrypt(allUser.get(counter).getEncryptedName(), keyEntered);
                    break;
                default:
                    System.out.println("You have inputed the wrong information. Please try again.");
            }
            System.out.println("Do you still want to check for other information? y/n");
            if (choice == 1 || choice == 2 || choice == 3) {
                s.nextLine();
            }
            ContinueOrNot = s.nextLine().charAt(0);
            if (ContinueOrNot == 'n' || ContinueOrNot == 'N') {
                break;
            }
        }

    }
}
