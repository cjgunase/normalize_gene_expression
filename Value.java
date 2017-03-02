
public class Value {
	private Double value;
	private String key;
	public Value(String key,Double d) {
		super();
		this.value = d;
		this.key =key;
	}

	public Value(String key,String d) {
		super();
		this.value = Double.parseDouble(d);
		this.key =key;
	}
	

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public void setValue(String value) {
		this.value = Double.parseDouble(value);
	}

	public String getKey() {
		return key;
	}
	

}
