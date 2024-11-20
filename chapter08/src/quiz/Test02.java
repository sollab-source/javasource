package quiz;

public class Test02 {

	public static void main(String[] args) {
		Person student = new Student();
		Person worker = new Worker();

		System.out.println("학생의 하루 일과:");
		student.dailyRoutine();

		System.out.println();

		System.out.println("직장인의 하루 일과:");
		worker.dailyRoutine();
	}
}