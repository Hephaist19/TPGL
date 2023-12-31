package fr.ufrsciencestech.models.fruits;

public interface Fruit {

    /**
     * @brief Renvoie si le fruit est sans graine
     * @return
     */
    public boolean isSeedless();

    
    /**
     * @brief Renvoie si le fruit est exotique
     * @return
     */
    public boolean isExotique();
    
    /**
     * @brief Renvoie si le fruit est un agrume
     * @return
     */
    public boolean isAgrume();
    
    /**
     * @brief Renvoie le prix unitaire du fruit
     * @return
     */
    public double getPrix();
    
    public void setPrix(double prix);

    /**
     * @brief Renvoie le pays d'origine du fruit
     * @return Un String contenant le pays
     */
    public String getOrigine();
    
    public void setOrigine(String s);

    public String getName();

    /**
     * @brief Test si deux fruit sont les mêmes
     * @param o a tester
     * @return True si les mêmes, false sinon
     */
    @Override
    public boolean equals(Object o);

    @Override
    public String toString();

    public Object clone() throws CloneNotSupportedException;

}
