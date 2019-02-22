import java.*;
/*
Take 2 stacks, One is main stack and other is tempstack
1. For the push -> Push the element into the main stack
2. For the POP ->
  a) check if the tempstack is empty,then transfer all the elements from mainstack to tempstack
  b)POP the element from the tempstack
3.For the PEEK ->
  a) Check if the tempstack is empty, then transfer all the elements from mainstack to tempstack
  b) PEEK the element from the tempstack
*/

public class ImplementQueueUsing2Stacks{

    Stack<Integer> mystack=new Stack<Integer>();
    Stack<Integer> tempstack=new Stack<Integer>();
    public MyQueue() {
        // do intialization if necessary
    }

    /*
     * @param element: An integer
     * @return: nothing
     */
    public void push(int element) {
        // write your code here
        mystack.push(element);
    }

    /*
     * @return: An integer
     */
    public int pop() {
        // write your code here
        if(tempstack.empty()==true){
            while(!mystack.empty()==true){
                tempstack.push(mystack.pop());
            }
        }
        return tempstack.pop();
    }

    /*
     * @return: An integer
     */
    public int top() {
        // write your code here
        if(tempstack.empty()==true){
            while(!mystack.empty()==true){
                tempstack.push(mystack.pop());
            }
        }
        return tempstack.peek();
    }


}