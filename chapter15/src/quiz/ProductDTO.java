package quiz;

import java.util.Date;

public class ProductDTO {
	private int pid;
	private String name;
	private int price;
	private int quantity;

	// getter,setter,toString 메소드 작성
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ProductDTO [pid=" + pid + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
}