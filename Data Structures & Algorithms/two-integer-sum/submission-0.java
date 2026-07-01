class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int x=-1;
        int y=-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                   x=i;
                   y=j;
                }
            }
        }
        int [] result={x,y};
        return result;
    }
}
