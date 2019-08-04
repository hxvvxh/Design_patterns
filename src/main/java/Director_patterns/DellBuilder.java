package Director_patterns;

public class DellBuilder implements Builder{
	private Product product = new Dell(); 
	@Override
	public void buildCPU() {
		// TODO Auto-generated method stub
		product.add("CUP: Intel 酷睿i7 3612QM");
	}

	@Override
	public void buildMemory() {
		// TODO Auto-generated method stub
		product.add("内存: 8GB DDR3 1600MHz");
	}

	@Override
	public void buildDisplayCard() {
		// TODO Auto-generated method stub
		 product.add("显卡: NVIDIA GeForce GT 640M＋Intel GMA HD 4000");
	}

	@Override
	public Product getFinalResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
