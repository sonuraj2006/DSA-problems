import java.util.Scanner;
class Main {
    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxAvg = (double) sum / k;
        int start = 1;
        int end = k;
        while (end < nums.length) {
            sum = sum - nums[start - 1] + nums[end];
            double avg = (double) sum / k;
            maxAvg = Math.max(maxAvg, avg);
            start++;
            end++;
        }
        return maxAvg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        double result = findMaxAverage(nums, k);
        System.out.println("Maximum Average = " + result);
        sc.close();
    }
}
