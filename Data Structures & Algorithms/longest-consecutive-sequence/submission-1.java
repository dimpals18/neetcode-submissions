class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int count=1;
        int max=1;
        if(n==0) return 0;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            int r=nums[i]-nums[i-1];
            if(r==1){
                count++;
            }
            else if(r==0){
               continue;
            }else{
                max=Math.max(max,count);
                count =1;
            }
        }
        max=Math.max(max,count);
       return max;
    }
     
}