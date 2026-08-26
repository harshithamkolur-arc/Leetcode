class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<String,Integer> map = new HashMap<>();
        for(String str: words){
            String ans ="";
            for(char ch: str.toCharArray()){
                ans += arr[ch - 'a'];
            }
            map.put(ans,1);
        }
        return map.size();
    }
}