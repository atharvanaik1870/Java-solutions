class Solution {
    public String removeDuplicateLetters(String s) {
         LinkedHashSet<Character> set = new LinkedHashSet<>();   
        //Add each character of the string into LinkedHashSet   
        for(int i=0;i<s.length();i++)   
            set.add(s.charAt(i));   
            
        String res="";
        // print the string after removing duplicate characters   
        for(Character ch : set)  
            res = res + ch;
        char[] str = res.toCharArray();
        Arrays.sort(str);
          
        return new String(str);
    }
}
