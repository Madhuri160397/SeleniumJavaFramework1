package Java;

public class Java_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
	for(int i=0; i<arr.length;i++)
		//for(int i : arr)
		{
			if(arr[i]%2 ==0)
			{
				System.out.println(arr[i]);
			}
			else
			{
				System.out.println(arr[i]+" not multiple of 2");
			}
		}
	}

}
