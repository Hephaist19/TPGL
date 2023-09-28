package fr.ufrsciencestech.models.fruits;

public class Orange implements Fruit{
    private double prix;
    private String origine;
	
    public Orange() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Orange(double prix, String origine) 
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
        return "Orange de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Orange or = (Orange) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
	System.out.println("premier test Orange");

    double pr = 1;
    String str = "bidule";

    //instance orange
    Orange or = new Orange();
    Orange or2 = new Orange(pr, str);

    //affiche le prix des oranges
    
    System.out.println("Prix orange 1 : "+ or.getPrix());
    System.out.println("Prix orange 2 : "+ or2.getPrix());

    //modification des prix des oranges
    or.setPrix(1.5);
    or2.setPrix(2);

    System.out.println("Origine orange 1 : " + or.getOrigine());
    System.out.println("Origine orange 2 : " + or2.getOrigine());

    //modification origine
    or.setOrigine("Andalouse");
    or2.setOrigine("Amazonie");

    //affichage après modification
    System.out.println("Orange créé : " + or.toString());
    
    System.out.println("Orange 2 créé : " + or2.toString());
    
    System.out.println(or.equals(or2));
    System.out.println(or.isSeedless());

   }
}
