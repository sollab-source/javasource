package ch03.castingEx02;

public class Attachment {
	public void operate() {
	}
	// 실제 동작은 자식 클래스에서 정의
}

class Bucket extends Attachment {
	@Override
	public void operate() {
		System.out.println("버킷으로 흙을 파고 있습니다.");
	}
}

class Drill extends Attachment {
	@Override
	public void operate() {
		System.out.println("드릴로 땅을 뚫고 있습니다.");
	}
}

class Grapple extends Attachment {
	@Override
	public void operate() {
		System.out.println("그래플로 물체를 집고 있습니다.");
	}
}