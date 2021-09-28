package assignmentforsem2dreamcoop;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class DreamCoop {

    public static void main(String[] args) throws IOException {
        String finalwords = "";
        stop:
        {
            List<Node> allUser = new ArrayList<>();
            Scanner s = new Scanner(System.in);
            PrintWriter p = new PrintWriter(new FileOutputStream("DreamCoop.txt", true));
            BufferedReader br = new BufferedReader(new FileReader("DreamCoop.txt"));
            Node<String> CompanyOwner = new Node<>("Boss");
            String a = "";

            if ((a = br.readLine()) == null) {
                allUser.add(CompanyOwner);
                CompanyOwner.setID(allUser.size());
                CompanyOwner.setName("Boss");
                CompanyOwner.setPassword("123456");
                CompanyOwner.setKey("Bossku");
                CompanyOwner.setEncryptedName("123456789");
                CompanyOwner.setParent(null);
                CompanyOwner.setParentName(0);
                CompanyOwner.setCountry("Malaysia");
                p.write(CompanyOwner.getFullInfo());
                p.println();
                p.close();
            } else {
                String str1 = br.readLine();
                String[] ar = str1.split(",");//0=ID, 1=Name, 2= Password, 3= Key, 4= Encrypted Name, 5= Upline
                Node<String> User = new Node<>(ar[0]);
                allUser.add(User); //add user to the list.
                User.setID(allUser.size());
                User.setName(ar[1]);
                User.setPassword(ar[2]);
                User.setKey(ar[3]);
                User.setEncryptedName(ar[4]);

                for (int i = 0; i < allUser.size(); i++) {
                    if (ar[5].equalsIgnoreCase((String) allUser.get(i).getData())) {
                        allUser.get(i).addChild(User);
                        User.setParentName(allUser.get(i).getID());
                    }
                }
            }

        CompanyOwner.addProfit(CompanyOwner);
        //0=ID, 1=Name, 2= Password, 3= Key, 4= Encrypted Name, 5= Upline
        //0 = ID, 1= Password, 2= Key, 3 = Encrypted Name, 4 = Upline, 5= name
//FROM HERE CODING INTERFACE

        System.out.println("Which country are you come from? Enter the number of integer.");
        System.out.println("1. United States");
        System.out.println("2. Indonesia");
        System.out.println("3. Japan");
        System.out.println("4. United Kingdom");
        System.out.println("5. China");
        System.out.println("6. Thailand");
        System.out.println("7. Singapore");
        System.out.println("8. Hong kong");
        System.out.println("9. Malaysia");

        int choice = s.nextInt();
        s.nextLine();
        switch (choice) {
            case 1:
                allUser.get(0).setCountry("United States");
                break;
            case 2:
                allUser.get(0).setCountry("Indonesia");
                break;
            case 3:
                allUser.get(0).setCountry("Japan");
                break;
            case 4:
                allUser.get(0).setCountry("United Kingdom");
                break;
            case 5:
                allUser.get(0).setCountry("China");
                break;
            case 6:
                allUser.get(0).setCountry("Thailand");
                break;
            case 7:
                allUser.get(0).setCountry("Singapore");
                break;
            case 8:
                allUser.get(0).setCountry("Hong Kong");
                break;
            case 9:
                allUser.get(0).setCountry("Malaysia");
                break;
        }
        new ChangeCurrency(allUser);
        new LoadData(allUser);
        
        
        //TRY
      
        //TRY

        while (true) {
            char v = 'q';
            boolean flag = true;
            while(true){
            
            System.out.println("Are you a registered user? y/n");
            char pang = 'd';
            pang = s.nextLine().charAt(0);
            if (pang == 'n' || pang == 'N') {
                break;
            } else if (pang == 'y' || pang == 'Y') {
                flag = false;
                break;
            } else {
                System.out.println("Please try again.");
            }
            }
            if(flag == false){
                break;
            }

            while (true) {

                System.out.println("Do you wish to register as a user? y/n ");
                v = s.nextLine().charAt(0);
                if (v == 'n' || v == 'N') {
                    break stop;
                } else if (v == 'y' || v == 'Y') {
                    new NewUserRegistration(allUser);
                    break;
                } else {
                    System.out.println("Please try again.");
                }
            }
            if (v == 'y' || v == 'Y') {
                break;
            }
        }

        char choose = 'e';
        int counter;

        while (choose != 'a' || choose != 'A' || choose != 'c' || choose != 'C') {
            System.out.println("Are you an Admin or a Customer? Type a if you are an Admin and Type c if you are an Customer."
                    + " If you wish to terminate program, type n.");
            choose = s.nextLine().charAt(0);
            if (choose == 'a' || choose == 'A') {
                //ADMIN USER INTERFACE - ADMIN USER INTERFACE - ADMIN USER INTERFACE - ADMIN USER INTERFACE - ADMIN USER INTERFACE - 
                VerifyIdentity count = new VerifyIdentity(allUser, 'a');
                counter = count.getCounter();
                new AdminFeature(allUser, counter);
            } else if (choose == 'c' || choose == 'C') {
                //CUSTOMER USER INTERFACE - CUSTOMER USER INTERFACE - CUSTOMER USER INTERFACE - CUSTOMER USER INTERFACE - CUSTOMER USER INTERFACE - 
                VerifyIdentity count = new VerifyIdentity(allUser, 'c');
                counter = count.getCounter();
                new CustomerFeature(allUser, counter);
            } else if (choose == 'n' || choose == 'N') {
                break;
            } else {
                System.out.println("Please try again. ");
            }
        }

        //testzone
        //testzone
        new PriorityQ(allUser);
        LoadData abc = new LoadData(allUser, finalwords);
            System.out.println(abc.abc);
        br.close();
        p.close();
    }
}
}
