package assignmentforsem2dreamcoop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class VerifyIdentity {

    Scanner s = new Scanner(System.in);
    private int counterForVerify = 0;

    public VerifyIdentity(List<Node> allUser, char CorA) throws IOException {
        boolean found = false;
        if(CorA == 'a'){
        while (true) {
            int ID;
            while(true){
                    System.out.println("Who are you? Please enter your ID: ");
                    
                    if(s.hasNextInt()){
                        ID = s.nextInt();
                        break;
                    }else{
                        String a = s.nextLine();
                        System.out.println("Please try again.");
                    }
                }
            System.out.println("Please enter your password for this ID: ");
            s.nextLine();
            String password = s.nextLine();
            BufferedReader Customer = new BufferedReader(new FileReader("DreamCoop.txt"));
            String details = "";
            details = Customer.readLine();
                String[] arr = details.split(","); 

                if (ID == (Integer.parseInt(arr[0])) && password.equals(arr[2])) {
                    System.out.println("Congraz! Your account has been found.");
                    found = true;
                    System.out.println("Counter = " + counterForVerify);
                    break;
                }else{
                    System.out.println("Sorry. You are entering wrong ID or Password as an admin");
                }
            }
        
        }else{
            found = false;
            while (true) {
                int ID;
                while(true){
                    System.out.println("Who are you? Please enter your ID: ");
                    
                    if(s.hasNextInt()){
                        ID = s.nextInt();
                        break;
                    }else{
                        String a = s.nextLine();
                        System.out.println("Please try again.");
                    }
                }
            
            
            System.out.println("Please enter your password for this ID: ");
            s.nextLine();
            String password = s.nextLine();
            BufferedReader Customer = new BufferedReader(new FileReader("DreamCoop.txt"));
            String details = "";
            while ((details = Customer.readLine()) != null) {
                String[] arr = details.split(","); //0 = ID, 1= Password, 2= Key, 3 = Encrypted Name, 4 = Upline

                if (ID == (Integer.parseInt(arr[0])) && password.equals(arr[2])) {
                    System.out.println("Congraz! Your account has been found.");
                    found = true;
                    break;
                }
                counterForVerify++;
            } 

            if (found == false) {
                System.out.println("Sorry. We didn't manage to find your account. Please try again.");
            } else if (found == true) {
                break;
            }
        }
        }
    }

    public int getCounter() {
        return counterForVerify;
    }

    public void resetCounter() {
        counterForVerify = 0;
    }
}
