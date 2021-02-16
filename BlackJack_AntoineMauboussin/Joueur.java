public abstract class Joueur {
	
	protected SimpleMain main = new SimpleMain();

	public abstract boolean prendCarte();
	
	public SimpleMain getMain()
	{
		return this.main;
	}
}
