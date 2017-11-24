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
	public  void testLeavesMeny1()
	{
		int init[] =
			{ 53, 30, 14, 39, 9, 23, 34, 47, 72, 61, 84, 79, 85 };
		tree.init(init);
		int actual = tree.leaves();
		int expected = 7;
		assertEquals(expected, actual);
	}

	@Test
	public  void testLeavesMeny2()
	{
		int init[] =
			{ 53, 30, 14, 39, 9, 23, 34, 47, 72, 61, 57, 64, 84, 79, 85 };
		tree.init(init);
		int actual = tree.leaves();
		int expected = 8;
		assertEquals(expected, actual);
	}

	@Test
	public  void testLeavesMeny3()
	{
		int init[] =
			{ 53, 30, 14, 39, 9, 23, 34, 47, 72, 61, 57, 64, 84, 79, 85, 32, 36 };
		tree.init(init);
		int actual = tree.leaves();
		int expected = 9;
		assertEquals(expected, actual);
	}

	@Test
	public  void testLeavesTwo()
	{
		int init[] =
			{ 53, 30, 72 };
		tree.init(init);
		int actual = tree.leaves();
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public  void testLeavesOne()
	{
		int init[] =
			{ 53, 30 };
		tree.init(init);
		int actual = tree.leaves();
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public  void testLeavesZero()
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
	public  void testHeightMeny()
	{
		int init[] =
			{ 53, 30, 14, 39, 9, 23, 34, 47, 72, 61, 84, 79 };
		tree.init(init);
		int actual = tree.height();
		int expected = 4;
		assertEquals(expected, actual);
	}

	@Test
	public  void testHeightTwo()
	{
		int init[] =
			{ 53, 30, 72 };
		tree.init(init);
		int actual = tree.height();
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public  void testHeightOne()
	{
		int init[] = { 53 };
		tree.init(init);
		int actual = tree.height();
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public  void testHeightZero()
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
	public  void testReverse_0() 
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
	public  void testReverse_1() 
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
	public  void testReverse_2() 
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
	public  void testReverse_3() 
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
	public  void testReverse_4() 
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
	public  void testReverse_5() 
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
	public  void testReverse_6() 
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

	////////////////////////
	///del//////////////////
	///////////////////////

	@Test (expected = IllegalArgumentException.class)
	public void test_Del0() 
	{
		tree.del(100);
	}

	@Test
	public void test_Del1_1() 
	{
		tree.add(100);
		tree.del(100);
		int[] act = tree.toArray();
		int[] exp = new int[0];
		assertArrayEquals(exp, act);
	}

	@Test (expected = IllegalArgumentException.class)
	public void test_Del1_2() 
	{
		tree.add(100);
		tree.del(110);
	}
	@Test
	public void test_Del2_1_1() 
	{
		int[] arr = new int [] {100, 150};
		tree.init(arr);
		tree.del(100);
		int[] exp = new int [] {150};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del2_1_2() 
	{
		int[] arr = new int [] {100, 150};
		tree.init(arr);
		tree.del(150);
		int[] exp = new int [] {100};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del2_2_1() 
	{
		int[] arr = new int [] {100, 50};
		tree.init(arr);
		tree.del(100);
		int[] exp = new int [] {50};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del2_2_2() 
	{
		int[] arr = new int [] {100, 50};
		tree.init(arr);
		tree.del(50);
		int[] exp = new int [] {100};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del2_3_1() 
	{
		int[] arr = new int [] {100, 50, 150};
		tree.init(arr);
		tree.del(50);
		int[] exp = new int [] {100, 150};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del2_3_2() 
	{
		int[] arr = new int [] {100, 50, 150};
		tree.init(arr);
		tree.del(100);
		int[] exp = new int [] {50, 150};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del2_3_3() 
	{
		int[] arr = new int [] {100, 50, 150};
		tree.init(arr);
		tree.del(150);
		int[] exp = new int [] {50, 100};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test (expected = IllegalArgumentException.class)
	public void test_Del2_4() 
	{
		int[] arr = new int [] {100, 50, 150};
		tree.init(arr);
		tree.del(160);
	}

	@Test
	public void test_Del3_1_1() 
	{
		int[] arr = new int [] {100, 50, 25};
		tree.init(arr);
		tree.del(100);
		int[] exp = new int [] {25, 50};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del3_1_2() 
	{
		int[] arr = new int [] {100, 50, 25};
		tree.init(arr);
		tree.del(50);
		int[] exp = new int [] {25, 100};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del3_1_3() 
	{
		int[] arr = new int [] {100, 50, 25};
		tree.init(arr);
		tree.del(25);
		int[] exp = new int [] {50, 100};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del3_2_1() 
	{
		int[] arr = new int [] {100, 150, 175};
		tree.init(arr);
		tree.del(100);
		int[] exp = new int [] {150, 175};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del3_2_2() 
	{
		int[] arr = new int [] {100, 150, 175};
		tree.init(arr);
		tree.del(150);
		int[] exp = new int [] {100, 175};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del3_2_3() 
	{
		int[] arr = new int [] {100, 150, 175};
		tree.init(arr);
		tree.del(175);
		int[] exp = new int [] {100, 150};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del3_3_1() 
	{
		int[] arr = new int [] {100, 50, 150, 175};
		tree.init(arr);
		tree.del(50);
		int[] exp = new int [] {100, 150, 175};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del3_3_2() 
	{
		int[] arr = new int [] {100, 50, 150, 175};
		tree.init(arr);
		tree.del(100);
		int[] exp = new int [] {50, 150, 175};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del3_3_3() 
	{
		int[] arr = new int [] {100, 50, 150, 175};
		tree.init(arr);
		tree.del(150);
		int[] exp = new int [] {50, 100, 175};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del3_4_1() 
	{
		int[] arr = new int [] {100, 50, 150, 125, 175};
		tree.init(arr);
		tree.del(50);
		int[] exp = new int [] {100, 125, 150, 175};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del3_4_2() 
	{
		int[] arr = new int [] {100, 50, 150, 125, 175};
		tree.init(arr);
		tree.del(100);
		int[] exp = new int [] {50, 125, 150, 175};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del3_4_3() 
	{
		int[] arr = new int [] {100, 50, 150, 125, 175};
		tree.init(arr);
		tree.del(150);
		int[] exp = new int [] {50, 100, 125, 175};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del3_5_1() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 75};
		tree.init(arr);
		tree.del(50);
		int[] exp = new int [] {25, 75, 100, 150};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del3_5_2() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 75};
		tree.init(arr);
		tree.del(100);
		int[] exp = new int [] {25, 50, 75, 150};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del3_5_3() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 75};
		tree.init(arr);
		tree.del(150);
		int[] exp = new int [] {25, 50, 75, 100};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del3_6_1() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 75, 125, 175};
		tree.init(arr);
		tree.del(50);
		int[] exp = new int [] {25, 75, 100, 125, 150, 175};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del3_6_2() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 75, 125, 175};
		tree.init(arr);
		tree.del(100);
		int[] exp = new int [] {25, 50, 75, 125, 150, 175};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_Del3_6_3() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 75, 125, 175};
		tree.init(arr);
		tree.del(150);
		int[] exp = new int [] {25, 50, 75, 100, 125, 175};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test (expected = IllegalArgumentException.class)
	public void test_Del3_7_0() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 75, 125, 175};
		tree.init(arr);
		tree.del(160);
	}

	@Test
	public void test_DelMany_1_1() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 125, 12, 38, 112, 138, 6, 18, 
				32, 44, 106, 118, 132, 144};
		tree.init(arr);
		tree.del(50);
		int[] exp = new int [] {6, 12, 18, 25, 32, 38, 44, 100, 106, 112, 
				118, 125, 132, 138, 144, 150};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_DelMany_1_2() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 125, 12, 38, 112, 138, 6, 18, 
				32, 44, 106, 118, 132, 144};
		tree.init(arr);
		tree.del(150);
		int[] exp = new int [] {6, 12, 18, 25, 32, 38, 44, 50, 100, 106, 112, 
				118, 125, 132, 138, 144};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}	

	@Test
	public void test_DelMany_2_1() 
	{
		int[] arr = new int [] {100, 50, 150, 75, 175, 63, 88, 163, 188, 56, 69,
				82, 94, 156, 169, 182, 194};
		tree.init(arr);
		tree.del(50);
		int[] exp = new int [] {56, 63, 69, 75, 82, 88, 94, 100, 150, 156,
				163, 169, 175, 182, 188, 194};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_DelMany_2_2() 
	{
		int[] arr = new int [] {100, 50, 150, 75, 175, 63, 88, 163, 188, 56, 69,
				82, 94, 156, 169, 182, 194};
		tree.init(arr);
		tree.del(150);
		int[] exp = new int [] {50, 56, 63, 69, 75, 82, 88, 94, 100, 156,
				163, 169, 175, 182, 188, 194};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_DelMany_3_1() 
	{
		int[] arr = new int [] {100, 50, 150, 125, 175, 112, 138, 163, 188, 
				106, 132, 169, 194};
		tree.init(arr);
		tree.del(125);
		int[] exp = new int [] {50, 100, 106, 112, 132, 138, 150, 163, 
				169, 175, 188, 194};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_DelMany_3_2() 
	{
		int[] arr = new int [] {100, 50, 150, 125, 175, 112, 138, 163, 188, 
				106, 132, 169, 194};
		tree.init(arr);
		tree.del(175);
		int[] exp = new int [] {50, 100, 106, 112, 125, 132, 138, 150, 163, 
				169, 188, 194};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_DelMany_4_1() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 75, 125, 175, 12, 38, 63, 88, 
				112, 138, 163, 188, 6, 18, 44, 69, 82, 94, 118, 132, 156, 194};
		tree.init(arr);
		tree.del(25);
		int[] exp = new int [] {6, 12, 18, 38, 44, 50, 63, 69, 75, 82, 88, 
				94, 100, 112, 118, 125, 132, 138, 150, 156, 163, 175, 188, 194};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_DelMany_4_2() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 75, 125, 175, 12, 38, 63, 88, 
				112, 138, 163, 188, 6, 18, 44, 69, 82, 94, 118, 132, 156, 194};
		tree.init(arr);
		tree.del(75);
		int[] exp = new int [] {6, 12, 18, 25, 38, 44, 50, 63, 69, 82, 88, 
				94, 100, 112, 118, 125, 132, 138, 150, 156, 163, 175, 188, 194};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_DelMany_4_3() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 75, 125, 175, 12, 38, 63, 88, 
				112, 138, 163, 188, 6, 18, 44, 69, 82, 94, 118, 132, 156, 194};
		tree.init(arr);
		tree.del(125);
		int[] exp = new int [] {6, 12, 18, 25, 38, 44, 50, 63, 69, 75, 82, 88, 
				94, 100, 112, 118, 132, 138, 150, 156, 163, 175, 188, 194};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_DelMany_4_4() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 75, 125, 175, 12, 38, 63, 88, 
				112, 138, 163, 188, 6, 18, 44, 69, 82, 94, 118, 132, 156, 194};
		tree.init(arr);
		tree.del(175);
		int[] exp = new int [] {6, 12, 18, 25, 38, 44, 50, 63, 69, 75, 82, 88, 
				94, 100, 112, 118, 125, 132, 138, 150, 156, 163, 188, 194};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_DelMany_5_1() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 75, 12, 38, 63, 88, 
				6, 18, 32, 56, 69, 82, 94};
		tree.init(arr);
		tree.del(25);
		int[] exp = new int [] {6, 12, 18, 32, 38, 50, 56, 63, 69, 75, 
				88, 94, 100, 150};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_DelMany_5_2() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 75, 12, 38, 63, 88, 
				6, 18, 32, 56, 69, 82, 94};
		tree.init(arr);
		tree.del(75);
		int[] exp = new int [] {6, 12, 18, 25, 32, 38, 50, 56, 63, 69, 
				88, 94, 100, 150};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_DelMany_5_3() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 75, 12, 38, 63, 88, 
				6, 18, 32, 56, 69, 82, 94};
		tree.init(arr);
		tree.del(6);
		int[] exp = new int [] {12, 18, 25, 32, 38, 50, 56, 63, 69, 75, 
				88, 94, 100, 150};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_DelMany_6_1() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 75, 12, 38, 63, 88, 
				18, 32, 46, 56, 82, 88, 94};
		tree.init(arr);
		tree.del(25);
		int[] exp = new int [] {12, 18, 32, 38, 46, 50, 56, 63, 75, 
				88, 94, 100, 150};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_DelMany_6_2() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 75, 12, 38, 63, 88, 
				18, 32, 46, 56, 82, 88, 94};
		tree.init(arr);
		tree.del(75);
		int[] exp = new int [] {12, 18, 25, 32, 38, 46, 50, 56, 63, 82, 
				88, 94, 100, 150};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_DelMany_7_1() 
	{
		int[] arr = new int [] {100, 50, 150, 125, 175, 112, 138, 163, 188, 106, 118, 
				132, 156, 169, 194};
		tree.init(arr);
		tree.del(125);
		int[] exp = new int [] {100, 50, 150, 175, 112, 138, 163, 188, 106, 118, 
				132, 156, 169, 194};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_DelMany_7_2() 
	{
		int[] arr = new int [] {100, 50, 150, 125, 175, 112, 138, 163, 188, 106, 118, 
				132, 156, 169, 194};
		tree.init(arr);
		tree.del(175);
		int[] exp = new int [] {100, 50, 150, 125, 112, 138, 163, 188, 106, 118, 
				132, 156, 169, 194};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_DelMany_8_1() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 75, 125, 175, 12, 38, 63, 88, 
				112, 138, 163, 188, 6, 18, 32, 44, 56, 69, 82, 94, 106, 118, 
				132, 144, 156, 169, 182, 194};
		tree.init(arr);
		tree.del(100);
		int[] exp = new int [] {6, 12, 18, 25, 32, 38, 44, 50, 56, 63, 69, 75, 
				82, 88, 94, 106, 112, 118, 125, 132, 138, 144, 150, 156,
				163, 169, 175, 182, 188, 194};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_DelMany_8_2() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 75, 125, 175, 12, 38, 63, 88, 
				112, 138, 163, 188, 6, 18, 32, 44, 56, 69, 82, 94, 106, 118, 
				132, 144, 156, 169, 182, 194};
		tree.init(arr);
		tree.del(50);
		int[] exp = new int [] {6, 12, 18, 25, 32, 38, 44, 56, 63, 69, 75, 
				82, 88, 94, 100, 106, 112, 118, 125, 132, 138, 144, 150, 156,
				163, 169, 175, 182, 188, 194};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_DelMany_8_3() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 75, 125, 175, 12, 38, 63, 88, 
				112, 138, 163, 188, 6, 18, 32, 44, 56, 69, 82, 94, 106, 118, 
				132, 144, 156, 169, 182, 194};
		tree.init(arr);
		tree.del(150);
		int[] exp = new int [] {6, 12, 18, 25, 32, 38, 44, 50, 56, 63, 69, 75, 
				82, 88, 94, 100, 106, 112, 118, 125, 132, 138, 144, 156,
				163, 169, 175, 182, 188, 194};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_DelMany_8_4() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 75, 125, 175, 12, 38, 63, 88, 
				112, 138, 163, 188, 6, 18, 32, 44, 56, 69, 82, 94, 106, 118, 
				132, 144, 156, 169, 182, 194};
		tree.init(arr);
		tree.del(25);
		int[] exp = new int [] {6, 12, 18, 32, 38, 44, 50, 56, 63, 69, 75, 
				82, 88, 94, 100, 106, 112, 118, 125, 132, 138, 144, 150, 156,
				163, 169, 175, 182, 188, 194};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_DelMany_8_5() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 75, 125, 175, 12, 38, 63, 88, 
				112, 138, 163, 188, 6, 18, 32, 44, 56, 69, 82, 94, 106, 118, 
				132, 144, 156, 169, 182, 194};
		tree.init(arr);
		tree.del(163);
		int[] exp = new int [] {6, 12, 18, 25, 32, 38, 44, 50, 56, 63, 69, 75, 
				82, 88, 94, 100, 106, 112, 118, 125, 132, 138, 144, 150, 156,
				169, 175, 182, 188, 194};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_DelMany_8_6() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 75, 125, 175, 12, 38, 63, 88, 
				112, 138, 163, 188, 6, 18, 32, 44, 56, 69, 82, 94, 106, 118, 
				132, 144, 156, 169, 182, 194};
		tree.init(arr);
		tree.del(82);
		int[] exp = new int [] {6, 12, 18, 25, 32, 38, 44, 50, 56, 63, 69, 75, 
				88, 94, 100, 106, 112, 118, 125, 132, 138, 144, 150, 156,
				163, 169, 175, 182, 188, 194};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_DelMany_8_7() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 75, 125, 175, 12, 38, 63, 88, 
				112, 138, 163, 188, 6, 18, 32, 44, 56, 69, 82, 94, 106, 118, 
				132, 144, 156, 169, 182, 194};
		tree.init(arr);
		tree.del(132);
		int[] exp = new int [] {6, 12, 18, 25, 32, 38, 44, 50, 56, 63, 69, 75, 
				82, 88, 94, 100, 106, 112, 118, 125, 138, 144, 150, 156,
				163, 169, 175, 182, 188, 194};
		int[] act = tree.toArray();
		assertArrayEquals(exp, act);
	}
	@Test (expected = IllegalArgumentException.class)
	public void test_DelMany9() 
	{
		int[] arr = new int [] {100, 50, 150, 25, 75, 125, 175, 12, 38, 63, 88, 
				112, 138, 163, 188, 6, 18, 32, 44, 56, 69, 82, 94, 106, 118, 
				132, 144, 156, 169, 182, 194};
		tree.init(arr);
		tree.del(101);;
	}

	// ========================================
	// Nodes
	// ========================================

	@Test
	public void testNodesMeny()
	{
		int init[] =
			{ 53, 30, 14, 39, 9, 23, 34, 47, 72, 61, 84, 79 };
		tree.init(init);
		int actual = tree.nodes();
		int expected = 6;
		assertEquals(expected, actual);
	}

	@Test
	public void testNodesMeny1()
	{
		int init[] =
			{ 53, 30, 14, 39, 9, 23, 34, 47, 72, 61, 84, 79, 85 };
		tree.init(init);
		int actual = tree.nodes();
		int expected = 6;
		assertEquals(expected, actual);
	}

	@Test
	public void testNodesMeny2()
	{
		int init[] =
			{ 53, 30, 14, 39, 9, 23, 34, 47, 72, 61, 57, 64, 84, 79, 85 };
		tree.init(init);
		int actual = tree.nodes();
		int expected = 7;
		assertEquals(expected, actual);
	}

	@Test
	public void testNodesMeny3()
	{
		int init[] =
			{ 53, 30, 14, 39, 9, 23, 34, 47, 72, 61, 57, 64, 84, 79, 85, 32, 36 };
		tree.init(init);
		int actual = tree.nodes();
		int expected = 8;
		assertEquals(expected, actual);
	}

	@Test
	public void testNodesTwo()
	{
		int init[] =
			{ 53, 30, 72 };
		tree.init(init);
		int actual = tree.leaves();
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void testNodesOne()
	{
		int init[] =
			{ 53, 30 };
		tree.init(init);
		int actual = tree.nodes();
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void testNodesZero()
	{
		int init[] =
			{};
		tree.init(init);
		int actual = tree.nodes();
		int expected = 0;
		assertEquals(expected, actual);
	}

	// ========================================
	// Width
	// ========================================



	@Test
	public void testWidthMeny4()
	{
		int init[] =
			{ 100, 50, 150, 25, 75, 125, 175 };
		tree.init(init);
		int actual = tree.width();
		int expected = 4;
		assertEquals(expected, actual);
	}

	@Test
	public void testWidthMeny16()
	{
		int init[] =
			{100, 50, 150, 25, 75, 125, 175, 12, 38, 63, 88, 
					112, 138, 163, 188, 6, 18, 32, 44, 56, 69, 82, 94, 106, 118, 
					132, 144, 156, 169, 182, 194};;
					tree.init(init);
					int actual = tree.width();
					int expected = 16;
					assertEquals(expected, actual);
	}


	@Test
	public void testWidthTwo()
	{
		int init[] =
			{ 100, 50, 150 };
		tree.init(init);
		int actual = tree.width();
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void testWidthOne()
	{
		int init[] =
			{ 150, 100 };
		tree.init(init);
		int actual = tree.width();
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void testWidthZero()
	{
		int init[] =
			{};
		tree.init(init);
		int actual = tree.width();
		int expected = 0;
		assertEquals(expected, actual);
	}
}
