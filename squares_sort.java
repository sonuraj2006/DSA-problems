import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int index = nums.length - 1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements in sorted order:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = sortedSquares(nums);
        System.out.println("Sorted squares: " + Arrays.toString(result));
        sc.close();
    }
}