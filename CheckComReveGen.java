package assignmentforsem2dreamcoop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class CheckComReveGen {

    Scanner s = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new FileReader("DreamCoop.txt"));

    public CheckComReveGen(List<Node> allUser) throws IOException {
        
        int FirstG = 0, SecondG = 0, ThirdG = 0, FourthG = 0, FifthG = 0;
        double FirstGReve = 0, SecondGReve = 0, ThirdGReve = 0, FourthGReve = 0, FifthGReve = 0;
        for (int i = 0; i < allUser.size(); i++) {

            if (allUser.get(i).getParentName() == 0) { //boss
                FirstG++;
            } else if ((allUser.get(i).getParent().getParentName() == 0)) {
                SecondG++;
            } else if ((allUser.get(i).getParent().getParent().getParentName() == 0)) {
                ThirdG++;
            } else if ((allUser.get(i).getParent().getParent().getParent().getParentName() == 0)) {
                FourthG++;
            } else if ((allUser.get(i).getParent().getParent().getParent().getParent().getParentName() == 0)) {
                FifthG++;
            }
            
            FirstGReve = allUser.get(0).getRegistrationCost() * FirstG * (100.0 - allUser.get(0).getFirstGPercentage()) / 100;
            SecondGReve = allUser.get(0).getRegistrationCost() * SecondG * (100.0 - allUser.get(0).getFirstGPercentage() - allUser.get(0).getSecondGPercentage()) / 100;
            ThirdGReve = allUser.get(0).getRegistrationCost() * ThirdG * (100.0 - allUser.get(0).getFirstGPercentage() - allUser.get(0).getSecondGPercentage() - allUser.get(0).getThirdGPercentage()) / 100;
            FourthGReve = allUser.get(0).getRegistrationCost() * FourthG * (100.0 - allUser.get(0).getFirstGPercentage() - allUser.get(0).getSecondGPercentage() - allUser.get(0).getThirdGPercentage() - allUser.get(0).getFourthGPercentage()) / 100;
            FifthGReve = allUser.get(0).getRegistrationCost() * FifthG * (100.0 - allUser.get(0).getFirstGPercentage() - allUser.get(0).getSecondGPercentage() - allUser.get(0).getThirdGPercentage() - allUser.get(0).getFourthGPercentage() - allUser.get(0).getFifthGPercentage()) / 100;
            
            allUser.get(0).setFirstGRevenue(FirstGReve);
            allUser.get(0).setSecondGRevenue(SecondGReve);
            allUser.get(0).setThirdGRevenue(ThirdGReve);
            allUser.get(0).setFourthGRevenue(FourthGReve);
            allUser.get(0).setFifthGRevenue(FifthGReve);
            
        };
        new ChangeCurrency(allUser);
        System.out.println("The First Generation Company Revenue is: " + allUser.get(0).getConvertedFirstGRevenue() +" "+ allUser.get(0).getUnit());
        System.out.println("The Second Generation Company Revenue is: " + allUser.get(0).getConvertedSecondGRevenue() +" "+ allUser.get(0).getUnit());
        System.out.println("The Third Generation Company Revenue is: " + allUser.get(0).getConvertedThirdGRevenue() +" "+ allUser.get(0).getUnit());
        System.out.println("The Fourth Generation Company Revenue is: " + allUser.get(0).getConvertedFourthGRevenue() +" "+ allUser.get(0).getUnit());
        System.out.println("The Fifth Generation Company Revenue is: " + allUser.get(0).getConvertedFourthGRevenue() +" "+ allUser.get(0).getUnit());
    }
}
