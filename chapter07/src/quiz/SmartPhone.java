package quiz;

public class SmartPhone extends Phone {

	private boolean videoCall;

	public void setVideoCall(boolean videoCall) {
		this.videoCall = videoCall;
	}

	@Override
	public void call() {
		if (videoCall) {
			System.out.println("화상전화를 겁니다.");
		} else {
			System.out.println("일반 전화를 겁니다.");
		}
	}
}