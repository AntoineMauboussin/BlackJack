public class JoueurOrdinateur extends Joueur 
{
	@Override
	public boolean prendCarte() 
	{
		if(this.main.valeur() <= 16)
		{
			return true;
		}
		
		return false;
	}

}
