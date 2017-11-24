import java.util.Arrays;

public class BSTree implements TreeInterface
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

	@Override
	public void init(int[] init)
	{
		if (init == null)
		{
			init = new int[0];
		}
		clear();
		for (int i = 0; i < init.length; i++)
		{
			add(init[i]);
		}
	}

	@Override
	public void clear()
	{
		root = null;
	}

	@Override
	public void add(int val)
	{
		if (root == null)
		{
			root = new Node(val);
		} else
		{
			addNode(val, root);
		}
	}

	private void addNode(int val, Node p)
	{
		if (val < p.val)
		{
			if (p.left == null)
			{
				p.left = new Node(val);
			} else
			{
				addNode(val, p.left);
			}

		} else
		{
			if (p.right == null)
			{
				p.right = new Node(val);
			} else
			{
				addNode(val, p.right);
			}
		}
	}

	@Override
	public int size()
	{
		return sizeNode(root);
	}

	private int sizeNode(Node p)
	{
		if (p == null)
		{
			return 0;
		}
		int ret = 0;
		ret += sizeNode(p.left);
		ret++;
		ret += sizeNode(p.right);
		return ret;
	}

	@Override
	public int leaves()
	{
		return leavesNode(root);
	}

	private int leavesNode(Node p)
	{
		if (p == null)
			return 0;
		int ret = 0;
		if (p.left == null && p.right == null)
		{
			ret += 1;
		}
		ret += leavesNode(p.left);
		ret += leavesNode(p.right);
		return ret;
	}

	@Override
	public int nodes()
	{
		return 0;
	}

	@Override
	public int height()
	{
		return heightNode(root);
	}

	private int heightNode(Node p)
	{
		if (p == null)
		{
			return 0;
		}
		int retLeft = 0;
		int retRight = 0;
		if (p.left != null)
		{
			retLeft = heightNode(p.left);
		} else
		{
			retLeft = 0;
		}
		if (p.right != null)
		{
			retRight = heightNode(p.right);
		} else
		{
			retRight = 0;
		}
		if (retLeft > retRight)
		{
			return retLeft + 1;
		} else
		{
			return retRight + 1;
		}
	}

	@Override
	public int width()
	{
		return 0;
	}

	@Override
	public void reverse()
	{
	}

	@Override
	public void del(int val)
	{
	}

	@Override
	public int[] toArray()
	{
		int array[] = new int[size()];
		Counter cou = new Counter();
		toArrayNode(array, cou, root);
		return array;
	}

	private void toArrayNode(int array[], Counter index, Node p)
	{
		if (p == null)
		{
			return;
		}
		toArrayNode(array, index, p.left);
		array[index.index++] = p.val;
		toArrayNode(array, index, p.right);
	}

	public static void main(String args[])
	{
		int init[] =
		{ 53, 30, 14, 39, 9, 23, 34, 47, 72, 61, 84, 79 };
		BSTree tree = new BSTree();
		tree.init(init);
		System.out.println(Arrays.toString(tree.toArray()));
	}
}
