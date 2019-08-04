package Director_patterns;

public class Director {

	private Builder builder;
	
	public Director(Builder builder) {
		this.builder=builder;
	}
	
	public void construct() {
		builder.buildCPU();
		builder.buildMemory();
		builder.buildDisplayCard();
	}
}
