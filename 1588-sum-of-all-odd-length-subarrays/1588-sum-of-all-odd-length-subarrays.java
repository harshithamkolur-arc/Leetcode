class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length; j++) {
                int len = (j - i);
                if (len % 2 != 0) {
                    for (int k = i; k < j; k++) {
                        sum += arr[k];
                    }
                }
            }
        }
        return sum;
    }
}