package ch10.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ByteToStringEx1 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//byte : 1byte, char : 2byte  String : char[]
		
		String data ="자바";
		//String -> byte[] (인코딩 : 기본 character-set UTF-8)
		byte[] arr1 = data.getBytes();
		for(byte b : arr1) {System.out.println(b);}

		//byte[] -> String (디코딩)
		String str1 = new String(arr1);
		System.out.println("str1 : "+str1);
		
		byte[] arr2 = data.getBytes("EUC-KR");
		System.out.println("arr2 :" + Arrays.toString(arr2));
		
		String str2 = new String(arr2, "EUC-KR");
		System.out.println("str2 : "+str2);
		
		
	}

}
