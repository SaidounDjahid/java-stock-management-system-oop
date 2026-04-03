package Projet;

public class Produit {
	protected String nomProd;
	protected String codeProd;
	protected int dureeGarantie;

	public Produit(String n,String c,int d){
		nomProd=n;
		codeProd=c;
		dureeGarantie=d;
	}

	public String getNomProd() {
		return nomProd;
	}

	public void setNomProd(String nomProd) {
		this.nomProd = nomProd;
	}

	public String getCodeProd() {
		return codeProd;
	}

	public void setCodeProd(String codeProd) {
		this.codeProd = codeProd;
	}

	public int getDureeGarantie() {
		return dureeGarantie;
	}

	public void setDureeGarantie(int dureeGarantie) {
		this.dureeGarantie = dureeGarantie;
	}
	public void Afficher(){
		System.out.println("le nom du produit est "+nomProd +"son code est "+codeProd +"sa durée de garantie est "+dureeGarantie);
	}


}
