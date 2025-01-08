package exercises.readWriteCsvFile;

public class ProductSummary {
	private String name;
	private Double totalValue;
	
	public ProductSummary(String name, Double totalValue) {
		this.name = name;
		this.totalValue = totalValue;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Double getTotalValue() {
		return totalValue;
	}
	
	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	@Override
	public String toString() {
		return String.format("%s, %f", getName(), getTotalValue());
	}	
}
