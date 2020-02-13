package shivakumari;

public class twoarrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[][]=new String[3][4];
		
		s[0][0]="A1";
		s[0][1]="B1";
		s[0][2]="C1";
		s[0][3]="D1";
		
		s[1][0]="A2";
		s[1][1]="B2";
		s[1][2]="C2";
		s[1][3]="D2";
		
		s[2][0]="A3";
		s[2][1]="B3";
		s[2][2]="C3";
		s[2][3]="D3";
		
		System.out.println("the row size is::"+s.length);
		System.out.println("the col size is::"+s[0].length);
		
		for(int row=0;row<s.length;row++){
			for(int col=0;col<s[0].length;col++){
				System.out.print(s[row][col]+"\t"); 
			}
			System.out.println();
		}
		
		

	}

}
