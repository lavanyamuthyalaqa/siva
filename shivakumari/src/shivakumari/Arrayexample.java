package shivakumari;

public class Arrayexample {

	public static void main(String[] args) {

			int i[]=new int[5];
			i[0]=10;
			i[1]=20;
			i[2]=30;
			i[3]=40;
		
			
			System.out.println(i.length);
			
			for(int j=0;j<i.length;j++){
				System.out.println(i[j]);
			}
			
			/*for(int k=i.length-1;k>=0;k--){
				System.out.println(i[k]);
			}*/

	}

}
