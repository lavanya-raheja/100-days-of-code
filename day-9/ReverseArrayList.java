import java.util.*; 
public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        for(int i=0; i<=list.size()/2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size()-1-i)); 
            list.set(list.size()-1-i, temp);
        }
        System.out.println(list);
    }
}
