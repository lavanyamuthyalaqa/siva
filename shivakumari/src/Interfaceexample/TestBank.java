package Interfaceexample;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HDFCBank hb=new HDFCBank();
		//USBank hb=new USBank();
		USBank hb=new HDFCBank();
		System.out.println(USBank.i);
		System.out.println(USBank.s);
		hb.credit();
		hb.debit();
		//hb.eduloan();

	}

}
