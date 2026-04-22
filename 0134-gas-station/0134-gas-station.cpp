class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        int n = gas.size();
        int gasSum = 0, costSum = 0;
        for (int i = 0; i < n; i++) {
            gasSum += gas[i];
            costSum += cost[i];
        }
        if (gasSum < costSum) {
            return -1;
        }
        int currgas = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            currgas += gas[i] - cost[i];
            if(currgas < 0){
                start = i + 1;
                currgas = 0;
            }
        }
        return start;
    }
};