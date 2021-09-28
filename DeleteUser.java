package assignmentforsem2dreamcoop;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class DeleteUser {

    public DeleteUser(List<Node> allUser) throws IOException {
        Scanner s = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new FileReader("DreamCoop.txt"));
        BufferedReader br1 = new BufferedReader(new FileReader("DreamCoop.txt"));
        System.out.println("Which user do you want to delete? Please enter the user ID: ");
        String DeleteduserID = s.nextLine();
        int DeleteCounter = 0;
        String a = "";
        String full = "";
        while ((a = br.readLine()) != null) {
            String[] arr = a.split(",");
            if (arr[0].equals(DeleteduserID)) {
                System.out.println("Deleted user ID has been found: " + allUser.get(DeleteCounter).getID());
                break;
            }
            DeleteCounter++;
        }

        System.out.println(allUser.get(DeleteCounter).getID());
        System.out.println("These are the direct downline of the user you will deleted: " + allUser.get(DeleteCounter));
        boolean Guo = true;
        if (allUser.get(DeleteCounter).getChildren().size() == 0) {
            System.out.println("Sorry. It don't have any child.");
            Guo = false;
        }

        String newParentAfterDelete = "";
        while (Guo) {
            System.out.println("Please assign them to a direct upline by entering his/her ID: ");
            newParentAfterDelete = s.nextLine();

            boolean flag = false;
            //   ParentCounter = 0;
            BufferedReader Customer = new BufferedReader(new FileReader("DreamCoop.txt"));
            String details;
            while ((details = Customer.readLine()) != null) {
                String[] arr = details.split(","); //0 = ID, 1= key, 2= encrypted name, 3 = password, 4 = upline

                if (newParentAfterDelete.equals(arr[0])) {
                    System.out.println("Congraz! The Parent Account has been found.");
                    flag = true;
                    break;
                }
                //    ParentCounter++;
            }
            if (flag == false) {
                System.out.println("Sorry. We didn't manage to find that particular account. Please try again.");
            } else if (flag == true) {
                break;
            }
        }
        while ((a = br1.readLine()) != null) {
            String[] arr = a.split(",");
            if (arr[5].equals(DeleteduserID)) {
                arr[5] = newParentAfterDelete;
            }
            if (arr[0].equals(DeleteduserID)) {
                arr = null;
            }
            if (arr != null) {
                full = full + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "," + arr[4] + "," + arr[5] + "\n";
            }
        }
        PrintWriter p = new PrintWriter(new FileOutputStream("DreamCoop.txt"), true);
        p.write(full);
        p.close();
        
        new LoadData(allUser);
    }
}
