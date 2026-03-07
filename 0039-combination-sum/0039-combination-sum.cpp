class Solution {
public:
    set<vector<int>> s; // to store only the unique combinations we are using set here
    void solve(vector<int>&candidates,int target,vector<int>&comb,vector<vector<int>>&ans,int idx){
        int n = candidates.size();
        if(idx == n || target<0){
            return;
        }
        if(target == 0){
            if(s.find(comb)==s.end()){  // check whether the combination is unique or not
                ans.push_back(comb);
                s.insert(comb);
            }
            return;
        }
        comb.push_back(candidates[idx]);
        solve(candidates,target-candidates[idx],comb,ans,idx+1); // single inclusion
        solve(candidates,target-candidates[idx],comb,ans,idx); // multiple inclusion
        comb.pop_back();
        solve(candidates,target,comb,ans,idx+1); // exclude 
    }
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<int> comb;
        vector<vector<int>> ans;
        solve(candidates,target,comb,ans,0);
        return ans;
    }
};