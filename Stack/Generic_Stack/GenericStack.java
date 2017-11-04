package stack_adt;

public class GenericStack<T> 
{
	private int size;
	private int top;
	private T[] a;
	
	public GenericStack(int size) {
		this.size=size;
		top=-1;
		a=(T[]) new Object[size];
	}
	
	public void push(T item)
	{
		if(top!=size-1)
		{
			a[++top]=item;
		}
		else
			System.out.println("Stack Overflow...can't push any more element");
	}
	
	public T pop()
	{
		T item=null;
		
		if(top!=-1)		
			item=a[top--];
		
		return item;
		
	}
	
	public T peek()
	{
		if(top!=-1)
			return a[top];
		else
			return null;
	}
	
	public void display()
	{
		if(top!=-1)
		{
			for(int i=top;i>=0;i--)
				System.out.print(a[i]+"\t");
		}
		else
			System.out.println("Stack empty..Nothing to display");
	}

}
