class Solution {
public:
    int firstUniqChar(string s) {
        unordered_map<char, int> map;
        queue<int> q;
        for (int i = 0; i < s.size(); i++) {
            if (map.find(s[i]) == map.end()) {
                q.push(i);
            }
            map[s[i]]++;
            while (q.size() > 0 && map[s[q.front()]] > 1) {
                q.pop();
            }
        }
        if (q.empty()) {
            return -1;
        }
        return q.front();
    }
};