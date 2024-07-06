import java.util.ArrayList;

public class PairSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        

        int left  = 0; 
        int right = list.size()-1;
        int target = 5; 
        int count = 0; 

        while(left<right) {
            if(list.get(left)+list.get(right)==target) {
                count++;
                left++; 
                right--; 
            } else if(list.get(left)+list.get(right)>target) {
                right--; 
            } else {
                left++;
            }
        }

        System.out.println(count);
    }
}

