import java.util.*; 
public class MaximumInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(6);
        list.add(4);

        System.out.println(list);
        int max = Integer.MIN_VALUE;

        for(int i=0; i<=list.size()/2; i++) {
            if(max<list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println(max);
    }
}

