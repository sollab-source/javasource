package ch02.string;

import java.util.Arrays;

public class SplitEx1 {

	public static void main(String[] args) {
		String str1 = "자바 파이썬 웹";
		String[] arr1 = str1.split(" ");
		System.out.println(Arrays.toString(arr1));
		
		String str2 = "자바,파이썬,웹";
		String[] arr2 = str2.split(",");
		System.out.println(Arrays.toString(arr2));
	}

}
