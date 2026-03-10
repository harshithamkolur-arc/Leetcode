class Solution {
public:
    int maxFreqSum(string s) {
        string vowel = "aeiou";
        int vow_max = 0;
        int con_max = 0;
        unordered_map<char, int> vow_map;
        unordered_map<char, int> con_map;
        for (char letters : vowel) {
            vow_map[letters] = 0;
        }
        for (int i = 0; i < s.size(); i++) {
            if (vow_map.find(s[i]) != vow_map.end()) {
                vow_map[s[i]]++;
            } else {
                con_map[s[i]]++;
            }
        }
        for (auto vow : vow_map) {
            if (vow.second > vow_max) {
                vow_max = vow.second;
            }
        }
        for (auto con : con_map) {
            if (con.second > con_max) {
                con_max = con.second;
            }
        }
        return (vow_max + con_max);
    }
};