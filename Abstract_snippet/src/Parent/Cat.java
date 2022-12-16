package Parent;

public class Cat  extends Animal implements Pet{
	
	private String cname;
	
	Cat(String name){
		super(4);	
		this.cname = name;
	}
	
	Cat(){
		this("");
	}
	
	@Override
	public void eat() {
		System.out.println(this.cname + " Cat eats cat food");
	}
	
	@Override
	public void play() {
		System.out.println( this.cname + " plays with other cats");
	}
	
	@Override
	public String getName(){
		return cname;
	}
	
	@Override
	public void setName(String name) {
		this.cname = name;
	}
}
