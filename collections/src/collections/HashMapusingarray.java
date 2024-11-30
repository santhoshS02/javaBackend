package collections;


import java.util.HashMap;

public class HashMapusingarray {
	
	//Function to create hashmap from array
	static void createHashMap(int arr[])
	{
		//entry hash map
		
		HashMap<Integer,Integer> HM = new HashMap<Integer,Integer>();
		
		// traverse through the array
		for(int i=0;i<arr.length;i++)
		{
			
			//check the element is present
			Integer c = HM.get(arr[i]);
			
			//if this is the first occurence of element
			if(HM.get(arr[i]) == null)
					{
						HM.put(arr[i], 1);
					}
			//If the element is already exist in the hash map
			//increment by 1.
			
			else
			{
				HM.put(arr[i], ++c);
			}
		}
		System.out.println(HM);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,50,80,65,4,54,8,8,45,45,4};
		createHashMap(arr);
		

	}

}
