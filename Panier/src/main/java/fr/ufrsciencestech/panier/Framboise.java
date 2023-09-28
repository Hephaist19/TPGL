package fr.ufrsciencestech.panier;

/**
 *
 * @author roudet
 */
public class Framboise {
    private double prix;
    private String origine;
	
    public Framboise() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Framboise(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Framboise de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Framboise fr = (Framboise) o;
            return (prix == fr.prix && origine.equals(fr.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
	System.out.println("premier test Framboise");

    double pr = 1;
    String str = "bidule";

    //instance orange
    Framboise fr = new Framboise();
    Framboise fr2 = new Framboise(pr, str);

    //affiche le prix des oranges
    
    System.out.println("Prix framboise 1 : "+ fr.getPrix());
    System.out.println("Prix framboise: "+ fr2.getPrix());

    //modification des prix des oranges
    fr.setPrix(1.5);
    fr2.setPrix(2);

    System.out.println("Origine Framboise 1 : " + fr.getOrigine());
    System.out.println("Origine Framboise 2 : " + fr2.getOrigine());

    //modification origine
    fr.setOrigine("Andalouse");
    fr2.setOrigine("Amazonie");

    //affichage après modification
    System.out.println("Framboise créé : " + fr.toString());
    
    System.out.println("Framboise 2 créé : " + fr2.toString());
    
    System.out.println(fr.equals(fr2));
    System.out.println(fr.isSeedless());
   }
}
