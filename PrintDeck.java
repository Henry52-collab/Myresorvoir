class PrintDeck
{
	public static void printDeck(char[] deck)
	{
		for(int x = 0;x < deck.length;x++)
		{
			if(x != deck.length - 1)
				System.out.print(deck[x] + " ");
			else
				System.out.print(deck[x]);
		}
	}
	
	public static void main(String[] args)
	{
		char[] chs = {'1','2','3','4','5','6'};
		printDeck(chs);
	}
}