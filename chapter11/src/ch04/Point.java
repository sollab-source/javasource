package ch04;

public class Point {

	int point;
	public void checkpoint(int point) throws MinusException, UpException{
		if(point < 0) {
			throw new MinusException(point);
		}else if(point > 50) {
			throw new UpException(point);
		}
		this.point = point;
		System.out.println("포인트 저장");
	}

	public static void main(String[] args) {
		Point point = new Point();
		
		try {
			point.checkpoint(80);
		} catch (MinusException | UpException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("점수 : "+point.point);
	}
}
