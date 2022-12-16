package Parent;

public class Fish extends Animal implements Pet{
	
	private String fname;
	
	Fish(){
		super(0);
	}
	
	@Override
	public void eat() {
		System.out.println(fname + " eats Algae");
	}
	
	@Override
	public void play() {
		System.out.println(fname + " plays in the water");
	}
	
	@Override
	public void walk() {
		System.out.println(fname + " cant walk");
	}
	
	@Override
	public void setName(String name) {
		this.fname=name;
	}
	
	public String getName() {
		return fname;
	}
	
	
}
