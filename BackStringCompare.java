class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack =  new Stack();
        Stack<Character> stack1 =  new Stack();

        for(char c:s.toCharArray()){
             if('#' ==(c)  && !stack.isEmpty()){
                stack.pop();
               
             }
            else if('#' != c ){
                stack.push(c);
            }
        }
        for(char d:t.toCharArray()){
            
            if('#' ==(d)  && !stack1.isEmpty()){
                stack1.pop();
                //continue;
            }
            else if('#' != d ){
                stack1.push(d);
            }
        }
         while(!stack.isEmpty() && !stack1.isEmpty()){
            if(stack.pop() != stack1.pop()){
                return false;
            }
        }
        
        if((stack.isEmpty() && !stack1.isEmpty()) || (!stack.isEmpty() && stack1.isEmpty())){
            return false;
        }
        
        return true;
    }
}
