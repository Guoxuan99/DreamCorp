package assignmentforsem2dreamcoop;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class UpdateUserDetails {

    public UpdateUserDetails(List<Node> allUser, int counter) throws IOException {
        while (true) {
            Scanner s = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new FileReader("DreamCoop.txt"));
            new ChangeCurrency(allUser);
            System.out.println("What do you want to update? ");
            System.out.println("1. Name ");
            System.out.println("2. Password");
            System.out.println("3. Key");
            System.out.println("4. Encrypted Name");
            System.out.println("5. Parent");

            int choice = s.nextInt();
            String full = "";
            boolean flag = true;
            while (flag) {
                switch (choice) {
                    case 1: //ID
                        System.out.println("Please Enter the new Name: ");
                        s.nextLine();
                        String newName = s.nextLine();
                        String a = "";

                        while ((a = br.readLine()) != null) {
                            String[] arr = a.split(",");
                            if (Integer.parseInt(arr[0]) == (allUser.get(counter).getID())) {
                                arr[1] = newName;
                            }
                            full = full + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + "," + arr[5] + "\n";
                        }
                        flag = false;
                        break;
                    case 2://password
//0 = ID, 1= Password, 2= Key, 3 = Encrypted Name, 4 = Upline
                        System.out.println("Please Enter the new Password: ");
                        s.nextLine();
                        String newPassword = s.nextLine();
                        while ((a = br.readLine()) != null) {

                            String[] arr = a.split(",");
                            if (arr[2].equals(allUser.get(counter).getPassword())) {
                                arr[2] = newPassword;
                            }
                            full = full + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + "," + arr[5] + "\n";
                        }
                        flag = false;
                        break;
                    case 3://key
                        System.out.println("Please Enter the new Key: ");
                        s.nextLine();
                        String newKey = s.nextLine();
                        while ((a = br.readLine()) != null) {
                            String[] arr = a.split(",");
                            if (arr[3].equals(allUser.get(counter).getKey())) {
                                arr[3] = newKey;
                            }
                            full = full + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + "," + arr[5] + "\n";
                        }
                        flag = false;
                        break;
                    case 4: //
                        System.out.println("Please Enter the new Encrypted Name: ");
                        s.nextLine();
                        String newEncryptedName = s.nextLine();
                        while ((a = br.readLine()) != null) {
                            String[] arr = a.split(",");
                            if (arr[4].equals(allUser.get(counter).getEncryptedName())) {
                                arr[4] = newEncryptedName;
                            }
                            full = full + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + "," + arr[5] + "\n";
                        }
                        flag = false;
                        break;
                    case 5:
                        System.out.println("Please Enter the new Parent ID: ");
                        s.nextLine();
                        int newParentID = s.nextInt();
                        // int ParentCounter;
                        boolean found = false;
                        while (true) {
                            //   ParentCounter = 0;
                            BufferedReader Customer = new BufferedReader(new FileReader("DreamCoop.txt"));
                            String details;
                            while ((details = Customer.readLine()) != null) {
                                String[] arr = details.split(","); //0=ID, 1=Name, 2= Password, 3= Key, 4= Encrypted Name, 5= Upline

                                if (newParentID == Integer.parseInt(arr[0])) {
                                    System.out.println("Congraz! The Parent Account has been found.");
                                    found = true;
                                    break;
                                }
                                //    ParentCounter++;
                            }
                            if (found == false) {
                                System.out.println("Sorry. We didn't manage to find that particular account. Please try again.");
                            } else if (found == true) {
                                break;
                            }
                        }
                        //alluser.get(ParentCounter) == new parent name
                        while ((a = br.readLine()) != null) {
                            String[] arr = a.split(",");
                            if (Integer.parseInt(arr[0]) == allUser.get(counter).getID()) {
                                arr[5] = Integer.toString(newParentID);
                            }
                            full = full + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + "," + arr[5] + "\n";
                        }
                        flag = false;
                        break;
                    default:
                        System.out.println("Please try again.");
                }
                PrintWriter p = new PrintWriter(new FileOutputStream("DreamCoop.txt"), true);
                p.write(full);
                p.close();
            }

            new LoadData(allUser);

            //  for (int i = 0; i < allUser.size(); i++) {
            //     System.out.println(allUser.get(i).getData());
            // }
            boolean blah = true;
            boolean blah2 = true;
            while (blah) {
                if (choice == 1 || choice == 2 | choice == 3 || choice == 4) {
                    System.out.println("Do you still want to update the information of the customer? y/n");
                    char Choice = s.nextLine().charAt(0);
                    if (Choice == 'n' || Choice == 'N') {
                        blah = false;
                        blah2 = false;
                        break;
                    } else if (Choice == 'y' || Choice == 'Y') {
                        blah = false;
                    } else {
                        System.out.println("Please try again.");
                    }
                } else {
                    System.out.println("Do you still want to update the information of the customer? y/n");
                    s.nextLine();
                    char Choice = s.nextLine().charAt(0);
                    if (Choice == 'n' || Choice == 'N') {
                        blah = false;
                        blah2 = false;
                        break;
                    } else if (Choice == 'y' || Choice == 'Y') {
                        blah = false;
                    } else {
                        System.out.println("Please try again.");
                    }
                }
            }
            if (blah2 == false) {
                break;
            }
        }
    }
}
