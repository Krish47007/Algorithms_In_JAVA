package stack_adt;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StackMain {

	public static void main(String[] args) {
				
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter size of stack: ");
			int size=Integer.parseInt(br.readLine());
			
			Stack stack=new Stack(size);
			
			Integer item;
			
			while(true)
			{
				System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Display\n5.Exit");
				int ch=Integer.parseInt(br.readLine());
				
				switch(ch)
				{
					case 1: System.out.println("Enter element\n");
					        item=Integer.parseInt(br.readLine());
					        stack.push(item);
					        break;
					case 2: item=stack.pop();
							if(item!=null)
								System.out.println("Deleted Element: "+item);
							else 
								System.out.println("Stack Undeflow...Nothing to pop");
							break;
					case 3: item=stack.peek();
							if(item!=null)
								System.out.println("At the top: "+item);
							else 
								System.out.println("Stack Empty");
							break;
					case 4: stack.display();
							break;
					
					case 5: System.exit(0);
							break;
					default : System.out.println("Invalid choice");
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
