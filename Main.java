
public class Main
{
	public static void main(String[] args)
	{
		BSTree t = new BSTree();
		t.add(5);
		t.add(6);
		t.add(4);
		System.out.println(t.root.val);
		System.out.println(t.root.left.val);
		System.out.println(t.root.right.val);
		System.out.println(t.size());
		System.out.println(t.toArray());
	}
}
