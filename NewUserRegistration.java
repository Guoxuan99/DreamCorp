package assignmentforsem2dreamcoop;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class NewUserRegistration {

    public NewUserRegistration(List<Node> allUser) throws IOException {
        stop:{
        PrintWriter p = new PrintWriter(new FileOutputStream("DreamCoop.txt", true));
        Scanner s = new Scanner(System.in);

        //Load Data 
        new LoadData(allUser);
        new ChangeCurrency(allUser);
        //Write data
        boolean flag = true;
        while (true) {
            char YorN = 'q';
            System.out.println("Would you like to pay " + allUser.get(0).getConvertedRegistrationCost() +" " + allUser.get(0).getUnit() + " for this registration fees? y/n");
            YorN = s.nextLine().charAt(0);

            if (YorN == 'y' || YorN == 'Y') {
                System.out.println("Congraz! You have Become a member of Dream Corporation.");
                break;
            } else if (YorN == 'n' || YorN == 'N') {
                System.out.println("Bye.");
                flag = false;
                break stop;
            } else {
                System.out.println("Please enter again.");
            }

        }
        if (flag == true) {
            System.out.println("Please register yourself by entering your Real name: ");
            String user = s.nextLine();
            System.out.println(user);
            Node<String> User = new Node<>(user);
            allUser.add(User);
            User.setID(allUser.size());
            System.out.println("This is your unique ID: " + User.getID());
            p.write(User.getID() + ",");
            User.setName(user);
            p.write(user + ",");
            
            System.out.println("Please set a password for login and security purpose: ");
            String password = s.nextLine();
            User.setPassword(password);
            p.write(password + ",");

            System.out.println("Please enter your Key for encryption purpose: ");
            String key = s.nextLine();
            p.write(key + ",");
            User.Encrypt(User.getID(), key);
            p.write(User.getEncryptedName() + ",");
            System.out.println("This is your encrypted name: " + User.getEncryptedName());

            boolean found = false;

            while (true) {
                System.out.println("Who recommended you this program? (His/her ID) ");
                String DiUp = s.nextLine();
                for (int i = 0; i < allUser.size(); i++) {
                    if (DiUp.equalsIgnoreCase((String) allUser.get(i).getData())) {
                        allUser.get(i).addChild(User);
                        User.setParentName(Integer.parseInt(DiUp));
                        User.setParent(allUser.get(i));
                        found = true;
                        break;
                    }
                }
                if (found == true) {
                    p.write(DiUp);
                    break;
                }
                System.out.println("Please try again.");
            }
            p.println();
            System.out.println("Congraz! You have finished your setup.");
        } else if (flag == false) {
        }
        p.close();
    }
    }
}
