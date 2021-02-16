import java.util.Scanner;

public class JoueurHumain extends Joueur{

	private Scanner s = new Scanner(System.in);
	
	@Override
	public boolean prendCarte() 
	{
		System.out.println("Voulez une nouvelle carte? (o ou n)");
		
		String ans = s.nextLine();
		
		if(ans.equalsIgnoreCase("o"))
		{
			return true;
		}
		else if(ans.equalsIgnoreCase("n"))
		{
			return false;
		}
		else
		{
			return prendCarte();
		}
	}
	
	public void closeScanner()
	{
		s.close();
	}

}
