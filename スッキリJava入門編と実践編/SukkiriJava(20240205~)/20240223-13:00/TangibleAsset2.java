
public abstract class TangibleAsset2 extends Asset implements Thing {
	String color;
	double weight;
	public TangibleAsset2(String name, int price, String color, double weight) {
		super(name, price);
		this.color = color;
		this.weight = weight;
	}
	public String getColor() { return this.color; }
	public double getWeight() { return this.weight; }
	public void setWeight(double weight) { this.weight = weight; } 
}
