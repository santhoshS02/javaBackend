package interviewquestions;

public class MaximunandMinimunArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= { 3,10 ,58,63,98,32,14,2,9};
		
		// Minimum value of the array
		int nums=num[0];
		for(int i=1;i<num.length;i++)
		{
			if(num[i]<nums)
			{
				nums=num[i];
			}
		}
		System.out.println("Minimum value of the Array "+nums);
		//************************************************************//
		// Maximum value of the array
		
		for(int i=1;i<num.length;i++)
		{
			if(num[i]>nums)
			{
				nums=num[i];
			}
			
			
		}
		System.out.println("Maximum value of the array "+nums);
	}

}
