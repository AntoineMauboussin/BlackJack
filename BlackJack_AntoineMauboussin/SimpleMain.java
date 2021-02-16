public class SimpleMain extends CardSet implements Comparable<SimpleMain>
{	
	public int valeur()
	{
		int ret = 0;
		int as = 0;
		
		for(Carte c : this.cartes)
		{
			switch(c.getValeur())
			{
			case("2"):
				ret+= 2;
			break;
			case("3"):
				ret+= 3;
			break;
			case("4"):
				ret+= 4;
			break;
			case("5"):
				ret+= 5;
			break;
			case("6"):
				ret+= 6;
			break;
			case("7"):
				ret+= 7;
			break;
			case("8"):
				ret+= 8;
				break;
			case("9"):
				ret+= 9;
			break;
			case("as"):
				ret+= 11;
				as++;
			break;
			default:
				ret+=10;
			break;
			}
		}
		
		for(int i=0; i<as; i++)
		{
			if(ret > 21)
			{
				ret-=10;
			}
		}
		
		return ret;
	}

	@Override
	public int compareTo(SimpleMain m) 
	{
		int v = this.valeur();
		int v1 = m.valeur();
		
		if(v > 21 && v1 > 21)
		{
			return 0;
		}
		else if(v > 21)
		{
			return -1;
		}
		else if(v1 > 21)
		{
			return 1;
		}
		else
		{
			return this.valeur()- m.valeur();
		}
	}
	
	public static void main(String[] args)
	{
		SimpleMain m1 = new SimpleMain();
		SimpleMain m2 = new SimpleMain();
		SimpleMain m3 = new SimpleMain();
		
		m1.cartes.add(new Carte(-1, -1));
		m1.cartes.add(new Carte(-1, -1));
		m1.cartes.add(new Carte(-1, -1));
		
		m2.cartes.add(new Carte(-1, -1));
		m2.cartes.add(new Carte(-1, -1));
		m2.cartes.add(new Carte(-1, -1));
		
		m3.cartes.add(m1.cartes.get(0));
		m3.cartes.add(m1.cartes.get(1));
		m3.cartes.add(m1.cartes.get(2));
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		System.out.println(m1.compareTo(m2));
		System.out.println(m2.compareTo(m1));
		System.out.println(m3.compareTo(m1));
	}
}
