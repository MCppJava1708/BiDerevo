import static org.junit.Assert.*;

import org.junit.Test;

public class TreeTests
{
	TreeInterface tree;

	public TreeTests()
	{
		tree = new BSTree();
	}
	 
	// ========================================
		// Base init, size, toArray, clear
		// ========================================

		@Test
		public void testBaseMeny()
		{
			int init[] =
			{ 53, 30, 14, 39, 9, 23, 34, 47, 72, 61, 84, 79 };
			tree.init(init);
			assertEquals(12, tree.size());
			int actual[] = tree.toArray();
			int expected[] =
			{ 9, 14, 23, 30, 34, 39, 47, 53, 61, 72, 79, 84 };
			assertArrayEquals(expected, actual);
			tree.clear();
			assertEquals(0, tree.size());
			actual = tree.toArray();
			expected = new int[0];
			assertArrayEquals(expected, actual);
		}

		@Test
		public void testBaseTwo()
		{
			int init[] =
			{ 53, 30 };
			tree.init(init);
			assertEquals(2, tree.size());
			int expected[] =
			{ 30, 53 };
			int actual[] = tree.toArray();
			assertArrayEquals(expected, actual);
			tree.clear();
			assertEquals(0, tree.size());
			actual = tree.toArray();
			expected = new int[0];
			assertArrayEquals(expected, actual);
		}

		@Test
		public void testBaseOne()
		{
			int init[] =
			{ 53 };
			tree.init(init);
			assertEquals(1, tree.size());
			int expected[] =
			{ 53 };
			int actual[] = tree.toArray();
			assertArrayEquals(expected, actual);
			tree.clear();
			assertEquals(0, tree.size());
			actual = tree.toArray();
			expected = new int[0];
			assertArrayEquals(expected, actual);
		}

		@Test
		public void testBaseZero()
		{
			int init[] =
			{};
			tree.init(init);
			assertEquals(0, tree.size());
			int expected[] =
			{};
			int actual[] = tree.toArray();
			assertArrayEquals(expected, actual);
			tree.clear();
			assertEquals(0, tree.size());
			actual = tree.toArray();
			expected = new int[0];
			assertArrayEquals(expected, actual);
		}

		@Test
		public void testBaseNull()
		{
			int init[] = null;
			tree.init(init);
			assertEquals(0, tree.size());
			int expected[] =
			{};
			int actual[] = tree.toArray();
			assertArrayEquals(expected, actual);
			tree.clear();
			assertEquals(0, tree.size());
			actual = tree.toArray();
			expected = new int[0];
			assertArrayEquals(expected, actual);
		}

		// ========================================
		// Leavs
		// ========================================

		@Test
		public void testLeavesMeny()
		{
			int init[] =
			{ 53, 30, 14, 39, 9, 23, 34, 47, 72, 61, 84, 79 };
			tree.init(init);
			int actual = tree.leaves();
			int expected = 6;
			assertEquals(expected, actual);
		}

		@Test
		public void testLeavesMeny1()
		{
			int init[] =
			{ 53, 30, 14, 39, 9, 23, 34, 47, 72, 61, 84, 79, 85 };
			tree.init(init);
			int actual = tree.leaves();
			int expected = 7;
			assertEquals(expected, actual);
		}

		@Test
		public void testLeavesMeny2()
		{
			int init[] =
			{ 53, 30, 14, 39, 9, 23, 34, 47, 72, 61, 57, 64, 84, 79, 85 };
			tree.init(init);
			int actual = tree.leaves();
			int expected = 8;
			assertEquals(expected, actual);
		}

		@Test
		public void testLeavesMeny3()
		{
			int init[] =
			{ 53, 30, 14, 39, 9, 23, 34, 47, 72, 61, 57, 64, 84, 79, 85, 32, 36 };
			tree.init(init);
			int actual = tree.leaves();
			int expected = 9;
			assertEquals(expected, actual);
		}

		@Test
		public void testLeavesTwo()
		{
			int init[] =
			{ 53, 30, 72 };
			tree.init(init);
			int actual = tree.leaves();
			int expected = 2;
			assertEquals(expected, actual);
		}

		@Test
		public void testLeavesOne()
		{
			int init[] =
			{ 53, 30 };
			tree.init(init);
			int actual = tree.leaves();
			int expected = 1;
			assertEquals(expected, actual);
		}

		@Test
		public void testLeavesZero()
		{
			int init[] =
			{};
			tree.init(init);
			int actual = tree.leaves();
			int expected = 0;
			assertEquals(expected, actual);
		}

		// ========================================
		// Height
		// ========================================

		@Test
		public void testHeightMeny()
		{
			int init[] =
			{ 53, 30, 14, 39, 9, 23, 34, 47, 72, 61, 84, 79 };
			tree.init(init);
			int actual = tree.height();
			int expected = 4;
			assertEquals(expected, actual);
		}

		@Test
		public void testHeightTwo()
		{
			int init[] =
			{ 53, 30, 72 };
			tree.init(init);
			int actual = tree.height();
			int expected = 2;
			assertEquals(expected, actual);
		}

		@Test
		public void testHeightOne()
		{
			int init[] = { 53 };
			tree.init(init);
			int actual = tree.height();
			int expected = 1;
			assertEquals(expected, actual);
		}

		@Test
		public void testHeightZero()
		{
			int init[] =
			{};
			tree.init(init);
			int actual = tree.height();
			int expected = 0;
			assertEquals(expected, actual);
		}

	//===============================================================================================================
	//===============================================Reverse=========================================================
	//===============================================================================================================
	
	@Test
	public void testReverse_0() 
	{
		int[] ar = null;
		tree.init(ar);
		assertEquals(0, tree.size());
		tree.reverse();
		int[] exp = {};
		int [] act = tree.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testReverse_1() 
	{
		int[] ar = {};
		tree.init(ar);
		assertEquals(0, tree.size());
		tree.reverse();
		int[] exp = {};
		int [] act = tree.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testReverse_2() 
	{
		int[] ar = {10};
		tree.init(ar);
		assertEquals(1, tree.size());
		tree.reverse();
		int[] exp = {10};
		int [] act = tree.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testReverse_3() 
	{
		int[] ar = {10,20};
		tree.init(ar);
		assertEquals(2, tree.size());
		tree.reverse();
		int[] exp = {20, 10};
		int [] act = tree.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testReverse_4() 
	{
		int[] ar = {10,20,30};
		tree.init(ar);
		assertEquals(3, tree.size());
		tree.reverse();
		int[] exp = {30, 20, 10};
		int [] act = tree.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testReverse_5() 
	{
		int[] ar = {10,20,77,11,34,99,56};
		tree.init(ar);
		assertEquals(7, tree.size());
		tree.reverse();
		int [] exp = {99,77,56,34,20,11,10};
		int [] act = tree.toArray();
		System.out.println();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testReverse_6() 
	{
		int[] ar = {10,20,77,11,34,99,56,5};
		tree.init(ar);
		assertEquals(8, tree.size());
		tree.reverse();
		int [] exp = {99,77,56,34,20,11,10,5};
		int [] act = tree.toArray();
		System.out.println();
		assertArrayEquals(exp, act);
	}
	//===============================================================================================================
	//===============================================ToString========================================================
	//===============================================================================================================	 
	@Test
	public void testToString_1() 
	{
		int[] ar = null;
		tree.init(ar);
		assertEquals(0, tree.size());
		String exp = "";
		String act = tree.toString();
		assertEquals(exp, act);					
	}

	@Test
	public void testToString_2() 
	{
		int[] ar = {};
		tree.init(ar);
		assertEquals(0, tree.size());
		String exp = "";
		String act = tree.toString();
		assertEquals(exp, act);
	}

	@Test
	public void testToString_3() 
	{
		int[] ar = {10};
		tree.init(ar);
		assertEquals(1, tree.size());
		String exp = "10";
		String act = tree.toString();
		assertEquals(exp, act);
	}

	@Test
	public void testToString_4() 
	{
		int[] ar = {10,20};
		tree.init(ar);
		assertEquals(2, tree.size());
		String exp = "10,20";
		String act = tree.toString();
		assertEquals(exp, act);
	}
	@Test
	public void testToString_5() 
	{
		int[] ar = {10,20,77,11,34,99,56};
		tree.init(ar);
		assertEquals(7, tree.size());
		String exp = "10,11,20,34,56,77,99";
		String act = tree.toString();
		assertEquals(exp, act);
	}
	@Test
	public void testToString_6() 
	{
		int[] ar = {10,20,77,11,34,99,56,101};
		tree.init(ar);
		assertEquals(8, tree.size());
		String exp = "10,11,20,34,56,77,99,101";
		String act = tree.toString();
		assertEquals(exp, act);
	}
}
