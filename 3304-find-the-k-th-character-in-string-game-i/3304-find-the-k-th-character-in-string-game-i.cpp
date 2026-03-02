class Solution {
public:
    char character(int k, int len) {
        if(len == 1){
            return 'a';
        }
        int half = len / 2;
        if (k <= half) {
            return character(k, half);
        } else {
            char ans = character(k-half, half);
            return ans+1;
        }
    }
    char kthCharacter(int k) {
        int len = 1;
        while (len < k) {
            len *= 2;
        }
        return character(k, len);
    }
};