import java.util.LinkedList;

public abstract class CardSet {

	protected LinkedList<Carte> cartes = new LinkedList<Carte>();
	
	public boolean estValide()
	{
		for(int i=0; i<cartes.size(); i++)
		{
			for(int j=0; j<cartes.size();j++)
			{
				if(j == i)
				{
					j++;
					
					if(j == cartes.size())
					{
						break;
					}
				}
				
				if(cartes.get(i).equals(cartes.get(j)))
				{
					return false;
				}
			}
		}
		
		return true;
	}
	
	@Override
	public String toString()
	{
		String ret = "-------------------\n";
		
		for(Carte c : cartes)
		{
			ret += c.toString() + "\n";
		}
		ret += "-------------------";
		
		return ret;
	}
	
}
