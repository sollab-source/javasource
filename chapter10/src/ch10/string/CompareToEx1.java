package ch10.string;

public class CompareToEx1 {

	public static void main(String[] args) {
	//공백 숫자 대문자 소문자 한글 (사전) 순	
		String str1 = "ABC";
		String str2 = "ABZ";
		

		int i = str1.compareTo(str2);//같은 인덱스의 문자를 뽑아서 -(마이너스) 처리
		System.out.println(i);
		if(i == 0) {
			System.out.println("두 글자는 같습니다.");
		}else if(i > 0) {//양수라면 첫번째 문자열이 더 큼
			System.out.println(str1+ "이/가 "+str2+"보다 큽니다.");
		}else if(i < 0){//음수라면 두번째 문자열이 더 큼
			System.out.println(str2+ "이/가 "+str1+"보다 큽니다.");
		}
	}

}


