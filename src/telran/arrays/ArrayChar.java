package telran.arrays;

import java.util.Iterator;

public class ArrayChar {
	   private char[] array;
	   public ArrayChar(char[] array) {
		  this.array = array;
	   }
	   public int compareTo(ArrayChar another) {
		  int lenght = Math.min(this.array.length, another.array.length);
		  int index = 0;
		  while(index < lenght && this.array[index] == another.array[index]) {
			  index++;
		  }
		   return index == lenght ? this.array.length - another.array.length : 
			   this.array[index] - another.array[index];
	   }
	   public int indexOf(char character) {
		int index = 0;
		while(index < array.length && array[index] != character) {
			index++;
		}
		   return index == array.length ? -1 : index;
	}
	   public int lastIndexOf(char character) {
		   int index = array.length-1;
			while(index > -1 && array[index] != character) {
				index--;
			}
		   return index;
	   }
	public int count(char character) {
		int index = 0;
		int count = 0;
		while (index < array.length) {
			if (array[index] == character) {
				count++;
		}index++;
		}
		return count;
	}
	public int compareToIgnporeCase(ArrayChar another) {
		  int lenght = Math.min(this.array.length, another.array.length);
		  int index = 0;
		  while(index < lenght && Character.toLowerCase(array[index]) == Character.toLowerCase(another.array[index])) {
			  index++;
		  }
		   return index == lenght ? array.length - another.array.length : 
			   Character.toLowerCase(array[index]) - Character.toLowerCase(another.array[index]);
	}
	public boolean contains(char character) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] == character) {
				return true;
			}
		}
		return false;
	}
	public boolean equals(ArrayChar another) {
		//TODO /each value chars of array?
		return false;
	}
	public boolean equalsIgnoreCase(ArrayChar another) {
		//TODO /depends from method equals.
		return false;
	}
	}

