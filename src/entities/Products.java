package entities;

public class Products {
	private String  name;
	private Double  price;
	private Integer qtty;
	
	public Products() {
		
	}
	public Products(String name, Double price, Integer qtty) {
		this.name = name;
		this.price = price;
		this.qtty = qtty;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getPrice() {
		return price;
	}
	public void setQtty(Integer qtty) {
		this.qtty = qtty;
	}
	public Integer getQtty(){
		return qtty;
	}
	
	public Double ReturnPrice() {
		return price * qtty;
	}
	
}
