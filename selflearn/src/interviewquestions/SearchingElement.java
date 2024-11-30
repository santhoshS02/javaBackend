package interviewquestions;

// Linear search array 
public class SearchingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,50,40,50};
		
		int search_element= 50;
		
		boolean flag = false;
		for(int i=0;i<a.length;i++)
		{
				if(search_element==a[i])
				{
					System.out.println("Elemetn is fount " +a[i]);
					flag = true;
					break;
					
				}
		}
			
		if(flag==false)
		{
			System.out.println("Element is not found ");
		}
		

	}

}
