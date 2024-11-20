package ch01.interfaceEx02;

public class Tv implements Remote {

	private int volume = 50;

	@Override
	public void turnOn() {
		System.out.println("TV 전원을 킵니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 전원을 끕니다.");
	}

	@Override
	public void volumeUp(int volume) {
		if ((this.volume + volume) > MAX_VALUME) {
			this.volume = MAX_VALUME;
			System.out.println(volume + "만큼 TV 볼륨을 높이다");
			System.out.println("현재 볼륨은 : " + this.volume);
		} else {
			this.volume += volume;
			System.out.println(volume + "만큼 TV 볼륨을 높이다");
			System.out.println("현재 볼륨은 : " + this.volume);
		}
	}

	@Override
	public void volumeDown(int volume) {
		if ((this.volume - volume) < MIN_VALUME) {
			this.volume = MIN_VALUME;
			System.out.println(this.volume + "만큼 TV 볼륨을 내리다");
			System.out.println("현재 볼륨은 : " + this.volume);
		} else {
			this.volume += volume;
			System.out.println(this.volume + "만큼 TV 볼륨을 내리다");
			System.out.println("현재 볼륨은 : " + this.volume);
		}
	}
}