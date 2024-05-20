package collectionFrameWork_Stack;
import java.util.*;
public class SortingStack {

	public static void main(String[] args) {
//  Sort a Stack: Write a Java program to sort the elements of a 
//		stack in ascending order using a temporary stack.
		
		Stack<Integer> stack = new Stack<>();
		Random random = new Random();

		for(int i=0;i<10;i++) {
			stack.push(random.nextInt(20)+1);
		}
		System.out.println(stack);
		
		for(int i=0;i<10;i++) {
			int element = stack.pop();
			for(int j=i;j<10;j++) {
				if(stack.peek()< element) {
					System.out.println(stack.peek());
				}
			}
		}
	}

}
