package Projet;

public class ProduitDispo extends Produit {
protected String Emplacement;
	
	public ProduitDispo(String n,String c,int d,String e){
		super(n,c,d);
		Emplacement=e;
	}

	public String getEmplacement() {
		return Emplacement;
	}

	public void setEmplacement(String emplacement) {
		Emplacement = emplacement;
	}
    public void Afficher(){
    	super.Afficher();
    	System.out.println("son emplacement de stockage est "+Emplacement);
    }
}
