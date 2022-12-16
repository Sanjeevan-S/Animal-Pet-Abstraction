package Parent;

public class TestAnimal {

	public static void main(String[] args) {
		Fish d = new Fish();
		Cat c = new Cat("Fluffy");
		Animal a= new Fish();
		Animal e = new Spider(8);
		Pet p = new Cat();
		
		d.eat();
		d.setName("Walter");
		d.walk();
		d.play();
		System.out.println("..............................");
		
		c.eat();
		c.play();
		c.getName();
		System.out.println("..............................");
		
		a.eat();
		a.walk();
		System.out.println("..............................");
		
		e.eat();
		e.walk();
		System.out.println("..............................");
		
		p.play();
		p.getName();
		p.setName("Juan");
	}

}
