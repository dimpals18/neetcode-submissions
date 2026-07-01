class Solution {
    public boolean isAnagram(String s, String t) {
      int n =s.length();
      int m=t.length();
      if(n!=m){
        return false;
      }
       char[] newS=s.toCharArray();
       char[] newT=t.toCharArray();

       Arrays.sort(newS);
       Arrays.sort(newT);

       return Arrays.equals(newS,newT);
    }
}
