package assignmentforsem2dreamcoop;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class AdminFeature {

    Scanner s = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new FileReader("DreamCoop.txt"));
    BufferedReader br2 = new BufferedReader(new FileReader("DreamCoop.txt"));
    BufferedReader br3 = new BufferedReader(new FileReader("DreamCoop.txt"));

    public AdminFeature(List<Node> allUser, int counter) throws IOException {
        new ChangeCurrency(allUser);
        boolean Guoxuan =true;
        while (Guoxuan) {

            System.out.println("Please select the number of the instruction that you want to proceed: ");
            System.out.println("1. Check your Company Revenue. ");
            System.out.println("2. Create a new user. ");
            System.out.println("3. Retrieve an user. ");
            System.out.println("4. Update an user.");
            System.out.println("5. Delete an user.");
            System.out.println("6. Encrypt an user.");
            System.out.println("7. Decrypt an user.");
            System.out.println("8. Print the entire tree of users.");
            System.out.println("9. Check your profit.");
            System.out.println("10. Check your Company Revenue of each generation.");
            System.out.println("11. Check an user revenue.");
            System.out.println("12. Change Registration fee.");
            System.out.println("13. Change commission fee.");

            int selection;
            selection = s.nextInt();
            switch (selection) {
                //Check your Company Revenue.
                case 1:
                    System.out.println("Company Revunue: " + allUser.get(0).getConvertedCompanyRevenue() + " " + allUser.get(0).getUnit());
                    break;
                //Create a new user.
                case 2:
                    new NewUserRegistration(allUser);
                    break;
                // Retrieve an user.
                case 3:
                    new RetrieveUser(allUser, counter);
                    break;
                //Update an user.
                case 4:
                    boolean found = false;
                    while (true) {
                        counter = 0;
                        System.out.println("Please enter the ID of the user you want to update: ");
                        s.nextLine();
                        String ID = s.nextLine();
                        BufferedReader Customer = new BufferedReader(new FileReader("DreamCoop.txt"));
                        String details;
                        while ((details = Customer.readLine()) != null) {
                            String[] arr = details.split(","); //0 = ID, 1= Password, 2= Key, 3 = Encrypted Name, 4 = Upline

                            if (ID.equals(arr[0])) {
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
                            System.out.println("Counter: " + counter);
                            break;
                        }
                    }
                    new UpdateUserDetails(allUser, counter);
                    break;
                case 5://delete user
                    new DeleteUser(allUser);
                    break;
                case 6://Encrypt user   
                    System.out.println("Please enter the user ID that you want to encrypt: ");
                    s.nextLine();
                    String Encrypt = s.nextLine();
                    BufferedReader br = new BufferedReader(new FileReader("DreamCoop.txt"));
                    String b ="";
                    int EncryptCounter= 0;
                    while((b = br.readLine())!= null){
                        String[] arr = b.split(",");
                        if (arr[0].equals(Encrypt)) {
                            break;
                        } 
                        EncryptCounter++;
                    }
                    allUser.get(EncryptCounter).Encrypt(allUser.get(EncryptCounter).getID(), allUser.get(EncryptCounter).getKey());
                    allUser.get(EncryptCounter).setEncryptedName(allUser.get(EncryptCounter).getEncryptedName());
                    System.out.println("The Encrypted Name of the user is changed to: " + allUser.get(EncryptCounter).getEncryptedName());
                    break;
                case 7://Decrypt user //0 = ID, 1= key, 2= encrypted name, 3 = password, 4 = upline
                    System.out.println("Please enter the user ID that you want to decrypt: ");
                    s.nextLine();
                    String Decrypt = s.nextLine();
                    BufferedReader br4 = new BufferedReader(new FileReader("DreamCoop.txt"));
                    String c ="";
                    int DecryptCounter= 0;
                    while((c = br4.readLine())!= null){
                        String[] arr = c.split(",");
                        if (arr[0].equals(Decrypt)) {
                            break;
                        } 
                        DecryptCounter++;
                    }
                    System.out.println("The Decrypted Name of the user is: " + allUser.get(DecryptCounter).getName());
                    break;
                    
                case 8://Print the entire tree
                    allUser.get(0).printTree(allUser.get(0), "   ");
                    break;
                case 9://check profit
                    System.out.println("Your Profit now is: " + allUser.get(0).getConvertedProfit() +" " + allUser.get(0).getUnit() + " excluding Company Revenue.");
                    break;
                case 10://check company revenue of each generation
                    new CheckComReveGen(allUser);
                    break;
                case 11://check user revenue
                    new ChangeCurrency(allUser);
                    for(int i =0; i<allUser.size();i++){
                        System.out.println(allUser.get(i).getID() + " has the profit of: " + allUser.get(i).getConvertedProfit() + allUser.get(0).getUnit());
                    }
                    break;
                case 12://change Registration fee
                    System.out.println("Currently the Registration fee is: " + allUser.get(0).getConvertedRegistrationCost() + allUser.get(0).getUnit());
                    System.out.println("Please reset the amount of the Registration fee in term of Malaysian Ringgit: ");
                    double RegisFee = s.nextDouble();
                    allUser.get(0).setRegistrationCost(RegisFee);
                    new ChangeCurrency(allUser);
                    System.out.println("Now the Registration Fee is: " + allUser.get(0).getConvertedRegistrationCost() +" "+ allUser.get(0).getUnit());
                    break;
                case 13://Change commission fee
                    new ResetCommission(allUser);
                    break;
            }
            
             PrintWriter p = new PrintWriter(new FileOutputStream("DreamCoop.txt"), true);
             for(int i=0; i<allUser.size();i++){
                 p.write(allUser.get(i).getFullInfo());
                 p.println();
             }
                        p.close();
                        new LoadData(allUser);
            

            System.out.println("Do you still want to check for other information? y/n ");
            if(selection ==1 || selection ==2 || selection == 3 || selection == 5 || selection==8 || selection ==9 || selection==10 || selection ==11 || selection ==12 || selection == 13){
                s.nextLine();
            }
            char cha = s.nextLine().charAt(0);
            if (cha == 'n' || cha == 'N') {
                break;
            }else if(cha == 'y' || cha == 'Y'){
                Guoxuan =true;
            }else{
                System.out.println("Not valid instruction.");
                break;
            }
        }
    }
}
