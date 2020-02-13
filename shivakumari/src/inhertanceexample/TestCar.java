package inhertanceexample;

public class TestCar extends BMW  {

	public static void main(String[] args) {
			
		//BMW obj=new BMW();
		//Car obj=new BMW();
		//BMW obj=new Car();
		Car obj=new Car();
		obj.refule();
		obj.start();
		obj.stop();
		//obj.theftsafety();
		System.out.println(obj.i);
		System.out.println(Car.s);

	}

}
