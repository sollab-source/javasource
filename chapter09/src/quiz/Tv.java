package quiz;

public class Tv implements GameConsole, SmartDevice {
	@Override
	public void playGame() {
		System.out.println("게임을 실행합니다.");
	}

	@Override
	public void connectInternet() {
		System.out.println("인터넷에 연결합니다.");
	}
}