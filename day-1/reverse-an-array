public class ReverseArray {
    public static void revArray(int arr[]) {
        for(int i = 0; i < arr.length/2; i++) {
            int temp = arr[i]; 
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        // print the newly reversed array

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 8, 10};
        revArray(arr); 
    }
}
