package quiz;

/* NameNullOrEmptyException 예외클래스 구현 */
/* KidSizeException  예외클래스 구현 */


public class Test4 {

	private String koreanId;
	private String name;
	
	public String getKoreanId() {
		return koreanId;
	}
	public String getName() {
		return name;
	}
	
	/* setKorean()메서드 구현 */ 
	
	
	public static void main(String[] args) {
		
		Test4 kor1 = new Test4();

		try {
			kor1.setKorean("0201013041abcd", "솔데스크");
		} catch (NameNullOrEmptyException e) {
			System.out.println(e.getMessage());
		} catch (KidSizeException e) {
			System.out.println(e.getMessage());
		}
	   
	}

}
