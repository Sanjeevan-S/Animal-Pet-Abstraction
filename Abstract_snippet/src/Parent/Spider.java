package Parent;

public class Spider extends Animal{
	
	
	Spider(int legs) {
		super(legs);
	}

	@Override
	public void eat() {
		System.out.println("Spider eats insects");
	}
	
	public void web() {
		System.out.println("can create web");
	}
	
}
