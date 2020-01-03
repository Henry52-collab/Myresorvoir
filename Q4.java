class Q4
{
	public static char[] cleanUp(char[] arr)
	{
		/*
		1. 把字符数组中的所有元素添加到一个字符串缓冲区里。
		2. 删除指定字符。
		3. 把处理后的字符缓冲区变回字符串。
		4. 把处理后的字符串变回字符数组，返回。
		*/
		StringBuffer sb = new StringBuffer();
		arr = removeStar(arr);
		sb = removeOdd(arr);
		String result = sb.toString();
		return result.toCharArray();
	}

	public static int count(char[] chs,char c)	
	{
		int counter = 0;
		for(int x = 0;x < chs.length;x++)
		{
			if(chs[x] == c)
				counter++;
		}
		return counter;
	}
	
	public static char[] removeStar(char[] arr)
	{
		StringBuffer sb = new StringBuffer();
		for(int x = 0; x < arr.length;x++)
		{
			if(arr[x] != '*')
				sb.append(arr[x]);
		}
		return sb.toString().toCharArray();
	}
	
	public static StringBuffer removeOdd(char[] arr)
	{
		StringBuffer sb = new StringBuffer();
		for (int x = 0;x < arr.length ; x++ )
		{
			if(count(arr,arr[x]) % 2 == 0)
				sb.append(arr[x]);
		}
		return sb;
	}

	public static boolean isRigorous(char[] chs)
	{
		/*
		思路：
		1. 定义变量，初始值为true。
		2. 用一个变量记录每一个字符数组中元素的个数。
		3. 如果有元素个数不为二，停止遍历，变量值改为false。
		4. 返回变量。
		*/

		boolean test = true;
		int x = 0;
		while(x < chs.length)
		{	
			if((count(chs,chs[x])) != 2)
				test = false;
			x++;
		}
		return test;
	}
	public static void main(String[] args)
	{
		char[] arr = {'D','D','F','G','G','#','*'};
		arr = cleanUp(arr);
		char[] arr1 = {'D','D','A','A','E'};
		for(int x = 0;x < arr.length;x++)
		{
			System.out.println("arr[" + x + "]=" + arr[x]);
		}
		System.out.println(isRigorous(arr1));
	}
}