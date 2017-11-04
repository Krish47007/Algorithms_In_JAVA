package stack_adt;

public class Stack {
	
	private int top=-1;
	private int size;
	private int[] a;
	
	public Stack(int size) {
		super();
		this.size = size;
		
		a=new int[size];
	}
	
	public void push(int item)
	{
		if(top!=size-1)
		{
			a[++top]=item;
		}
		else
			System.out.println("Stack Overflow...can't push any more element");
	}
	
	public Integer pop()
	{
		if(top != -1)
			return a[top--];
		else
			return null;
	}
	
	public Integer peek()
	{
		if(top != -1)
			return a[top];
		else
			return null;
	}
	
	public void display()
	{
		if(top !=-1)
		{
			for(int i=top;i>=0;i--)
				System.out.print(a[i]+"\t");
		}
		else
			System.out.println("Stack empty..Nothing to display");
	}
	

}
