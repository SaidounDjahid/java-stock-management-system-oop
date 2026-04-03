package Projet;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ProduitVendu extends Produit {
	protected MaDate dateVente;
	protected String codeCl;
	
	public ProduitVendu(String n,String c,int d,MaDate date,String cl){
		super(n,c,d);
		dateVente=date;
		codeCl=cl;
	}

	public MaDate getDateVente() {
		return dateVente;
	}

	public void setDateVente(MaDate dateVente) {
		this.dateVente = dateVente;
	}

	public String getCodeCl() {
		return codeCl;
	}

	public void setCodeCl(String codeCl) {
		this.codeCl = codeCl;
	}
	 public void Afficher(){
	    	super.Afficher();
	    	System.out.println("sa date de vente est "+dateVente +"et le code de client est "+codeCl);
	    }
	 public boolean GarantieValide(MaDate d) {
	       
	     
	        Calendar c1 = new GregorianCalendar(dateVente.getAnnee(), dateVente.getMois(), dateVente.getJour());
	        
	        Calendar c2 = new GregorianCalendar(d.getAnnee(), d.getMois(), d.getJour());
	        long x, y;
	        x = this.dureeGarantie * 24 * 60 * 60 * 1000;
	        y = c2.getTimeInMillis() - (c1.getTimeInMillis() + x);
	        if (y < 0) 
	            return true;
	        else 
	            
	           return false;


	        
	 }

}
