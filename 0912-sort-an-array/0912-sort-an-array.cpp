class Solution {
public:
    void mergeSort(vector<int>& nums, int st, int end) {
        int mid = st + (end - st) / 2;
        if (st < end) {
            mergeSort(nums, st, mid);
            mergeSort(nums, mid + 1, end);
        }
        if (st < end) {
            int i = st;
            int j = mid + 1;
            vector<int> temp;
            while (i <= mid && j <= end) {
                if (nums[i] < nums[j]) {
                    temp.push_back(nums[i]);
                    i++;
                } else {
                    temp.push_back(nums[j]);
                    j++;
                }
            }
            while (i <= mid) {
                temp.push_back(nums[i]);
                i++;
            }
            while (j <= end) {
                temp.push_back(nums[j]);
                j++;
            }
            for (int i = 0; i < temp.size(); i++) {
                nums[st + i] = temp[i];
            }
        }
    }
    vector<int> sortArray(vector<int>& nums) {
        int st = 0;
        int end = nums.size() - 1;
        mergeSort(nums, st, end);
        return nums;
    }
};