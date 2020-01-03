class DealCards
{
	public static char[][] dealCards(char[] deck)
	{
		/*
		思路：
		1. 建立两个变量，一个用于记录机器人的牌，另一个用于记录人类的牌。
		2. 建立一个二维数组变量，用于记录机器人和人类的牌。
		3. 把传入的字符数组分配进两个StringBuffer变量中。
		4. 把两个StringBuffer变量变成字符数组。
		5. 把两个字符数组赋进二维数组中。
		6. 返回二维数组。
		*/

		StringBuffer human = new StringBuffer();
		StringBuffer robot = new StringBuffer();
		char[][] cards = new char[2][];
		for(int x = 0;x < deck.length /2;x++)
		{
			human.append(deck[x]);
		}
		for(int y = deck.length / 2; y < deck.length ; y++ )
		{
			robot.append(deck[y]);
		}
		String robotcards = robot.toString();
		String humancards = human.toString();
		cards[0] = robotcards.toCharArray();
		cards[1] = humancards.toCharArray();
		return cards;
	}

	
	public static void main(String[] args)
	{
		/*
		char[] arr = {'1','2','3','4','5','6','7','8','9','J','Q','K','A'};
		char[][] chs = dealCards(arr);
		for(int x = 0;x < chs[0].length; x++)
		{
			System.out.print("chs[0]" + "[" + x + "]=" + chs[0][x] + " ");
		}
		for(int x = 0;x < chs[1].length;x++)
		{
			System.out.print("chs[1]" + "[" + x + "]=" + chs[1][x] + " ");
		}
		*/
		
	
	}
}