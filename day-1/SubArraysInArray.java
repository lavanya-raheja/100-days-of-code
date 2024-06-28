// to print all subarrays in an array

public class SubArraysInArray {
    public static void printSubarrays(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                for(int k=i; k<=j; k++) {
                    System.out.print(arr[k]+"   ");
                }
                System.out.print("           ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 8, 10, 12};
        printSubarrays(arr);
    }
}
