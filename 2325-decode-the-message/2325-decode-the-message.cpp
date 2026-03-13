class Solution {
public:
    string decodeMessage(string key, string message) {
        unordered_map<char, char> map;
        string ans;
        int alpha = 0;
        for (int i = 0; i < key.size(); i++) {
            if (map.find(key[i]) == map.end() && key[i] != ' ') {
                map[key[i]] = 'a' + alpha;
                alpha++;
            }
        }
        for (int i = 0; i < message.size(); i++) {
            if (message[i] == ' ') {
                ans.push_back(message[i]);
            } else {
                ans.push_back(map[message[i]]);
            }
        }
        return ans;
    }
};