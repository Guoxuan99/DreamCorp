package assignmentforsem2dreamcoop;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQ {
    
    public PriorityQ(List<Node> allUser){
        
     Comparator<Node> NodeComparator = new Comparator<Node>() {
        @Override
        public int compare(Node o1, Node o2) {
            if (o1.getChildren().size() < o2.getChildren().size()) {
                return 1;
            } else if (o1.getChildren().size() > o2.getChildren().size()) {
                return -1;
            } else {
                return 0;
            }
        }
    };
        
        PriorityQueue<Node> trying = new PriorityQueue<>(NodeComparator);
        Node temp;
        
        for(int i=1;i<allUser.size();i++){
            trying.add(allUser.get(i));
        }
            System.out.println("Congratulation for the First 5 people who achieve the highest number of downline in this month: ");
            for(int i=0;i<5;i++){
            temp = trying.remove();
            System.out.println(""  + temp + " Total Direct Downline/s: " + temp.getChildren().size());
            for(int j= 0; j<allUser.size();j++){
                if(temp.getID() == allUser.get(j).getID()){
                    allUser.get(j).setProfit(allUser.get(j).getProfit() + 100.0);
                }
            }
        }
            
        System.out.println("Bonus RM100 has been add to the following account.");
        
        
            
        
            
    }

}
