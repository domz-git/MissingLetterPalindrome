
public class Main {

	public static void main(String[] args) {
		
		String S = "NEVENNE?EN";
		System.out.print(getMinimumCost(S));
		
		
		
	}
	
	public static int getMinimumCost(String S)
	  {

		 for(int i=0;i<S.length();i++){
		      if(S.charAt(i)!=S.charAt((S.length()-1)-i)){
		          int ascii = S.charAt(i);
		          return ascii;
		      }
		    }

		    return -1;
	  }
}
