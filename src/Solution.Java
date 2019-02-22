import java.util.*;
public class Solution {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> mymap=new HashMap<Integer,Integer>();
        for(int num:nums){
            if(mymap.containsKey(num)){
                int result=mymap.get(num);
                result++;
                mymap.put(num,result);
            }
            else{
                mymap.put(num,1);
            }

        }


        for(int myint:mymap.keySet()){
            if(mymap.get(myint)==1) {
                return myint;

            }
        }
        return -1;
    }
    public static  int reversal(int x){
        boolean flag=false;
        if(x==0){
            return 0;
        }
        if(x<0){
            flag=true;
            x=-(x);
        }
        int reverse=0;
        while(x>0){
            int remainder=x%10;
            reverse=remainder+reverse*10;
            x=x/10;
        }
        if(reverse>2147483647){
            return 0;
        }
        if(flag){
            return -reverse;
        }
        else{
            return reverse;
        }

    }
    public static int lengthOfLongestSubstring(String s){
        // check if string is empty or length equals to 1
        if (s.length() < 2) return s.length();

        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        int maxLen = 1;
        int len = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i), i);
                len++;
            } else { // found repeated
                i = hashMap.get(s.charAt(i));
                maxLen = Math.max(maxLen, len);
                hashMap.clear();
                len = 0;
            }
        }
        return Math.max(maxLen, len);
    }


    public static int removeDuplicates(int [] nums){
        int len=0;
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        for(int j=0;j<i+1;j++){
            System.out.println(nums[j]);

        }
        return i+1;
    }
    public static int removeDuplicates2(int [] nums){
        int len=0;
        if(nums.length<3){
            return nums.length;
        }
        int prev=1;
        int curr=2;
        while(curr< nums.length){
            if(nums[curr]==nums[prev] && nums[curr]==nums[prev-1]){
                curr++;
            }
            else{
                prev++;
                nums[prev]=nums[curr];
                curr++;
            }
        }
        for(int i=0;i<prev+1;i++){
            System.out.println(nums[i]);
        }
        return prev+1;
    }
    public static int threeSum(int[] nums,int target ){
        if(nums.length<3){
            return 0;
        }
        int result=0;
        int mindiff=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(mindiff>Math.abs(sum-target)){
                    mindiff=Math.abs(sum-target);
                    result=mindiff;
                }
                if(sum==target){
                    return sum;
                }
                else if(sum>target){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return result;
    }


    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result=0;
        int sum=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        int i=0;
        for(i=0;i<nums.length-1;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                int  differ=Math.abs(sum-target);
                if(differ==0){
                    return sum;
                }
                if(differ<min){
                    min=differ;
                    result=sum;
                }
                if(sum<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return result;
    }
    public static void reverseString(char[] s){
        int start=0;
        int end=s.length-1;
        while(start<end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }
    public static boolean isPalindrome(String sb){
        String s=sb.toUpperCase();
        if(s.length()==0){
            return true;
        }
        int start=0;
        int end=s.length()-1;
        while (start<end){
            if (!Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            if (!Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            System.out.print(s.charAt(end));
            System.out.println(s.charAt(start));
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static String myreverseString(String s){
        if(s.length()==0){
            return "";
        }
        String[] myarray=s.split(" ");
        StringBuilder sb=new StringBuilder();
        int start=0;
        int end=myarray.length-1;
        while (start<end){
            sb.append(myarray[end]);
            sb.append(" ");
            end--;
        }


        return sb.toString();
    }



    public  static void main(String[] args)
    {

        String s="the sky is blue";

        System.out.println(myreverseString(s));

    }
}

