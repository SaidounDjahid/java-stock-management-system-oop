package Projet;

public class Stock implements Statistique{
	protected int nbProdInit;
	protected int nbProdDispo;
	protected int nbProdVendu;
	
	public Stock(int nbi,int nbd,int nbv){
		nbProdInit=nbi;
		nbProdDispo=nbd;
		nbProdVendu=nbv;
	}
	
	

	public int getNbProdInit() {
		return nbProdInit;
	}



	public void setNbProdInit(int nbProdInit) {
		this.nbProdInit = nbProdInit;
	}



	public int getNbProdDispo() {
		return nbProdDispo;
	}



	public void setNbProdDispo(int nbProdDispo) {
		this.nbProdDispo = nbProdDispo;
	}



	public int getNbProdVendu() {
		return nbProdVendu;
	}



	public void setNbProdVendu(int nbProdVendu) {
		this.nbProdVendu = nbProdVendu;
	}



	public void Affich() {
		System.out.println( "nbProdInit=" + nbProdInit + ", nbProdDispo="
				+ nbProdDispo + ", nbProdVendu=" + nbProdVendu );
	}



	public double PourcentageVente() {
		return (nbProdVendu)*100/nbProdInit;
	}

}
