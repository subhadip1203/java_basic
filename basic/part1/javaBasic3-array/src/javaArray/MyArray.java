package javaArray;

import java.util.Arrays;

public class MyArray {

	public static void main(String[] args) {
		
//		basic array initialization without value
		int[] numbers = new int [10];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[3] = 3;
		
//		array both declaration and value initialization
		int[] myNumbers = {10,40,30,20,50,5};
		
		
//		print an array directly , will print only the memory address
//		to print an array , have to import Array from  java.utills
		System.out.println(numbers);
		System.out.println(Arrays.toString(numbers));
		
		System.out.println(myNumbers);
		System.out.println(Arrays.toString(myNumbers));
		
		
//		 array length
		System.out.println(numbers.length);
		System.out.println(myNumbers.length);
		
		
//		sort an array
//		the sort function change the array itself
		Arrays.sort(myNumbers);
		System.out.println(Arrays.toString(myNumbers));
		
		
		
//		Multidimensional Arrays
//		to print use deepToString method from Arrays class
		int[][] multiArr = new int [2][3];
		int[][] multiArr2 = { {1,2,3}, {4,5,6} } ;

		multiArr[0][0] = 1;
		multiArr[0][1] = 2;
		multiArr[1][1] = 3;
		System.out.println(Arrays.deepToString(multiArr));
		System.out.println(Arrays.deepToString(multiArr2));
		
				
		
		
		
	}

}
