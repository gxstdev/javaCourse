package exercises.copyAllFiles;


public class Nf {
	private String id;
	private String dataEmission;
	private String itemNumber;

	public Nf(String id, String dataEmission, String itemNumber) {
		this.id = id;
		this.dataEmission = dataEmission;
		this.itemNumber = itemNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDataEmission() {
		return dataEmission;
	}

	public void setDataEmission(String dataEmission) {
		this.dataEmission = dataEmission;
	}

	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	@Override
	public String toString() {
		return String.format("%s,%s,%s", id, dataEmission, itemNumber);
	}
	
}
