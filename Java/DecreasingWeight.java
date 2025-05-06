public class DecreasingWeight {
    public static void main(String[] args) {
        //int[] arr = new int[] {3, 3, 5, 0, 1};
        //int[] arr = new int[] {1, 2, 3, 4, 5};

        int[] arr = new int[] {5, 3, 2, 16, 3, 2, 1};

        System.out.println(findMax(arr));
    }

    private static int findMax(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }

        int currentSum = arr[0];
        int maxSum = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                currentSum += arr[i];
                maxSum = Math.max(currentSum, maxSum);
            } else {
                currentSum = arr[i];
            }
        }

        return maxSum;
    }
}
