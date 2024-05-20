package collectionFrameWork_Stack;
import java.util.Stack;
public class StringReverse {

	public static void main(String[] args) {

			String Name = "JayaSree";
			StringReverse sr = new StringReverse();
			sr.rev(Name);
	}
	public void rev(String name) {
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<name.length();i++) {
			stack.push(name.charAt(i));
		}
		String rev="";
		while(!stack.isEmpty()) {
			rev = rev+stack.pop();
		}
		if(rev!=name) {
			System.out.println("The Reverse String " + name + " Is : "+rev );
		}
	}

}
