package Parent;

public abstract class Animal {
	protected int legs;
	
	Animal(int legs){
		this.legs = legs;
	}
	
	public void walk() {
		System.out.println("Walks with "+ legs+ " legs");
	}
	
	public abstract void eat();
}
