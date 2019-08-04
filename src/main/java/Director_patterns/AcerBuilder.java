package Director_patterns;

public class AcerBuilder implements Builder{
	private Product product = new Acer(); 
	@Override
	public void buildCPU() {
		// TODO Auto-generated method stub
		product.add("CUP: Intel 酷睿i3 2350M"); 
	}

	@Override
	public void buildMemory() {
		// TODO Auto-generated method stub
		product.add("内存: 4GB DDR3 1333MHz"); 
	}

	@Override
	public void buildDisplayCard() {
		// TODO Auto-generated method stub
		 product.add("显卡: NVIDIA GeForce GT 520M"); 
	}

	@Override
	public Product getFinalResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
