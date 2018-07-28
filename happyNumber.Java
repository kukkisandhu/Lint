public class Solution {
    /**
     * @param n: An integer
     * @return: true if this is a happy number or false
     */
    public boolean isHappy(int n) {
        // write your code here
        if(n<0){
            return false;
        }
        HashSet<Integer> myset=new HashSet<Integer>();
        while(n!=1){
            n=cal(n);
            if(n==1){
                return true;
            }
            else if(myset.contains(n)){
                return false;
            }
            else{
                myset.add(n);
            }
        }
        return true;
    }
    public int cal(int n){
        int sum=0;
        while(n>0){
            sum=sum+(n%10)*(n%10);
            n=n/10;
        }
        return sum;
    }
}
