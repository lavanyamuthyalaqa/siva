package AbstractExample;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICICIBank obj=new ICICIBank();
		//UKBank obj=new ICICIBank();
		//UKBank obj=new UKBank();
		System.out.println(obj.i);
		System.out.println(UKBank.s);
		System.out.println(obj.name);
		
		obj.credit();
		obj.debit();
		obj.loan();
		//obj.homeloan();

	}

}
