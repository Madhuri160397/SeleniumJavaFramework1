package Java;

public class JAVA_forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {1,2,3,4,5};
		
		for(int i=0; i<=arr2.length;i++) 
		{
		
		System.out.println(arr2[i]);
			
	    }
		//OR
		
		for(int x : arr2)
		{
			System.out.println(x);
		}
	}
	
}

