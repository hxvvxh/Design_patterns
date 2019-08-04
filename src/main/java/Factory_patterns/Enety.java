package Factory_patterns;

public class Enety {
	public class Tv implements Produce {
		public Tv() {
			System.out.println("TV");
		}
	}

	public class Car implements Produce {
		public Car() {
			System.out.println("Car");
		}
	}
}
