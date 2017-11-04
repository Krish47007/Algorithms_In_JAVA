package stack_adt;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GenericStackMain {

	public static void main(String[] args) {
		
		GenericStack<Integer> stack=new GenericStack<>(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
		stack.display();
		
		System.out.println(stack.peek());
		
		System.out.println("Deleted: "+stack.pop());
		System.out.println("Deleted: "+stack.pop());
		System.out.println("Deleted: "+stack.pop());
		
		System.out.println("Deleted: "+stack.pop());
		System.out.println("Deleted: "+stack.pop());
		System.out.println("Deleted: "+stack.pop());
		
		System.out.println(stack.peek());
		
		stack.display();
		
		System.out.println("************************************");
		
		GenericStack<Double> stack2=new GenericStack<>(5);
		stack2.push(10.0);
		stack2.push(20.0);
		stack2.push(30.0);
		stack2.push(40.0);
		stack2.push(50.0);
		stack2.push(60.0);
		
		stack2.display();
		
		System.out.println(stack2.peek());
		
		System.out.println("Deleted: "+stack2.pop());
		System.out.println("Deleted: "+stack2.pop());
		System.out.println("Deleted: "+stack2.pop());
		System.out.println("Deleted: "+stack2.pop());
		System.out.println("Deleted: "+stack2.pop());
		System.out.println("Deleted: "+stack2.pop());
		
		System.out.println(stack2.peek());
		
		stack2.display();
		

	}

}
