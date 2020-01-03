class Make
{
	
	public static String[] makeDeck()
	{
		String[] ranks = {"\u2660","u2661","\u2662","\u2663"};
		String[] nums = {"1","2","3","4","5","6","7","8","9","10"};
		StringBuffer sb = new StringBuffer();
		for(int x = 0;x < ranks.length;x++)
		{
			for(int y = 0;y < nums.length;y++)
			{
				if( (x != ranks.length -1) && (y != nums.length - 1))
					sb.append(ranks[x] + nums[y] + ",");
				else
					sb.append(ranks[x] + nums[y]);
			}
		}
		String deck = sb.toString();
		String[] result = deck.split(",");
		return result;
	}
	public static void printArr(String[] arr)
	{
		for(int x = 0;x < arr.length;x++)
		{
			if(x != arr.length - 1)
				System.out.print("arr[" + x + "]=" + arr[x] + " "); 
			else
				System.out.println("arr[" + x + "]=" + arr[x]);
		}
	}
	public static void main(String[] args)
	{
		String[] deck = makeDeck();
		printArr(deck);
	}
}
