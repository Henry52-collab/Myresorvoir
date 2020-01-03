class RemovePairs
{
	public static char[] removePairs(char[] chs)
	{
		/*
		思路：
		1. 建立一个StringBuffer变量用于记录移出对子后的字符数组中的元素。
		2. 遍历字符数组中的元素，判断是否其数量大于或等于2，如不是，把其赋进变量中。
		3. 把StringBuffer变量变成字符串。
		4. 把字符串变成字符数组。
		5. 返回字符数组。
		*/

		StringBuffer sb = new StringBuffer();
		for(int x = 0;x < chs.length;x++)
		{
			if(count(chs,chs[x]) != 2)
				sb.append(chs[x]);
		}
		StringBuffer copy = new StringBuffer(sb.substring(0,sb.length()));
		for(int x = 0;x < copy.length();x++)
		{
			if((count(sb,copy.charAt(x))) > 2)
				sb.deleteCharAt(sb.charAt(x));
				
		}
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
	
	public static int count(StringBuffer sb,char c)
	{
		int counter = 0;
		for(int x = 0;x < sb.length();x++)
		{
			if(sb.charAt(x) == c)
				counter++;
		}
		return counter;
	}
	public static void main(String[] args)
	{
		char[] chs = {'1','1','2','3','A','A','A'};
		//StringBuffer sb = new StringBuffer("aabbc");
		//System.out.println(count(sb,'a'));
		chs = removePairs(chs);
		for(int x = 0;x < chs.length;x++)
		{
			System.out.println("chs[" + x + "]=" + chs[x]); 
		}
		
	}
}