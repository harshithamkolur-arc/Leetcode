class Solution {
public:
    vector<int> findThePrefixCommonArray(vector<int>& A, vector<int>& B) {
        unordered_map<int,int> map;
        vector<int> ans;
        int n = A.size();
        int count = 0;
        for(int i=0;i<n;i++){      
            if(map.find(A[i]) != map.end()){
                count++;
            }
            else{
                map[A[i]] = 0;
            }
            if(map.find(B[i]) != map.end()){
                count++;
            }
            else{
                map[B[i]] = 0;
            }
            ans.push_back(count);
        }
        return ans;
    }
};