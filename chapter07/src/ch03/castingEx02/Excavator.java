package ch03.castingEx02;

public class Excavator {

	Attachment attachment;

	public void attachmentChange(int num) {
		if (num == 1) {
			System.out.println("굴착기 버킷 장착");
			attachment = new Bucket();// 버킷 객체로 묵시적 형 변환
		} else if (num == 2) {
			System.out.println("굴착기 드릴 장착");
			attachment = new Drill();// 드릴 객체로 묵시적 형 변환
		} else if (num == 3) {
			System.out.println("굴착기 그래플 장착");
			attachment = new Grapple();// 그래플 객체로 묵시적 형 변환
		}

	}

	public void operate() {
		attachment.operate();
	}
}