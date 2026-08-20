class Solution {
    public int maximum69Number (int num) {
        List<Integer> arr = new ArrayList<>();
        String str = String.valueOf(num);
        for(char ch : str.toCharArray()){
            arr.add(ch - '0');
        }
        int idx = arr.indexOf(6);
        if(idx>=0){
            arr.set(idx, 9); 
        }
        int ans = 0;
        for(int digit : arr){
            ans = (ans * 10) + digit;
        }
        return ans;
    }
    
}