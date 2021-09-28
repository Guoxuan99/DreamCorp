package assignmentforsem2dreamcoop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ResetCommission {

    Scanner s = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new FileReader("DreamCoop.txt"));

    public ResetCommission(List<Node> allUser) throws IOException {
        new ChangeCurrency(allUser);
        boolean flag = true;
        while (flag) {
            System.out.println("Please make sure that the final sum of commission fee is 100");
            System.out.println();
            System.out.println("Currently the First Generation Commission fee is: " + allUser.get(0).getFirstGPercentage());
            System.out.println("Please reset the amount of the Registration fee: ");
            double FGfee = s.nextDouble();
            allUser.get(0).setFirstGPercentage(FGfee);
            System.out.println("Now the First Generation Commission fee is: " + allUser.get(0).getFirstGPercentage());
            System.out.println();
            System.out.println("Currently the Second Generation Commission fee is: " + allUser.get(0).getSecondGPercentage());
            System.out.println("Please reset the amount of the Registration fee: ");
            double SGfee = s.nextDouble();
            allUser.get(0).setSecondGPercentage(SGfee);
            System.out.println("Now the Second Generation Commission fee is: " + allUser.get(0).getSecondGPercentage());
            System.out.println();
            System.out.println("Currently the Third Generation Commission fee is: " + allUser.get(0).getThirdGPercentage());
            System.out.println("Please reset the amount of the Registration fee: ");
            double TGfee = s.nextDouble();
            allUser.get(0).setThirdGPercentage(TGfee);
            System.out.println("Now the Third Generation Commission fee is: " + allUser.get(0).getFirstGPercentage());
            System.out.println("");
            System.out.println("Currently the Fourth Generation Commission fee is: " + allUser.get(0).getFourthGPercentage());
            System.out.println("Please reset the amount of the Registration fee: ");
            double FourthGfee = s.nextDouble();
            allUser.get(0).setFourthGPercentage(FourthGfee);
            System.out.println("Now the Fourth Generation Commission fee is: " + allUser.get(0).getFourthGPercentage());
            System.out.println();
            System.out.println("Currently the Fifth Generation Commission fee is: " + allUser.get(0).getFifthGPercentage());
            System.out.println("Please reset the amount of the Registration fee: ");
            double FifthGfee = s.nextDouble();
            allUser.get(0).setFifthGPercentage(FifthGfee);
            System.out.println("Now the Fifth Generation Commission fee is: " + allUser.get(0).getFifthGPercentage());

            if (allUser.get(0).getFirstGPercentage() + allUser.get(0).getSecondGPercentage() + allUser.get(0).getThirdGPercentage() + allUser.get(0).getFourthGPercentage() + allUser.get(0).getFifthGPercentage() == 100) {
                flag = false;
                break;
            }
            System.out.println("You have inputed the wrong information. Please try again.");
        }
        System.out.println("Congraz! the commission fee is reset.");
    }

}
