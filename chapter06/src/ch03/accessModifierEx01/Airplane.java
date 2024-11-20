package ch03.accessModifierEx01;

public class Airplane {
	private int altitude;// 외부에서 접근 불가

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {

		if (altitude < 0) {
			this.altitude = 0;
		} else {
			this.altitude = altitude;
		}
	}
}