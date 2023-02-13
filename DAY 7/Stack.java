import java.util.*;
class Solution{
	
        
    static final Map<Character, Character> parentheses = new HashMap<>(3);
    
    static {
        parentheses.put(']', '[');
        parentheses.put('}', '{');
        parentheses.put(')', '(');
    }
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			
            String in = sc.next();
            System.out.println(validParenthese(in));
        }
        
        sc.close();
    }
    
    static boolean validParenthese(String in) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < in.length(); i++) {
            Character c = in.charAt(i);
            if (!stack.isEmpty() && parentheses.containsKey(c)) {
                Character openParenthese = stack.pop();
                if (openParenthese != parentheses.get(c)) {
                    return false;
                }
            } else {
                stack.push(c); 
            }
        }
        return stack.isEmpty();
    }
}		
