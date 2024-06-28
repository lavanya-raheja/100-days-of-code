public class BinSearch {
    public static int binSearch(int[] nums, int target) {
        int left = 0; 
        int right = nums.length-1; 
        
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1; 
            } else {
                left = mid + 1; 
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 8, 10};
        int key = 6;
        int ans = binSearch(arr, key);
        if(ans > 0) {
            System.out.println("Key found at index: "+ ans);
        } else {
            System.out.println("Key not found!");
        }
    }
}
