package quiz;

public class Test02 {
	
	public static void main(String[] args) {
	    int x = 12;
        int y = 7;
        int z = 15;

        int max = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
        System.out.println("가장 큰 수는: " + max);
        
	}

}
