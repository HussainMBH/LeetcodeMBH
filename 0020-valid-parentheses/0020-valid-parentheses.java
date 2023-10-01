class Solution {
    public boolean isValid(String s) {
        Stack <Character> str = new Stack<>();
        for(int i=0; i<s.length(); i++){   //[ { ( ) } ]
            char ch = s.charAt(i);
            if(ch == '{' || ch == '[' || ch == '('){
               str.push(ch);
            }else if(ch == '}' && !str.isEmpty() && str.peek() == '{'){
                str.pop();
            }else if(ch == ']' && !str.isEmpty() && str.peek() == '['){
                str.pop();
            }else if(ch == ')' && !str.isEmpty() && str.peek() == '('){
                str.pop();
            }else{
                return false;
            }
        }
        return str.isEmpty();
    }
}