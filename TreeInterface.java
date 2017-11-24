
public interface TreeInterface
{
	public void init(int[] init);

	public void clear();

	public void add(int val);

	public int size();

	public int leaves();

	public int nodes();

	public int height();

	public int width();

	public void reverse();

	public void del(int val);

	@Override
	public String toString();

	public int[] toArray();
}
