import java.util.Random;

public class Carte {
	
	public static final String[] valeurs = {"2","3","4","5","6","7","8","9","10","valet","dame","roi","as"};
	public static final String[] couleurs = {"pique", "coeur", "carreau", "trefle"};
	private String valeur;
	private String couleur;
	
	public Carte(int v, int c)
	{
		if(v>=0 && v<13 && c>=0 && c<4)
		{
			valeur = valeurs[v];
			couleur = couleurs[c];
		}
		else
		{
			Random r = new Random();
			
			valeur = valeurs[r.nextInt(13)];
			couleur = couleurs[r.nextInt(4)];
		}
	}
	
	public String getValeur()
	{
		return valeur;
	}
	
	public String getCouleur()
	{
		return couleur;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Carte)
		{
			Carte carte = (Carte)o;
			
			if(this.getValeur() == carte.getValeur() && this.getCouleur() == carte.getCouleur())
			{
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public String toString()
	{
		return(valeur + " de " + couleur);
	}
	
	public static void main(String[] args)
	{
		Carte c1 = new Carte(0,3);
		Carte c2 = new Carte(12,1);
		Carte c3 = new Carte(0,3);
		Carte c4 = new Carte(-1,-1);
		
		System.out.println(c1.toString() + " || " + c2.toString() + " || " + c3.toString() + " || " + c4.toString());
		System.out.println(c1.equals(c3));
		System.out.println(c2.equals(c4));
	}
}
