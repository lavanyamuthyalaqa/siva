package shivakumari;

public class ReplaceAlphabetWithAlphabetPositionStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Muralidhar";
		/*String ck = "a";
		char s2;
		String s3,  s4, star = "";
		s4 = s1;
		s1 = s1.toLowerCase();
		// String s2[]=s1.split("a");
		for (int i = 0; i < s1.length(); i++) {
			s2 = s1.charAt(i);
			s3 = Character.toString(s2);
			if (s3.equals(ck)) {
				for (int k = 0; k < i; k++) {
					star = star + "*";
				}
				s4 = s4.replaceFirst("a", star);
				System.out.println(s4);
				star = "";

			}*/
		String i[]=s1.split("");
		StringBuilder s2=new StringBuilder();
		
		for(int j=0;j<i.length;j++){
			int k=0;
			String star="";
			if(i[j].equalsIgnoreCase("a")){
				k=j+1;
				for(int l=1;l<=k;l++){
					star=star+"*";
					
				}
				i[j]=star;
				star="";
			}
			s2.append(i[j]);
			
		}
		System.out.println(s2);

		

	}


}
