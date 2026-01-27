class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer>sq = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int a=nums[i]*nums[i];
            sq.add(a);
        }
        Collections.sort(sq);
        int[] res = new int[sq.size()];
        for(int i = 0; i < sq.size(); i++){
            res[i] = sq.get(i);
        }

        return res;
        
     }
}