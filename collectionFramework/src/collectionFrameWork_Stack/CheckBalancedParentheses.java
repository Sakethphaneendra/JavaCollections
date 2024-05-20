package collectionFrameWork_Stack;
import java.util.Stack;

public class CheckBalancedParentheses {

	    public void check(String chaos) {
	        Stack<Character> stack = new Stack<>();
	        for (int i = 0; i < chaos.length(); i++) {
	            stack.push(chaos.charAt(i));
	        }
	        System.out.println(stack);

	        int B = 0, C = 0, P = 0, Q = 0;
	        while (!stack.isEmpty()) {
	            char element = stack.pop();
	            switch (element) {
	                case '{':
	                case '}':
	                    C++;
	                    break;

	                case '[':
	                case ']': B++; break;

	                case '<':
	                case '>':
	                    Q++;
	                    break;

	                case '(':
	                case ')':
	                    P++;
	                    break;
	            }
	        }


	        if (B != 2) {
	            System.out.println("Brackets are not Completed");
	            B=-1;
	        }
	        if (C != 2) {
	            System.out.println("Curly Brackets are not Completed");
	            B=-1;
	        }
	        if (P != 2) {
	            System.out.println("Parentheses are not Completed");
	            B=-1;
	        }
	        if (Q != 2) {
	            System.out.println("Quotations are not Completed");
	            B=-1;
	        }

	        if (B!=-1){
	            System.out.println("All Operations are Completed");
	        }
	    }

	    public static void main(String[] args) {
	    	CheckBalancedParentheses cb = new CheckBalancedParentheses();
	        cb.check("{[()]<>}");
	    }
	}
