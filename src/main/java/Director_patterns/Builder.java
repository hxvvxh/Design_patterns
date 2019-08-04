package Director_patterns;

public interface Builder {
	// 定义组件
	public void buildCPU(); // CUP

	public void buildMemory(); // 内存

	public void buildDisplayCard(); // 显卡

	public Product getFinalResult();// 最终产品
}
