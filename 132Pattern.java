/* Algorthim 
1. Have a stack, each time we store a new number, we first pop out all numbers that are smaller than that number. The numbers that 
are popped out becomes candidate for s3.

2. We keep track of the maximum of such s3 (which is always the most recently popped number from the stack).

3.Once we encounter any number smaller than s3, we know we found a valid sequence since s1 < s3 implies s1 < s2.

public boolean 132pattern(int nums){
  Stack<Integer> stack=new Stack<>();
  int s3=INTEGER.MIN_VALUE;
  for(int i=nums.length-1;i>=0;i--){
    if(nums[i]<s3){
    return true;
    }
    else{
      while(!stack.empty() && stack.peek()<nums[i]){
        s3=stack.pop();
        }
        stack.push(nums[i]);
        }
    return false;
  }
