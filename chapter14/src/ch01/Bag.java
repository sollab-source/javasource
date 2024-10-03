package ch01;

public class Bag {
	 
    private String name;
    private Long price;
 
 
    public Bag(String name, Long price) {
        this.name = name;
        this.price = price;
    }
 
    class Pouch {
        private String pouchName;
        private String color;
 
        static int k = 5; // static 멤버 사용 불가
        static final int cost = 5000; // 하지만 상수인 final static은 사용 가능
 
        public void printMember() {
            System.out.println("name = " + name); // 외부 클래스의 멤버에 접근 가능 ( private 여도 같은 클래스 내에서 접근하므로 ok )
            System.out.println("price = " + price); // 외부 클래스의 멤버에 접근 가능 ( private 여도 같은 클래스 내에서 접근하므로 ok )
 
            System.out.println("pouchName = " + pouchName); // 내부 클래스의 멤버
            System.out.println("color = " + color); // 내부 클래스의 멤버
        }
    }
}
