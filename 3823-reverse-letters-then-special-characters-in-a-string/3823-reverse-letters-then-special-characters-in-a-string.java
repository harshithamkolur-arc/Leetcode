class Solution {
    public String reverseByType(String s) {
        List<Character> lowerCase = new ArrayList<>();
        List<Character> splChar = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            if (ch >= 97 && ch <= 122)
                lowerCase.add(ch);
            else if ((ch >= 32 && ch <= 47) || (ch >= 58 && ch <= 64) || (ch >= 91 && ch <= 96) ||(ch >= 123 && ch <= 126)) 
                splChar.add(ch);
        }
        Collections.reverse(lowerCase);
        Collections.reverse(splChar);
        /*
        if(!lowerCase.isEmpty()){
            for(char ch : lowerCase){
                System.out.println(ch);
            }
            
        }*/
        StringBuilder sb = new StringBuilder(s);
        int caseIdx = 0;
        int charIdx = 0;
        for (int i =0;i<sb.length();i++) {
            if (sb.charAt(i) >= 97 && sb.charAt(i) <= 122){
                sb.setCharAt(i,lowerCase.get(caseIdx));
                caseIdx++;
            }
            else if ((sb.charAt(i) >= 32 && sb.charAt(i) <= 47) || (sb.charAt(i) >= 58 && sb.charAt(i) <= 64) || (sb.charAt(i) >= 91 && sb.charAt(i) <= 96) ||(sb.charAt(i) >= 123 && sb.charAt(i) <= 126)){
                sb.setCharAt(i,splChar.get(charIdx));
                charIdx++;
            } 
        }
        return sb.toString();
    }
}