package interviewquestions;

public class SumofarrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,40,50+60};
		
		int sum =0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		System.out.println(sum);
		
		//enhanced for loop 
		int add=0;
		for(int value:a)
		{
			 add= add+value;
		}
		System.out.println(add);
	}

}
