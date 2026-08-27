class Solution {
    public String sortVowels(String s) {
        List<Character> arr = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') arr.add(ch);
        }
        Collections.sort(arr);
        StringBuilder sb = new StringBuilder(s);
        int idx = 0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u' || sb.charAt(i) == 'A'|| sb.charAt(i) == 'E' || sb.charAt(i) == 'I' || sb.charAt(i) == 'O' || sb.charAt(i) == 'U') {
                sb.setCharAt(i,arr.get(idx));
                idx++;
            }
        }
        return sb.toString();
    }
}