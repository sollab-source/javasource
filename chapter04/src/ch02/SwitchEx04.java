package ch02;

public class SwitchEx04 {

	public static void main(String[] args) {

		String vehicleType = "car";
		
		int maxSpeed = switch (vehicleType) {
		
		// bicycle일 경우, 최대 속도 25
		case "bicycle" -> 25;
		// motorcycle일 경우, 최대 속도 100
		case "motorcycle" -> 100;
		case "car" -> {
			System.out.println("car를 선택 했습니다.  ");
			// 여러 줄 블록에서 값을 반환
			yield 180;
		}
		// airplane일 경우, 최대 속도 900
		case "airplane" -> 900;
		default -> throw new IllegalArgumentException(
				"알 수 없는 차량 종류 " + vehicleType);
		};

		System.out.println("최대 속도는 " + maxSpeed + " km/h");
	}
}