package ch02.polymorphismEx01;

public interface Attachment {
	public void operate();
}

class Bucket implements Attachment {
	@Override
	public void operate() {
		System.out.println("버킷으로 흙을 파고 있습니다.");
	}
}

class Drill implements Attachment {
	@Override
	public void operate() {
		System.out.println("드릴로 땅을 뚫고 있습니다.");
	}
}

class Grapple implements Attachment {
	@Override
	public void operate() {
		System.out.println("그래플로 물체를 집고 있습니다.");
	}
}