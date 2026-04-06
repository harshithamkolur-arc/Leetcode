class Solution {
public:
    bool judgeCircle(string moves) {
        int n = moves.size();
        unordered_map<char, int> map;
        for (int i = 0; i < n; i++) {
            if (moves[i] == 'U')
                map['U']++;
            else if (moves[i] == 'L')
                map['L']++;
            else if (moves[i] == 'R')
                map['R']++;
            else
                map['D']++;
        }
        if (map['U'] == map['D'] && map['L'] == map['R']) {
            return true;
        } else
            return false;
    }
};