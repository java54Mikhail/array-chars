package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.arrays.ArrayChar;

class ArrayCharTest {

	@Test
	void compareToTest() {
		char[] ar1 = {'1', '2', '3'};
		char[] ar2 = {'9'};
		char[] ar3 = {'1', '2', '3'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		assertEquals(8, arrayChar2.compareTo(arrayChar1));
		assertEquals(-8, arrayChar1.compareTo(arrayChar2));
		assertEquals(1, new ArrayChar(new char[] {'a', 'a'})
				.compareTo(new ArrayChar(new char[] {'a'})));
		assertEquals(-1, new ArrayChar(new char[] {'a'})
				.compareTo(new ArrayChar(new char[] {'a', 'a'})));
		assertEquals(0, arrayChar1.compareTo(arrayChar3));
		}
		@Test
		void indexOfTest() {
			char[] ar1 = {'1', '2', '3', '2'};
			ArrayChar arrayChar1 = new ArrayChar(ar1);
			assertEquals(1, arrayChar1.indexOf('2'));
			assertEquals(-1, arrayChar1.indexOf('9'));
		}
		@Test
		void lastIndexOfTest() {
			char[] ar1 = {'1', '2', '3', '2'};
			ArrayChar arrayChar1 = new ArrayChar(ar1);
			assertEquals(3, arrayChar1.lastIndexOf('2'));
			assertEquals(-1, arrayChar1.lastIndexOf('9'));
		}
		@Test
		void countTest() {
			char[] ar1 = {'1', '2', '3', '2'};
			char[] ar2 = {'6', '4', '6', '0', '6','3'};
			ArrayChar arrayChar1 = new ArrayChar(ar1);
			ArrayChar arrayChar2 = new ArrayChar(ar2);
			assertEquals(2, arrayChar1.count('2'));
			assertEquals(3, arrayChar2.count('6'));
			assertEquals(0, arrayChar1.count('m'));
		}
		@Test
		void compareToIgnporeCaseTest() {
			char[] ar1 = {'a', 'b', 'C'};
			char[] ar2 = {'c'};
			char[] ar3 = {'A', 'B', 'c'};
			ArrayChar arrayChar1 = new ArrayChar(ar1);
			ArrayChar arrayChar2 = new ArrayChar(ar2);
			ArrayChar arrayChar3 = new ArrayChar(ar3);
			assertTrue(arrayChar1.compareToIgnporeCase(arrayChar3) == 0);
			assertEquals(0, arrayChar3.compareToIgnporeCase(arrayChar1));
			assertEquals(0, arrayChar1.compareToIgnporeCase(arrayChar3));
			assertEquals(2, arrayChar2.compareToIgnporeCase(arrayChar3));
			assertEquals(2, arrayChar2.compareToIgnporeCase(arrayChar1));
		}
		@Test
		void containsTest() {
			char[] ar1 = {'1', '2', '3', '2'};
			ArrayChar arrayChar1 = new ArrayChar(ar1);
			assertTrue(arrayChar1.contains('3'));
			assertFalse(arrayChar1.contains('0'));
			assertFalse(arrayChar1.contains('-'));
		}
		@Test
		void equalsTest() {
			//TODO 
		}
		@Test
		void equalsIgnoreCaseTest() {
			//TODO
		}
}
