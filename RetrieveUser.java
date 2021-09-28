package assignmentforsem2dreamcoop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class RetrieveUser {

    Scanner s = new Scanner(System.in);

    public RetrieveUser(List<Node> allUser, int counter) throws IOException {
        new ChangeCurrency(allUser);
        boolean found = false;
        while (true) {
            counter = 0;
            System.out.println("Please enter the ID of the user you want to retrieve: ");
            int ID = s.nextInt();
            BufferedReader Customer = new BufferedReader(new FileReader("DreamCoop.txt"));
            String details;
            while ((details = Customer.readLine()) != null) {
                String[] arr = details.split(","); //0 = ID, 1= Password, 2= Key, 3 = Encrypted Name, 4 = Upline

                if (ID == Integer.parseInt(arr[0])) {
                    System.out.println("Congraz! The account has been found.");
                    found = true;
                    break;
                }
                counter++;
                //  allUser.get(counter).getProfit();
            }

            if (found == false) {
                System.out.println("Sorry. We didn't manage to find that particular account. Please try again.");
            } else if (found == true) {
                break;
            }
        }

        int choice = 0;
        char ContinueOrNot;
        while (true) {
            while (true) {
                System.out.println("Please select the number of the instruction that you want to proceed: ");
                System.out.println("1. Check the customer profit.");
                System.out.println("2. Check the customer encrypted name.");
                System.out.println("3. Check the customer key. ");
                System.out.println("4. Check whether if the customer key works.");
                choice = s.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("The customer profit now is: " + allUser.get(counter).getConvertedProfit() + allUser.get(0).getUnit());
                        break;
                    case 2:
                        System.out.println("The customer encrypted name is: " + allUser.get(counter).getEncryptedName());
                        break;
                    case 3:
                        System.out.println("The customer key is: " + allUser.get(counter).getKey());
                        break;
                    case 4:
                        System.out.println("Please enter the customer key here: ");
                        s.nextLine();
                        String keyEntered = s.nextLine();
                        allUser.get(counter).Decrypt(allUser.get(counter).getEncryptedName(), keyEntered);
                        break;
                    default:
                        System.out.println("You have inputed the wrong key of the customer. Please try again.");
                }
                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    break;
                }
            }

            System.out.println("Do you still want to check for other information? y/n ");
            if (choice == 4) {
                ContinueOrNot = s.nextLine().charAt(0);
            } else {
                s.nextLine();
                ContinueOrNot = s.nextLine().charAt(0);
            }

            if (ContinueOrNot == 'n' || ContinueOrNot == 'N') {
                break;
            }
        }

    }
}
