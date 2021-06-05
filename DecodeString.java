class Solution {
    public String decodeString(String s) {
         Stack<Character> stack = new Stack<Character>();
        
        for(char c: s.toCharArray()) {
            if (c != ']') {
                stack.push(c);
            } else {
                String repeatedLetters = "";
                String repeteadTimes = "";
                
                while (!stack.isEmpty() && Character.isLetter(stack.peek())) {
                    repeatedLetters = stack.pop() + repeatedLetters;
                }
                
                stack.pop(); //remove [
                
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    repeteadTimes = stack.pop() + repeteadTimes;
                }
                
                int countRepetedTimes = Integer.parseInt(repeteadTimes);
                
                while (countRepetedTimes > 0) {
                    for(char letter: repeatedLetters.toCharArray()) 
                        stack.push(letter);
                    countRepetedTimes--;
                }
            }
        }
        
        String finalString = "";
        while (!stack.isEmpty()) {
            finalString = stack.pop() + finalString;
        }
        
        return finalString;
    }
}
