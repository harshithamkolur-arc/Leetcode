class Solution {
    public int flip(int num) {
        if (num == 1)
            return 0;
        return 1;
    }

    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = flip(image[i][j]);
                image[i][j] = flip(image[i][n - 1 - j]);
                image[i][n - 1 - j] = temp;
            }
            if (n % 2 != 0) {
                image[i][n / 2] = flip(image[i][n / 2]);
            }
        }
        return image;
    }
}