class Solution {
public:
    string binaryConversion(int digit) {
        string bin = "";
        while (digit > 0) {
            int reminder = digit % 2;
            bin.push_back('0' + reminder);
            digit /= 2;
        }
        reverse(bin.begin(),bin.end());
        return bin;
    }
    string convertDateToBinary(string date) {
        string ans = "";
        for (int i = 0; i < date.length(); i++) {
            string word = "";
            while (i < date.length() && date[i] != '-') {
                word += date[i];
                i++;
            }
            int digit = stoi(word);
            string binary = binaryConversion(digit);
            ans += "-" + binary;
        }
        return ans.substr(1);
    }
};