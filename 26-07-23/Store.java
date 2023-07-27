class Store{
	
	//System.out.println("");
	public void emails(String[] emails)
	{
		for(int i=1;i<emails.length;i++)
		{
			System.out.println("Email at position "+i+" is :"+emails[i]);
		}
	}
	//System.out.println("======================================================================================");
	
	public void groceryItems(String[] items)
	{
		for(int i=1;i<items.length;i++)
		{
			System.out.println("Item at position "+i+" is :"+items[i]);
		}
	}
	//System.out.println("======================================================================================");
	
	public void iplTeams(String[] teams)
	{
		for(int i=1;i<teams.length;i++)
		{
			System.out.println("Team at Position "+i+" is :"+teams[i]);
		}
	}
	
}