
interface TreeInterface
{
	void init(int[] init);
	
	void clear();
	
	void add(int val);
	
	int size();
	
	int leaves();
	
	int nodes();
	
	int height();
	
	int width();
	
	void reverse();
	
	void del(int val);

	String toString();
	
	int[] toArray();
}
