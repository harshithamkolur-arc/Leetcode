class Solution {
public:
    string defangIPaddr(string address) {
        int i = 0;
        while ((address.find('.', i)) != string::npos) {
            int index = address.find('.', i);
            address.erase(index, 1);
            address.insert(index, "[.]");
            i = index + 3;
        }
        return address;
    }
};
