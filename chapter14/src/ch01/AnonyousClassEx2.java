package ch01;


interface Age{
	int age = 21;
	public void getAge();
}


public class AnonyousClassEx2 {

	public static void main(String[] args) {

		Age obj = new Age() {
			
			@Override
			public void getAge() {				
				System.out.println("Age is "+age);
			}
		};
		
		obj.getAge();
	}
}
