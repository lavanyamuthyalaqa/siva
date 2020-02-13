package AbstractExample;

public abstract class UKBank {
	
	int i=10;
	static String s="lavanya";
	final String name="sonu";
	
	public void credit(){
		System.out.println("UKBank............credit");
	}
	
	public void debit(){
		System.out.println("UKBank.............debit");
	}
	
	public abstract void loan();

}
