package assignmentforsem2dreamcoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Node<T> implements Comparable<Node> {

    private T data = null;
    private List<Node> children = new ArrayList<>();
    private Node parent = null;
    private static double ConvertedCompanyRevenue = 0.0;
    private double ConvertedProfit = 0.0;
    private double ConvertedRegistrationCost = 50.0;
    private double ConvertedFirstGRevenue = 0.0;
    private double ConvertedSecondGRevenue = 0.0;
    private double ConvertedThirdGRevenue = 0.0;
    private double ConvertedFourthGRevenue = 0.0;
    private double ConvertedFifthGRevenue = 0.0;
    private double ConvertedBonus5 = 0.0;
    private double ConvertedBonus50 = 0.0;
    private double ConvertedBonus500 = 0.0;
    private static double CompanyRevenue = 0.0;
    private double Profit = 0.0;
    private double RegistrationCost = 50.0;
    private double FirstGRevenue = 0.0;
    private double SecondGRevenue = 0.0;
    private double ThirdGRevenue = 0.0;
    private double FourthGRevenue = 0.0;
    private double FifthGRevenue = 0.0;
    private double Bonus5 = 20.0;
    private double Bonus50 = 200.0;
    private double Bonus500 = 2000.0;
    private double FirstGPercentage = 50.0;
    private double SecondGPercentage = 12.0;
    private double ThirdGPercentage = 9.0;
    private double FourthGPercentage = 6.0;
    private double FifthGPercentage = 3.0;
    private String Key = null;
    private String Password = null;
    private String EncryptedName = null;
    private int ID = 0;
    private String Name = null;
    private int ParentName = 0;
    private static int counter = 0;
    private String unit = null;
    public String country = null;

    public double getConvertedBonus5() {
        return ConvertedBonus5;
    }

    public void setConvertedBonus5(double ConvertedBonus5) {
        this.ConvertedBonus5 = ConvertedBonus5;
    }

    public double getConvertedBonus50() {
        return ConvertedBonus50;
    }

    public void setConvertedBonus50(double ConvertedBonus50) {
        this.ConvertedBonus50 = ConvertedBonus50;
    }

    public double getConvertedBonus500() {
        return ConvertedBonus500;
    }

    public void setConvertedBonus500(double ConvertedBonus500) {
        this.ConvertedBonus500 = ConvertedBonus500;
    }

    public double getBonus5() {
        return Bonus5;
    }

    public void setBonus5(double Bonus5) {
        this.Bonus5 = Bonus5;
    }

    public double getBonus50() {
        return Bonus50;
    }

    public void setBonus50(double Bonus50) {
        this.Bonus50 = Bonus50;
    }

    public double getBonus500() {
        return Bonus500;
    }

    public void setBonus500(double Bonus500) {
        this.Bonus500 = Bonus500;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    public static double getConvertedCompanyRevenue() {
        return ConvertedCompanyRevenue;
    }

    public static void setConvertedCompanyRevenue(double ConvertedCompanyRevenue) {
        Node.ConvertedCompanyRevenue = ConvertedCompanyRevenue;
    }

    public double getConvertedProfit() {
        return ConvertedProfit;
    }

    public void setConvertedProfit(double ConvertedProfit) {
        this.ConvertedProfit = ConvertedProfit;
    }

    public double getConvertedRegistrationCost() {
        return ConvertedRegistrationCost;
    }

    public void setConvertedRegistrationCost(double ConvertedRegistrationCost) {
        this.ConvertedRegistrationCost = ConvertedRegistrationCost;
    }

    public double getConvertedFirstGRevenue() {
        return ConvertedFirstGRevenue;
    }

    public void setConvertedFirstGRevenue(double ConvertedFirstGRevenue) {
        this.ConvertedFirstGRevenue = ConvertedFirstGRevenue;
    }

    public double getConvertedSecondGRevenue() {
        return ConvertedSecondGRevenue;
    }

    public void setConvertedSecondGRevenue(double ConvertedSecondGRevenue) {
        this.ConvertedSecondGRevenue = ConvertedSecondGRevenue;
    }

    public double getConvertedThirdGRevenue() {
        return ConvertedThirdGRevenue;
    }

    public void setConvertedThirdGRevenue(double ConvertedThirdGRevenue) {
        this.ConvertedThirdGRevenue = ConvertedThirdGRevenue;
    }

    public double getConvertedFourthGRevenue() {
        return ConvertedFourthGRevenue;
    }

    public void setConvertedFourthGRevenue(double ConvertedFourthGRevenue) {
        this.ConvertedFourthGRevenue = ConvertedFourthGRevenue;
    }

    public double getConvertedFifthGRevenue() {
        return ConvertedFifthGRevenue;
    }

    public void setConvertedFifthGRevenue(double ConvertedFifthGRevenue) {
        this.ConvertedFifthGRevenue = ConvertedFifthGRevenue;
    }

    public double getFirstGRevenue() {
        return FirstGRevenue;
    }

    public void setFirstGRevenue(double FirstGRevenue) {
        this.FirstGRevenue = FirstGRevenue;
    }

    public double getSecondGRevenue() {
        return SecondGRevenue;
    }

    public void setSecondGRevenue(double SecondGRevenue) {
        this.SecondGRevenue = SecondGRevenue;
    }

    public double getThirdGRevenue() {
        return ThirdGRevenue;
    }

    public void setThirdGRevenue(double ThirdGRevenue) {
        this.ThirdGRevenue = ThirdGRevenue;
    }

    public double getFourthGRevenue() {
        return FourthGRevenue;
    }

    public void setFourthGRevenue(double FourthGRevenue) {
        this.FourthGRevenue = FourthGRevenue;
    }

    public double getFifthGRevenue() {
        return FifthGRevenue;
    }

    public void setFifthGRevenue(double FifthGRevenue) {
        this.FifthGRevenue = FifthGRevenue;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Node(T data) {
        this.data = data;
        this.Profit = -50.00;
    }

    public double getRegistrationCost() {
        return RegistrationCost;
    }

    public void setRegistrationCost(double RegistrationCost) {
        this.RegistrationCost = RegistrationCost;
    }

    public double getFirstGPercentage() {
        return FirstGPercentage;
    }

    public void setFirstGPercentage(double FirstGPercentage) {
        this.FirstGPercentage = FirstGPercentage;
    }

    public double getSecondGPercentage() {
        return SecondGPercentage;
    }

    public void setSecondGPercentage(double SecondGPercentage) {
        this.SecondGPercentage = SecondGPercentage;
    }

    public double getThirdGPercentage() {
        return ThirdGPercentage;
    }

    public void setThirdGPercentage(double ThirdGPercentage) {
        this.ThirdGPercentage = ThirdGPercentage;
    }

    public double getFourthGPercentage() {
        return FourthGPercentage;
    }

    public void setFourthGPercentage(double FourthGPercentage) {
        this.FourthGPercentage = FourthGPercentage;
    }

    public double getFifthGPercentage() {
        return FifthGPercentage;
    }

    public void setFifthGPercentage(double FifthGPercentage) {
        this.FifthGPercentage = FifthGPercentage;
    }

    public static <T> void printTree(Node<T> node, String space) {
        double size = space.length();
        space = "";
        for (int i = 0; i < size; i++) {
            space = space + " ";
        }

        if (counter == 0) {

        } else {
            space = space + "╚";
        }

        System.out.println(space + node.getData());
        for (int i = 0; i < node.getChildren().size(); i++) {
            counter++;
            printTree(node.getChildren().get(i), space + "  ");
        }
        counter = 0;
        //node.getChildren().forEach(each -> printTree(each, space + "   "));
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setParentName(int ParentName) {
        this.ParentName = ParentName;
    }

    public int getParentName() {
        return ParentName;
    }

    public String getFullInfo() {
        return ID + "," + Name + "," + Password + "," + Key + "," + EncryptedName + "," + ParentName;
    }

    private final char[] Alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
        's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
        'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2',
        '3', '4', '5', '6', '7', '8', '9', '0', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '{', '}', ';', '<', '>'};
    Random r = new Random();

    public void Encrypt(int ID, String key) {
        this.ID = ID;
        this.Key = key;

        String EncryptedName = "";
        for (int i = 0; i < 10; i++) {
            EncryptedName += Alphabet[r.nextInt(77)];
        }

        this.EncryptedName = EncryptedName;
    }

    public void Decrypt(String EncryptedName, String key) {

        if (EncryptedName.equals(this.EncryptedName) && key.equals(this.Key)) {
            System.out.println("The real name of user " + EncryptedName + " is " + Name);
        } else {
            System.out.println("You have input the wrong EncryptedName or key. Please try again.");
        }
    }

    public void setID(int SizeOfAllUser) {
        ID = 1000 + SizeOfAllUser;
    }

    public int getID() {
        return ID;
    }

    public String getEncryptedName() {
        return EncryptedName;
    }

    public void setEncryptedName(String EncryptedName) {
        this.EncryptedName = EncryptedName;
    }

    public void setKey(String Key) {
        this.Key = Key;
    }

    public String getKey() {
        return Key;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPassword() {
        return Password;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void setProfit(double profit) {
        Profit = profit;
    }

    public double getProfit() {
        return Profit;
    }

    public double getCompanyRevenue() {
        return CompanyRevenue;
    }

    public void setCompanyRevenue(double amount) {
        amount = CompanyRevenue;
    }

    public void addChild(Node child) {
        child.setParent(this); //this is the method's parameter (setParent's parent)
        child.addProfit(child);
        this.children.add(child);
    }

    public void addProfit(Node up) {
        if (up.parent == null) {
            CompanyRevenue += RegistrationCost;
        } else if (up.parent.parent == null) {
            up.parent.Profit = up.parent.Profit + RegistrationCost * (FirstGPercentage / 100.0);
            CompanyRevenue += RegistrationCost * ((100 - FirstGPercentage) / 100.0);
        } else if (up.parent.parent.parent == null) {
            up.parent.Profit = up.parent.Profit + RegistrationCost * (FirstGPercentage / 100.0);
            up.parent.parent.Profit = up.parent.parent.Profit + RegistrationCost * (SecondGPercentage / 100.0);
            CompanyRevenue += RegistrationCost * ((100 - FirstGPercentage - SecondGPercentage) / 100.0);
        } else if (up.parent.parent.parent.parent == null) {
            up.parent.Profit = up.parent.Profit + RegistrationCost * (FirstGPercentage / 100.0);
            up.parent.parent.Profit = up.parent.parent.Profit + RegistrationCost * (SecondGPercentage / 100.0);
            up.parent.parent.parent.Profit = up.parent.parent.parent.Profit + RegistrationCost * (ThirdGPercentage / 100.0);
            CompanyRevenue += RegistrationCost * ((100 - FirstGPercentage - SecondGPercentage - ThirdGPercentage) / 100.0);
        } else if (up.parent.parent.parent.parent.parent == null) {
            up.parent.Profit = up.parent.Profit + RegistrationCost * (FirstGPercentage / 100.0);
            up.parent.parent.Profit = up.parent.parent.Profit + RegistrationCost * (SecondGPercentage / 100.0);
            up.parent.parent.parent.Profit = up.parent.parent.parent.Profit + RegistrationCost * (ThirdGPercentage / 100.0);
            up.parent.parent.parent.parent.Profit = up.parent.parent.parent.parent.Profit + RegistrationCost * (FourthGPercentage / 100.0);
            CompanyRevenue += RegistrationCost * ((100 - FirstGPercentage - SecondGPercentage - ThirdGPercentage - FourthGPercentage) / 100.0);
        } else {
            up.parent.Profit = up.parent.Profit + RegistrationCost * (FirstGPercentage / 100.0);
            up.parent.parent.Profit = up.parent.parent.Profit + RegistrationCost * (SecondGPercentage / 100.0);
            up.parent.parent.parent.Profit = up.parent.parent.parent.Profit + RegistrationCost * (ThirdGPercentage / 100.0);
            up.parent.parent.parent.parent.Profit = up.parent.parent.parent.parent.Profit + RegistrationCost * (FourthGPercentage / 100.0);
            up.parent.parent.parent.parent.parent.Profit = up.parent.parent.parent.parent.parent.Profit + RegistrationCost * (FifthGPercentage / 100.0);
            CompanyRevenue += RegistrationCost * ((100 - FirstGPercentage - SecondGPercentage - ThirdGPercentage - FourthGPercentage - FifthGPercentage) / 100.0);
        }

    }

    public List<Node> getChildren() {
        return children;
    }

    public String toString() { //by default, when we call allUser.get(0), it will print out the children list already.
        String a ="" + this.getID()+ ":";
        if (children.size() != 0) {
           a = getData() + "'s direct downline: ";

            for (int i = 0; i < children.size() - 1; i++) {
                a = a + children.get(i).getData() + ",";
            }
            a = a + children.get(children.size() - 1).getData();
        }
        return a;
    }

    public T getData() {
        if (data == null) {
            return null;
        } else {
            return data;
        }
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getParent() {
        return parent;
    }

    @Override
    public int compareTo(Node o) {
        if (this.Profit > o.Profit) {
            return 1;
        } else if (o.Profit > this.Profit) {
            return -1;
        } else {
            return 0;
        }
    }

}
