class Solution {
public:
    int timeRequiredToBuy(vector<int>& tickets, int k) {
        deque<int> q;
        int sec = 0;
        for(int i=0;i<tickets.size();i++){
            q.push_back(i);
        }
        while(tickets[k] != 0){
            tickets[q.front()] -= 1;
            sec++;
            if(tickets[q.front()] != 0){
                int temp = q.front();
                q.pop_front();
                q.push_back(temp);
            }
            else{
                q.pop_front();
            }
        }
        return sec;
    }
};