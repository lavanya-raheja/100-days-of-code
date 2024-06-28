public class LinSearch {
    public static int linSearch(int arr[], int key) { 
        for(int i = 0; i<arr.length; i++) {
            if(arr[i]==key) {
                return i; 
            }
        }
        return 0; 
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 8, 10};
        int key = 6;
        int ans = linSearch(arr, key);
        if(ans > 0) {
            System.out.println("Key found at index: "+ ans);
        } else {
            System.out.println("Key not found!");
        }
    }
}
