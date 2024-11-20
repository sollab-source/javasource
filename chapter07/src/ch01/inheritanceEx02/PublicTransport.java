package ch01.inheritanceEx02;

public class PublicTransport {

	int charge;// 요금
	int passengerCount;// 승객 수

	public int calculateSales() {
		return charge * passengerCount;// 매출액 계산
	}
}