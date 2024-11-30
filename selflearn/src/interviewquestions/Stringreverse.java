package interviewquestions;


public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//**************************************************************//
		
		// 1 st method normal for loop method 
		String name = "revathi";
		String rev = " ";
		
		int s= name.length();
		System.out.println(s);
		
		for(int i = name.length()-1; i>=0; i--)
		{
			rev+=name.charAt(i);
		}
		System.out.println(rev);
		
		//***************************************************************//
		
		// 2 nd char array method 
		char a[] = name.toCharArray();
		
		String revs = " ";
		for(int j=name.length()-1;j>=0;j--)
		{
			revs = revs+a[j];
			
		}
		System.out.println(revs);
		
		//**************************************************************//
		
		// 3 rd stringbuffer method 
		StringBuffer back;
		StringBuffer SB = new StringBuffer(name);
		back = SB.reverse();
		System.out.println(back);
		
	}

}
