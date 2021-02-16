public class Jeu {

	public static void main(String[] args)
	{
		boolean take = true;
		
		SimpleTalon talon = new SimpleTalon();
		JoueurHumain j1 = new JoueurHumain();
		JoueurOrdinateur cpt = new JoueurOrdinateur();
		
		talon.melanger();
		
		talon.transferCards(j1.getMain());
		talon.transferCards(cpt.getMain());
		
			
		while(take)
		{	
			System.out.println("Main adverse:");
			System.out.println(cpt.getMain());
			System.out.println("Votre main");
			System.out.println(j1.getMain());
			take = j1.prendCarte();
			
			if(take)
			{
				talon.transferCards(j1.getMain());
			}
		}
		
		while(cpt.prendCarte())
		{
			talon.transferCards(cpt.getMain());
		}
		
		System.out.println("Main adverse:");
		System.out.println(cpt.getMain());
		System.out.println("Votre main");
		System.out.println(j1.getMain());
		j1.closeScanner();
		
		if(j1.getMain().compareTo(cpt.getMain()) > 0)
		{
			System.out.println("Vous avez gagné");
		}
		else if(j1.getMain().compareTo(cpt.getMain()) == 0)
		{
			System.out.println("Egalité");
		}
		else
		{
			System.out.println("Vous avez perdu");
		}
	}
}
