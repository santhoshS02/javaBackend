package factorial;

import java.util.Arrays;
public class Removespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name =( "Wel  come");
		int count=0;
		String A = name.trim().replaceAll(" ", "");
		System.out.println(A);
		
		
		System.out.println(count);
		
		int countA=0;
		int countB=0;
		String s="aabbababababbbaaaa";
		
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)=='a')
			{
				countA++;
			}
			if(s.charAt(i)=='b') {
				countB++;
			}
			
		}
		System.out.println(countA);
		System.out.println(countB);

	}

}
