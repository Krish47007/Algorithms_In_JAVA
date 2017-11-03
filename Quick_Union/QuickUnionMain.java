package Union_Find;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QuickUnionMain {

	public static void main(String[] args) {
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter no. of objects: ");
			int size=Integer.parseInt(br.readLine());
			QuickUnion quickUnion=new QuickUnion(size);
			
			while(true)
			{
				System.out.println("\n1.Find\n2.Union\n3.No. of connected components\n4.Exit");
				System.out.println("Enter Choice: ");
				int ch=Integer.parseInt(br.readLine());
				
				
				int p,q;
				
				switch (ch) {
					case 1: System.out.println("Enter two components : ");
							p=Integer.parseInt(br.readLine());
							q=Integer.parseInt(br.readLine());
							System.out.println("Are "+p+" & "+q+" connected? "+quickUnion.isConnected(p, q));					
							break;
							
					case 2: System.out.println("Enter two components : ");
							p=Integer.parseInt(br.readLine());
							q=Integer.parseInt(br.readLine());
							quickUnion.union(p, q);					
							break;
							
					case 3: System.out.println("No. of connected components "+quickUnion.getComponentCount());
							break;
					case 4: System.exit(0);
							break;
							
					default:System.out.println("Invalid choice");
							break;
				}
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
