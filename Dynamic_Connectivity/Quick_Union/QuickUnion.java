package Union_Find;

public class QuickUnion {
	
	private int n;
	private int count;  //Count of connected components
	private int[] id;
	
	public QuickUnion(int n) {
		this.n=n;
		this.count=n;
		id = new int[n];
		
		for(int i=0;i<n;i++)
			id[i] = i;	//Initially each element is a tree with one node and pointing at itself. So each element is a root of itself.
		
	}
	
	private int root(int i)
	{
		while(i != id[i])	//chase parent pointer until reach root node
			i=id[i];
		
		return i;
	}
	
	public boolean isConnected(int p,int q) 
	{
		return root(p) == root(q);   //Two elements are connected iff they have the same root
	}
	
	public void union(int p,int q)
	{
		if(isConnected(p, q))
			return;
		
		int i=root(p);
		int j=root(q);
		
		//set the id of p's root to q's root
		id[i] = j;
		
		count--;  //Connected component count is reduced.
	}

	//Returns no. of connected components
	public int getComponentCount() {
		return count;
	}
	
	

}
