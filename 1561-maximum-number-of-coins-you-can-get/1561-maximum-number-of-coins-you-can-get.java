class Solution {
    public int maxCoins(int[] piles) {
        List<Integer> arr = new ArrayList<>();
        int sum = 0;
        for(int num:piles){
            arr.add(num);
        }
        Collections.sort(arr);
        while(arr.size() >= 3){
            Integer alice = arr.get(arr.size() - 1);
            arr.remove(arr.size() - 1);
            Integer me = arr.get(arr.size() - 1);
            sum += me;
            arr.remove(arr.size() - 1);
            Integer bob = arr.get(0);
            arr.remove(0);
        }
        return sum;
    }
}