class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        
        int n=s.length();
        
        HashSet<Character> myset=new HashSet<>();
        char[] mychar=s.toCharArray();
        int i=0;
        int j=0;
        int ans=0;
        while(i<n && j<n){
            if(!myset.contains(s.charAt(j))){
                
                myset.add(s.charAt(j++));
                ans=Math.max(ans,j-i);
                
            }
            else{
                myset.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
