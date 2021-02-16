import java.util.LinkedList;
import java.util.Random;

public class SimpleTalon extends CardSet 
{
	public SimpleTalon()
	{
		for(int i=0; i<13; i++)
		{
			for(int j=0; j<4; j++)
			{
				this.cartes.add(new Carte(i,j));
			}
		}
	}
	
	public boolean estComplet()
	{
		if(this.cartes.size() == 52)
		{
			return true;
		}
		
		return false;
	}
	
	public void transferCards(SimpleMain m)
	{
		if(!this.cartes.isEmpty())
		{
			m.cartes.add(this.cartes.removeLast());
		}
		else
		{
			System.out.println("Le paquet est vide");
		}
	}
	
	public void melanger()
	{
		Random r = new Random();
		
		for(int i=0; i<7; i++)
		{
			LinkedList<Carte> cartes2 = new LinkedList<Carte>();
			LinkedList<Carte> ret = new LinkedList<Carte>();
			
			for(int j=0; j<52; j++)
			{
				if(r.nextInt(2) == 0)
				{
					cartes2.add(cartes.removeLast());
				}
			}
			
			for(int j=0; j<52; j++)
			{
				if(r.nextInt(52-j) < cartes.size())
				{
					ret.add(cartes.removeLast());
				}
				else
				{
					ret.add(cartes2.removeLast());
				}
			}
			
			cartes = ret;
		}
	}
	
	public static void main(String[] args)
	{
		SimpleTalon t1 = new SimpleTalon();
		
		System.out.println(t1);
		System.out.println(t1.estComplet());
		System.out.println(t1.estValide());
		t1.melanger();
		System.out.println(t1);
		System.out.println(t1.estComplet());
		System.out.println(t1.estValide());
	}
}
