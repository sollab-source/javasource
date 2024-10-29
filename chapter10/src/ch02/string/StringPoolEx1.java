package ch02.string;

public class StringPoolEx1 {

	public static void main(String[] args) {
		String a = "AAA";
		String b = "BBB";
		//가상 머신 안에서 똑같은 문자열 리터럴을 사용하는 모든 코드가 같은 객체를 재사용함이 보장됨
		//String pool
		String c = "AAA";
		String d = new String("AAA");
		//참조(주소) 비교
		System.out.println("a == b : "+(a == b));
		System.out.println("a == c : "+(a == c));//true
		System.out.println("a == d : "+(a == d));
		//String클래스의 hashcode : 저장된 문자열의 hashcode값 리턴
		System.out.println("a.hashCode() : "+a.hashCode());
		System.out.println("d.hashCode() : "+d.hashCode());
		//실제 주소값
		System.out.println("a.hashCode() : "+System.identityHashCode(a));
		System.out.println("c.hashCode() : "+System.identityHashCode(c));
		System.out.println("d.hashCode() : "+System.identityHashCode(d));
		
		

	}

}
