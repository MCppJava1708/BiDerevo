
public class BSTree
{
	class Node
	{
		int val;
		Node left = null;
		Node right = null;
		public Node(int val)
		{
			this.val = val;
		}
	}
	private class Counter
	{
		int index = 0;
	}
	
	Node root = null;

	public void init(int[] ini)
	{

	}
	public void clear()
	{

	}
	public void add(int val)
	{
		if(root == null)
		{
			root = new Node (val);
		}
		else
		{
			addNode (val, root);	
		}
	}
	private void addNode (int val, Node p)
	{
		if(val < p.val)
		{
			if(p.left == null)
			{
				p.left = new Node (val);
			}else
			{
				addNode(val, p.left);
			}

		}else
		{
			if(p.right == null)
			{
				p.right = new Node (val);
			}else
			{
				addNode(val, p.right);
			}
		}
	}
	public int size()
	{
		return sizeNode (root);
	}
	private int sizeNode (Node p)
	{
		if(p == null)
		{
			return 0;
		}
		int ret = 0;
		ret += sizeNode(p.left); 
		ret++;
		ret += sizeNode(p.right);
		return ret;
	}	
	public int leaves()
	{
		return 0;
	}
	public int nodes()
	{
		return 0;
	}
	public int height()
	{
		return 0;
	}
	public int width()
	{
		return 0;
	}
	public void reverse()
	{
	}
	public void del(int val)
	{
	}
	public String toString()
	{
		return null;
	}
	public int[] toArray()
	{
		int n = size();
		int [] arr = new int [n];
		if(n > 0)
		{
//			toArrayNode (new Counter(), arr , root);
		}
		return arr;
	}
	private void toArrayNode (int index, int [] arr, Node p)
	{
		if(p == null)
		{
			return;
		}
//		toArrNode(i, arr, p.left);
	}
	
}
