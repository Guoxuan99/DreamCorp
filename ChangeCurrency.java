package assignmentforsem2dreamcoop;

import java.io.IOException;
import java.util.List;

public class ChangeCurrency {

    public ChangeCurrency(List<Node> allUser) throws IOException {
        
        for(int i =0; i<allUser.size(); i++){
        if (allUser.get(0).getCountry().equals("United States")) {
            allUser.get(i).setUnit("United States Dollar");
            allUser.get(i).setConvertedRegistrationCost(allUser.get(i).getRegistrationCost() * 0.24);
            allUser.get(i).setConvertedCompanyRevenue(allUser.get(i).getCompanyRevenue() * 0.24);
            allUser.get(i).setConvertedProfit(allUser.get(i).getProfit() * 0.24);
            allUser.get(i).setConvertedFirstGRevenue(allUser.get(i).getFirstGRevenue() * 0.24);
            allUser.get(i).setConvertedSecondGRevenue(allUser.get(i).getSecondGRevenue() * 0.24);
            allUser.get(i).setConvertedThirdGRevenue(allUser.get(i).getThirdGRevenue() * 0.24);
            allUser.get(i).setConvertedFourthGRevenue(allUser.get(i).getFourthGRevenue() * 0.24);
            allUser.get(i).setConvertedFifthGRevenue(allUser.get(i).getFifthGRevenue() * 0.24);
            allUser.get(i).setConvertedBonus5(allUser.get(i).getBonus5() * 0.24);
            allUser.get(i).setConvertedBonus50(allUser.get(i).getBonus50() * 0.24);
            allUser.get(i).setConvertedBonus500(allUser.get(i).getBonus500() * 0.24);

        } else if (allUser.get(0).getCountry().equals("Indonesia")) {
            allUser.get(i).setUnit("Indonesian Rupiah");
            allUser.get(i).setConvertedRegistrationCost(allUser.get(i).getRegistrationCost() * 3745.64);
            allUser.get(i).setConvertedCompanyRevenue(allUser.get(i).getCompanyRevenue() * 3745.64);
            allUser.get(i).setConvertedProfit(allUser.get(i).getProfit() * 3745.64);
            allUser.get(i).setConvertedFirstGRevenue(allUser.get(i).getFirstGRevenue() * 3745.64);
            allUser.get(i).setConvertedSecondGRevenue(allUser.get(i).getSecondGRevenue() * 3745.64);
            allUser.get(i).setConvertedThirdGRevenue(allUser.get(i).getThirdGRevenue() * 3745.64);
            allUser.get(i).setConvertedFourthGRevenue(allUser.get(i).getFourthGRevenue() * 3745.64);
            allUser.get(i).setConvertedFifthGRevenue(allUser.get(i).getFifthGRevenue() * 3745.64);
            allUser.get(i).setConvertedBonus5(allUser.get(i).getBonus5() * 3745.64);
            allUser.get(i).setConvertedBonus50(allUser.get(i).getBonus50() * 3745.64);
            allUser.get(i).setConvertedBonus500(allUser.get(i).getBonus500() * 3745.64);
        } else if (allUser.get(0).getCountry().equals("Japan")) {
            allUser.get(i).setUnit("Japanese Yen");
            allUser.get(i).setConvertedRegistrationCost(allUser.get(i).getRegistrationCost() * 26.39);
            allUser.get(i).setConvertedCompanyRevenue(allUser.get(i).getCompanyRevenue() * 26.39);
            allUser.get(i).setConvertedProfit(allUser.get(i).getProfit() * 26.39);
            allUser.get(i).setConvertedFirstGRevenue(allUser.get(i).getFirstGRevenue() * 26.39);
            allUser.get(i).setConvertedSecondGRevenue(allUser.get(i).getSecondGRevenue() * 26.39);
            allUser.get(i).setConvertedThirdGRevenue(allUser.get(i).getThirdGRevenue() * 26.39);
            allUser.get(i).setConvertedFourthGRevenue(allUser.get(i).getFourthGRevenue() * 26.39);
            allUser.get(i).setConvertedFifthGRevenue(allUser.get(i).getFifthGRevenue() * 26.39);
            allUser.get(i).setConvertedBonus5(allUser.get(i).getBonus5() * 26.39);
            allUser.get(i).setConvertedBonus50(allUser.get(i).getBonus50() * 26.39);
            allUser.get(i).setConvertedBonus500(allUser.get(i).getBonus500() * 26.39);
        } else if (allUser.get(0).getCountry().equals("United Kingdom")) {
            allUser.get(i).setUnit("Pound Sterling");
            allUser.get(i).setConvertedRegistrationCost(allUser.get(i).getRegistrationCost() * 0.19);
            allUser.get(i).setConvertedCompanyRevenue(allUser.get(i).getCompanyRevenue() * 0.19);
            allUser.get(i).setConvertedProfit(allUser.get(i).getProfit() * 0.19);
            allUser.get(i).setConvertedFirstGRevenue(allUser.get(i).getFirstGRevenue() * 0.19);
            allUser.get(i).setConvertedSecondGRevenue(allUser.get(i).getSecondGRevenue() * 0.19);
            allUser.get(i).setConvertedThirdGRevenue(allUser.get(i).getThirdGRevenue() * 0.19);
            allUser.get(i).setConvertedFourthGRevenue(allUser.get(i).getFourthGRevenue() * 0.19);
            allUser.get(i).setConvertedFifthGRevenue(allUser.get(i).getFifthGRevenue() * 0.19);
            allUser.get(i).setConvertedBonus5(allUser.get(i).getBonus5() * 26.39);
            allUser.get(i).setConvertedBonus50(allUser.get(i).getBonus50() * 26.39);
            allUser.get(i).setConvertedBonus500(allUser.get(i).getBonus500() * 26.39);
        } else if (allUser.get(0).getCountry().equals("China")) {
            allUser.get(i).setUnit("Chinese Yuan");
            allUser.get(i).setConvertedRegistrationCost(allUser.get(i).getRegistrationCost() * 1.65);
            allUser.get(i).setConvertedCompanyRevenue(allUser.get(i).getCompanyRevenue() * 1.65);
            allUser.get(i).setConvertedProfit(allUser.get(i).getProfit() * 1.65);
            allUser.get(i).setConvertedFirstGRevenue(allUser.get(i).getFirstGRevenue() * 1.65);
            allUser.get(i).setConvertedSecondGRevenue(allUser.get(i).getSecondGRevenue() * 1.65);
            allUser.get(i).setConvertedThirdGRevenue(allUser.get(i).getThirdGRevenue() * 1.65);
            allUser.get(i).setConvertedFourthGRevenue(allUser.get(i).getFourthGRevenue() * 1.65);
            allUser.get(i).setConvertedFifthGRevenue(allUser.get(i).getFifthGRevenue() * 1.65);
            allUser.get(i).setConvertedBonus5(allUser.get(i).getBonus5() * 1.65);
            allUser.get(i).setConvertedBonus50(allUser.get(i).getBonus50() * 1.65);
            allUser.get(i).setConvertedBonus500(allUser.get(i).getBonus500() * 1.65);
        } else if (allUser.get(0).getCountry().equals("Thailand")) {
            allUser.get(i).setUnit("Thai Baht");
            allUser.get(i).setConvertedRegistrationCost(allUser.get(i).getRegistrationCost() * 7.64);
            allUser.get(i).setConvertedCompanyRevenue(allUser.get(i).getCompanyRevenue() * 7.64);
            allUser.get(i).setConvertedProfit(allUser.get(i).getProfit() * 7.64);
            allUser.get(i).setConvertedFirstGRevenue(allUser.get(i).getFirstGRevenue() * 7.64);
            allUser.get(i).setConvertedSecondGRevenue(allUser.get(i).getSecondGRevenue() * 7.64);
            allUser.get(i).setConvertedThirdGRevenue(allUser.get(i).getThirdGRevenue() * 7.64);
            allUser.get(i).setConvertedFourthGRevenue(allUser.get(i).getFourthGRevenue() * 7.64);
            allUser.get(i).setConvertedFifthGRevenue(allUser.get(i).getFifthGRevenue() * 7.64);
            allUser.get(i).setConvertedBonus5(allUser.get(i).getBonus5() * 7.64);
            allUser.get(i).setConvertedBonus50(allUser.get(i).getBonus50() * 7.64);
            allUser.get(i).setConvertedBonus500(allUser.get(i).getBonus500() * 7.64);
        } else if (allUser.get(0).getCountry().equals("Singapore")) {
            allUser.get(i).setUnit("Singapore Dollar");
            allUser.get(i).setConvertedRegistrationCost(allUser.get(i).getRegistrationCost() * 0.33);
            allUser.get(i).setConvertedCompanyRevenue(allUser.get(i).getCompanyRevenue() * 0.33);
            allUser.get(i).setConvertedProfit(allUser.get(i).getProfit() * 0.33);
            allUser.get(i).setConvertedFirstGRevenue(allUser.get(i).getFirstGRevenue() * 0.33);
            allUser.get(i).setConvertedSecondGRevenue(allUser.get(i).getSecondGRevenue() * 0.33);
            allUser.get(i).setConvertedThirdGRevenue(allUser.get(i).getThirdGRevenue() * 0.33);
            allUser.get(i).setConvertedFourthGRevenue(allUser.get(i).getFourthGRevenue() * 0.33);
            allUser.get(i).setConvertedFifthGRevenue(allUser.get(i).getFifthGRevenue() * 0.33);
            allUser.get(i).setConvertedBonus5(allUser.get(i).getBonus5() * 0.33);
            allUser.get(i).setConvertedBonus50(allUser.get(i).getBonus50() * 0.33);
            allUser.get(i).setConvertedBonus500(allUser.get(i).getBonus500() * 0.33);
        } else if (allUser.get(0).getCountry().equals("Hong Kong")) {
            allUser.get(i).setUnit("Hong Kong Dollar");
            allUser.get(i).setConvertedRegistrationCost(allUser.get(i).getRegistrationCost() * 1.88);
            allUser.get(i).setConvertedCompanyRevenue(allUser.get(i).getCompanyRevenue() * 1.88);
            allUser.get(i).setConvertedProfit(allUser.get(i).getProfit() * 1.88);
            allUser.get(i).setConvertedFirstGRevenue(allUser.get(i).getFirstGRevenue() * 1.88);
            allUser.get(i).setConvertedSecondGRevenue(allUser.get(i).getSecondGRevenue() * 1.88);
            allUser.get(i).setConvertedThirdGRevenue(allUser.get(i).getThirdGRevenue() * 1.88);
            allUser.get(i).setConvertedFourthGRevenue(allUser.get(i).getFourthGRevenue() * 1.88);
            allUser.get(i).setConvertedFifthGRevenue(allUser.get(i).getFifthGRevenue() * 1.88);
            allUser.get(i).setConvertedBonus5(allUser.get(i).getBonus5() * 1.88);
            allUser.get(i).setConvertedBonus50(allUser.get(i).getBonus50() * 1.88);
            allUser.get(i).setConvertedBonus500(allUser.get(i).getBonus500() * 1.88);
        } else if (allUser.get(0).getCountry().equals("Malaysia")) {
            allUser.get(i).setUnit("Malaysian Ringgit");
            allUser.get(i).setConvertedRegistrationCost(allUser.get(i).getRegistrationCost());
            allUser.get(i).setConvertedCompanyRevenue(allUser.get(i).getCompanyRevenue());
            allUser.get(i).setConvertedProfit(allUser.get(i).getProfit());
            allUser.get(i).setConvertedFirstGRevenue(allUser.get(i).getFirstGRevenue());
            allUser.get(i).setConvertedSecondGRevenue(allUser.get(i).getSecondGRevenue());
            allUser.get(i).setConvertedThirdGRevenue(allUser.get(i).getThirdGRevenue());
            allUser.get(i).setConvertedFourthGRevenue(allUser.get(i).getFourthGRevenue());
            allUser.get(i).setConvertedFifthGRevenue(allUser.get(i).getFifthGRevenue());
            allUser.get(i).setConvertedBonus5(allUser.get(i).getBonus5());
            allUser.get(i).setConvertedBonus50(allUser.get(i).getBonus50());
            allUser.get(i).setConvertedBonus500(allUser.get(i).getBonus500());
        } else {

        }

    }
    }
}
