package ch01.inheritanceEx02;

public class Bus extends PublicTransport {

	int busNo;// 버스 번호
	int charge;// 요금
	int passengerCount;// 승객 수

	// 매출액 계산
	public int calculateSales() {
		return charge * passengerCount;
	}
}