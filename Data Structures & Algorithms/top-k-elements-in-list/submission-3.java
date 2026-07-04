class Solution {
  
    public int[] topKFrequent(int[] nums, int k) {
    Arrays.sort(nums);
    int n=nums.length;
    ArrayList<Integer> values=new ArrayList<>();
    ArrayList<Integer> freq=new ArrayList<>();

    int count=1;
    for(int i=1;i<n;i++){
      if(nums[i]==nums[i-1]){
        count++;
      }else{
        values.add(nums[i-1]);
        freq.add(count);
        count=1;
      }
     
    }
     values.add(nums[n-1]);
      freq.add(count);

    int [] res=new int[k];

    //largest frequency
    for(int i=0;i<k;i++){
      int maxfreq=-1;
      int index=-1;

    for(int j=0;j<freq.size();j++){
      if(freq.get(j)> maxfreq){
        maxfreq=freq.get(j);
        index=j;
      }
    }
    res[i]=values.get(index);
    freq.set(index,-1);

    }
    return res;
    }
}








































    