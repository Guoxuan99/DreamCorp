package assignmentforsem2dreamcoop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class LoadData {
    public String abc;
    
    public LoadData(List<Node> allUser) throws IOException {
        String country = allUser.get(0).getCountry();
        allUser.clear();
        BufferedReader br = new BufferedReader(new FileReader("DreamCoop.txt"));
        String str1 = "";
        System.out.println("Loading all details...");
        String str2 = br.readLine();
        String[] ar1 = str2.split(",");//0=ID, 1=Name, 2= Password, 3= Key, 4= Encrypted Name, 5= Upline
        Node<String> User1 = new Node<>(ar1[0]);
        allUser.add(User1); //add user to the list.
        User1.setID(allUser.size());
        User1.setName(ar1[1]);
        User1.setPassword(ar1[2]);
        User1.setKey(ar1[3]);
        User1.setEncryptedName(ar1[4]);

        for (int i = 0; i < allUser.size(); i++) {
            if (ar1[5].equalsIgnoreCase((String) allUser.get(i).getData())) {
                allUser.get(i).addChild(User1);
                User1.setParentName(allUser.get(i).getID());
            }
        }
        allUser.get(0).setCountry(country);
        new ChangeCurrency(allUser);
        
        while ((str1 = br.readLine()) != null) {
            String[] ar = str1.split(",");//0=ID, 1=Name, 2= Password, 3= Key, 4= Encrypted Name, 5= Upline, 6= country name
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
        System.out.println("Details are loaded successfully.");
    }

    public LoadData(List<Node> allUser, String a) throws IOException {
        String country = allUser.get(0).getCountry();
        allUser.clear();
        BufferedReader br = new BufferedReader(new FileReader("DreamCoop.txt"));
        String str1 = "";
        System.out.println("Loading all details...");
        String str2 = br.readLine();
        String[] ar1 = str2.split(",");//0=ID, 1=Name, 2= Password, 3= Key, 4= Encrypted Name, 5= Upline
        Node<String> User1 = new Node<>(ar1[0]);
        allUser.add(User1); //add user to the list.
        User1.setID(allUser.size());
        User1.setName(ar1[1]);
        User1.setPassword(ar1[2]);
        User1.setKey(ar1[3]);
        User1.setEncryptedName(ar1[4]);

        for (int i = 0; i < allUser.size(); i++) {
            if (ar1[5].equalsIgnoreCase((String) allUser.get(i).getData())) {
                allUser.get(i).addChild(User1);
                User1.setParentName(allUser.get(i).getID());
            }
        }
        allUser.get(0).setCountry(country);
        new ChangeCurrency(allUser);
        
        while ((str1 = br.readLine()) != null) {
            String[] ar = str1.split(",");//0=ID, 1=Name, 2= Password, 3= Key, 4= Encrypted Name, 5= Upline, 6= country name
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

                    if (allUser.get(i).getChildren().size() >= 5) {
                        a = ("Bonus " + allUser.get(0).getConvertedBonus5() + " " + allUser.get(0).getUnit() + " have been added to " + allUser.get(i).getID() + " account because he/she have achieve 5 direct downline.\n");
                        allUser.get(i).setProfit(allUser.get(i).getProfit() + allUser.get(i).getBonus5());
                        allUser.get(i).setCompanyRevenue(allUser.get(i).getCompanyRevenue() - allUser.get(i).getBonus5());
                    } else if (allUser.get(i).getChildren().size() >= 50) {
                        a = a + ("Bonus " + allUser.get(0).getConvertedBonus50() + " " + allUser.get(0).getUnit() + " have been added to " + allUser.get(i).getID() + " account because he/she have achieve 50 direct downline.\n");
                        allUser.get(i).setProfit(allUser.get(i).getProfit() + allUser.get(i).getBonus50());
                        allUser.get(i).setCompanyRevenue(allUser.get(i).getCompanyRevenue() - allUser.get(i).getBonus50());
                    } else if (allUser.get(i).getChildren().size() >= 500) {
                        a = a + ("Bonus " + allUser.get(0).getConvertedBonus500() + " " + allUser.get(0).getUnit() + " have been added to " + allUser.get(i).getID() + " account because he/she have achieve 500 direct downline.\n");
                        allUser.get(i).setProfit(allUser.get(i).getProfit() + allUser.get(i).getBonus500());
                        allUser.get(i).setCompanyRevenue(allUser.get(i).getCompanyRevenue() - allUser.get(i).getBonus500());
                    }
                }
            }
        }
        abc = a;
        System.out.println("Details are loaded successfully.");
    }
}
