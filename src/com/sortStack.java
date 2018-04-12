import java.util.Stack;

public class sortStack {
	
	public static Stack<Integer> sortStack(Stack<Integer> input){
		
		Stack<Integer> temp= new Stack<>();
		
		while(!input.isEmpty()) {
			int data=input.pop();
			
			while(!temp.isEmpty() &&temp.peek()>data ) {
				
				input.push(temp.pop());
			}
			
			temp.push(data);
			
			
		}
		
		return temp;
		
		
	}
	
	public static void main(String... strings ) {
		
		Stack<Integer> stack= new Stack<>();
		
		stack.add(15);
		stack.add(12);
		stack.add(11);
		stack.add(10);
		stack.add(20);
		
		System.out.println(sortStack(stack));
		
	}

}
