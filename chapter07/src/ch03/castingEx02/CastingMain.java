package ch03.castingEx02;

public class CastingMain {

	public static void main(String[] args) {

		Excavator excavator = new Excavator();

		excavator.attachmentChange(1); // 버킷 장착
		excavator.operate();

		excavator.attachmentChange(2); // 드릴 장착
		excavator.operate();

		excavator.attachmentChange(3); // 그래플 장착
		excavator.operate();
	}
}