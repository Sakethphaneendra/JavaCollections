package collectionFrameWork_Stack;
import java.util.Stack;

public class MinElement {

	public static void main(String[] args) {
		Stack<Double> stack =new Stack<>();
//Find the Minimum Element in a Stack: Design a Java class to support push, pop, and retrieving
//the minimum element in constant time using a single stack.
		
		for(int i=0;i<10;i++) {
			stack.push(i+ Math.floor(Math.random()*10));
		}
		System.out.println(stack);
		
		Double Min = Double.MAX_VALUE;
		while(!stack.isEmpty()) {
			Double Element = stack.pop();
			if(Element < Min) {
				Min = Element;
			}
		}
		System.out.println("The Minimum Element in Stack is "+ Min);
	}

}
