package fr.ufrsciencestech.models.recettes;

import fr.ufrsciencestech.models.fruits.*;
import java.util.ArrayList;


public class CakeCitron implements Recette {

    private String name;
    private final ArrayList<Fruit> listeFruit = new ArrayList<>();
    
    private Citron ci1 = new Citron();
    private Citron ci2 = new Citron();
    private Citron ci3 = new Citron();
    
    @Override
    public String getName() {
        return "Cake au citron";
    }

    @Override
    public ArrayList<Fruit> getFruits() {
        if(listeFruit!=null)
        {listeFruit.clear();}

        listeFruit.add(ci1);
        listeFruit.add(ci2);
        listeFruit.add(ci3);
        return listeFruit;
    }
    
    @Override
    public double getPrix() {
        Citron c = new Citron();
        return 3*c.getPrix();
    }

    @Override
    public String getDescription() {
        StringBuilder sb = new StringBuilder("Ingrédients:").append("\n");

        for (Fruit fruit : getFruits()) {
            sb.append(fruit.getName()).append(" ");
        }

        return sb.toString();
    }
    
    @Override
    public String getEtapes() {
        StringBuilder sb = new StringBuilder("Étapes :").append("\n");

        sb.append("Préchauffer le four à 180°C puis beurrer et fariner votre moule. "
                + "Faites fondre 100g de beurre et laver vos jolis citrons. \n"
                + "Couper le citron en deux et presser-le pour en recueillir le jus. ");
        
         sb.append("\n");
        
         sb.append("Mélanger 200g farine, 150g de sucre et 1/2 sachet de levure. \n"
                 + "Ajouter les 4 œufs un à un, puis le beurre fondu et enfin le zeste râpé et le jus du citron. \n"
                 + "Verser dans le moule et enfourner le tout pendant environ 40min. À déguster chaudement !");
        
         sb.append("\n");
        
        return sb.toString();
    }
}
