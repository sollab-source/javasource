package ch01.inheritanceEx02;

public class Subway extends PublicTransport {

	int subwayLine;// 지하철 호선
	int charge;// 요금
	int passengerCount;// 승객 수

	// 매출액 계산
	public int calculateSales() {
		return charge * passengerCount;
	}
}