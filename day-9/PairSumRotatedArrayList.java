import java.util.ArrayList;

public class PairSumRotated {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        

        int left  = 0; 
        int right = list.size()-1;
        int target = 16; 
        int count = 0; 

        while(left<right) {
            int mid = (left+right) /2;
            if(list.get(mid)>list.get(right)) {
                left = mid+1; 
            } else {
                right = mid; 
            }
        }

        System.out.println(left);
        int n = list.size();
        right = (left - 1 + n)%n; 

        while (left != right) {
            // If we find a pair with sum equals to target
            if (list.get(left) + list.get(right) == target) {
                count++;
                left = (left + 1) % n;
                right = (right - 1 + n) % n;

                // If they meet, break the loop
                if (left == right) break;
            } 
            // If current pair sum is less, move to the higher sum
            else if (list.get(left) + list.get(right) < target) {
                left = (left + 1) % n;
            } 
            // Move to the lower sum side
            else {
                right = (right - 1 + n) % n;
            }
        }
        System.out.println(count);
    }
}


