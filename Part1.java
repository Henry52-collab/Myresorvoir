//Part1
class Part1
{
	public static int numberDivisible(int[] arr, int num)
	{
		int counter = 0;
		for(int x = 0;x < arr.length;x++)
		{
			if(arr[x] % num == 0)
				counter ++;
		}
		return counter;
	}

	public static boolean twoLengthRun(double[] arr)
	{
		for(int x = 0;x < arr.length - 1;x++)
		{
			if(arr[x] == arr[x + 1])
				return true;	
		}
		return false;
	}

	public static int longestRun(double[] arr)
	{
		
		//思路：
		//1. 记录下每一个连续数列的长度。
		//2. 把每一个连续数列的长度与最长连续数列的长度比，如果长于连续数列，用连续数列的长度替换最长连续数列的。
		//3. 当连续数列结束，连续数列的长度归为一。
		//4. 返回记录最长数列长度的变量。
		 
		int counter = 1;
		int longest = 1;
		for(int x = 0;x < arr.length - 1;x++)
		{
			if(arr[x] == arr[x + 1])
				counter++;
			else
				counter = 1;
			if(counter > longest)
				longest = counter; 
		}
		return longest;
	}
	
	
	public static void main(String[] args)
	{
		/*
		int[] arr = {1,2,15,20,35};
		System.out.println(numberDivisible(arr,5));
		double[] arr1 = {1,2,3,4};
		System.out.println(twoLengthRun(arr1));
		*/

		double[] arr2 = {1,2,3,4.0,4.0,4.0,4,5,6,6,7};
		System.out.println(longestRun(arr2));
		
	}
}
