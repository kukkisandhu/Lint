import java.*;

public class 132Patterns{
public boolean 132patternMethod(int nums){
        Stack<Integer> stack=new Stack<>();
        int s3=INTEGER.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
        if(nums[i]<s3){
        return true;
        }
        else{
        while(!stack.empty()&&stack.peek()<nums[i]){
        s3=stack.pop();
        }
        stack.push(nums[i]);
        }
        return false;
        }

        }