package test;

public class MoveZerosToLeft {
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 1, 0, 1};
//        moveZerosToLeft(a);
        
        int left=0;
        int right=0;
        while(right<a.length) {
        	if(a[right]==0) {
        		int temp=a[left];
        		a[left]=a[right];
        		a[right]=temp;
        		left++;
        	}
        	right++;
        }
        
        
        
        // Print the result
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

//    public static void moveZerosToLeft(int[] arr) {
//        int left = 0; // Pointer for the left side (0s)
//        int right = 0; // Pointer for the current position
//        
//        while (right < arr.length) {
//            if (arr[right] == 0) {
//                // Swap left and right elements
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//                left++; // Move left pointer to the right
//            }
//            right++; // Move right pointer to the right
//        }
//    }
}
