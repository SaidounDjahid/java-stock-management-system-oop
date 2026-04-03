package Projet;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
		
		
		
		Produit[] t=new  Produit[30];
		int i;
		for(i=0;i<3;i++)
		{
			System.out.println("donner le nom du produit");
			String nomProd = sc.next();
			System.out.println("donner le code du produit");
			String codeProd = sc.next();
			System.out.println("donner la durée de garantie du produit");
			int dureeGarantie = sc.nextInt();
			if(i<18)
		{  
	
			System.out.println("donner l'emplacement du  produit");
			String Emplacement = sc.next();
			t[i]=new ProduitDispo(nomProd,codeProd,dureeGarantie,Emplacement);
			}
			else{
				MaDate date = null;
				System.out.println("donner la date du vente du produit");
				
				System.out.println("donner le jour");
				int jour = sc.nextInt();
				System.out.println("donner Le mois");
				int mois = sc.nextInt();
				System.out.println("donner l'année");
				int annee = sc.nextInt();
				 date=new MaDate(jour,mois,annee);
		
				
			
				System.out.println("donner le code du client");
				String codeCl = sc.next();
				
				
				
			t[i]=new ProduitVendu(nomProd,codeProd,dureeGarantie,date,codeCl);
		
			}

		}
		
		Stock s=new Stock(30,18,12);
		
		int choix = 1;
		
		
		System.out.println("entrer un numero pour choisir l'orepation");
		 choix = sc.nextInt();
	
		switch(choix){
		
		case 1:
			System.out.println("affichage de les informations du stock");
		    s.Affich();
		break;
		
		case 2:
		{MaDate dat=new MaDate(10,04,2014);
		System.out.println("affiche des produit vendus apres la date " + dat.getJour() +"-"+ dat.getMois()+"-"+dat.getAnnee() );
		
		for(i=0;i<30;i++){
			if (i>=18)
			{
				MaDate x = ((ProduitVendu)t[i]).getDateVente();
				
				long l= x.nbJoursEntreDeuxDates(dat);
				if(l<0)
					System.out.println("le produit " +i+ " est " + t[i].getNomProd());
				
			}
		}    }
		break;
		case 3 :
		{
		System.out.println("affichage des produit vendus qui sont couverts par la garantie");
		
			for(i=0;i<30;i++){
				if (i>=18)
				{MaDate d = null;
				System.out.println("donner la date actuelle");
				
				System.out.println("donner le jour");
				int jour = sc.nextInt();
				System.out.println("donner Le mois");
				int mois = sc.nextInt();
				System.out.println("donner l'année");
				int annee = sc.nextInt();
				 d=new MaDate(jour,mois,annee);
					if(((ProduitVendu)t[i]).GarantieValide(d)==true)
               
       			System.out.println("le produit " +i+ " est " +t[i].getNomProd());
               else
            	   System.out.println("aucun produit vendu est couvert par la garantie");
				}
				}
		}
				break;
				case 4 :
				{
				for(i=0;i<30;i++){
					if (i>=18){
					
					System.out.println("donner le code du client");
					String c = sc.next();
					
					System.out.println("affichage des produits vendus par le client "+c);
					
					if (((ProduitVendu) t[i]).codeCl.equals(c))
					  System.out.println("le produit "+i+" est "+t[i].getNomProd());
					else
						System.out.println("ce client n'a rien acheté");
						
					
					}
				}
				}
				break;
				
				case 5 :
				{
		double	p=s.PourcentageVente();
		System.out.println(p); 
				}
		break;
				  default : System.out.print("erreur");
		}
           sc.close();
           

	}

}
