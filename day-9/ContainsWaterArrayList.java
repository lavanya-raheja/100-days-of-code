import java.util.*;

public class ContainsMostWater {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        int left  = 0; 
        int right = list.size()-1;
        int maxWater = 0; 

        while(left<right) {
            int water = Math.min(list.get(left), list.get(right))*(right-left);
            maxWater = Math.max(water, maxWater);

            if(list.get(left)<list.get(right)) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(maxWater);
    }
}
