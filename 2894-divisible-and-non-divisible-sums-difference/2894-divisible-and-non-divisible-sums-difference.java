class Solution {
    public int differenceOfSums(int n, int m) {
        int div = 0;
        int not_div = 0;
        for (int val = 1; val <= n; val++) {
            if (val % m == 0)
                div += val;
            else
                not_div += val;
        }
        return (not_div - div);
    }
}