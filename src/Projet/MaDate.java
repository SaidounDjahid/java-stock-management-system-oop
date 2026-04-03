package Projet;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MaDate {
	protected int jour;
	protected int mois;
	protected int annee;
 
	public MaDate(int j,int m,int a){
		jour=j;
		mois=m;
		annee=a;
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public void AffichDate(){
		System.out.println(jour+"-"+mois+"-"+annee);
	}
	public boolean Bissextile(){
		if( annee %4==0){
			if(annee%100==0 && annee%400==0)
				return false;
			
				else 
					return true;
			
		}
		else return false;
	}
	public int nbJoursMois(){
		
		Calendar c=new GregorianCalendar(jour,mois,annee);
		return c.getMaximum(Calendar.DAY_OF_MONTH);
	}
	public int nbJoursDate(){
		Calendar c=new GregorianCalendar(jour,mois,annee);
		return c.getMaximum(Calendar.DAY_OF_YEAR);
		
	}
	

	public long nbJoursEntreDeuxDates(MaDate d) {
		Calendar c1 = new GregorianCalendar(this.annee,this.mois,this.jour);
		long t = c1.getTimeInMillis();
		
		Calendar c2 = new GregorianCalendar(d.annee,d.mois,d.jour);
		long j =  c2.getTimeInMillis()-t;
		
		return j/(24*60*60*1000);
	}



}
