package Interfaceexample;

public class HDFCBank implements USBank {

	@Override
	public void credit() {
		System.out.println("HDFC.........Credit");
		
	}

	@Override
	public void debit() {

		System.out.println("HDFC...........Debit");
		
	}
	
	public void eduloan(){
		System.out.println("HDFC................eduloan");
	}

}
