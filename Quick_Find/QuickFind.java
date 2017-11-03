package Union_Find;

public class QuickFind {
	
	private int n;
	private int count; //Count of connected components
	private int[] id;
	
	public QuickFind(int n) {
		
		this.n = n;
		this.count = n;
		
		id=new int[n];
		
		for(int i=0;i<n;i++) //Initially each object has unique component
			id[i]=i;
	}
	
	//component identifier for p (0 to N-1)
	public int find(int p)
	{
		return id[p];
	}
	
	//return true if p and q are in the same component
	public boolean isConnected(int p,int q)
	{
		return find(p) == find(q); //Two objects are connected if they have the same id,i.e, they belong to same component.
	}
	
	public int getComponentCount() {
		return count;
	}
	
	//Putting p and q in the same component
	public void union(int p,int q)
	{
		if(isConnected(p, q))
			return;
		else
		{
			int pId=find(p);
			int qId=find(q);
			
			for(int i=0;i<id.length;i++)
			{
				if(id[i]==pId) //changing all the entries with values equal to id[p] to the value id[q].
					id[i]=qId;
			}
			
			count--; //reducing the no. of components by 1;
		}
	}

}
