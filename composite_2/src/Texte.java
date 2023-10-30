/*
Composant à réutiliser qui définit le comportement par défauts des autres classes
 */
public abstract class Texte {
    private String titre;
    private String preambule;

    public String getTitre() {
        return titre;
    }

    public String getPreambule() {
        return preambule;
    }

    public Texte(String titre, String preambule){
        this.preambule = preambule;
        this.titre = titre;
    }

    public Texte(){

    }
    public int longueur(){
        return titre.length()+ preambule.length();
    }
    public void ajout ( Texte texte){
        titre = texte.titre;
        preambule = texte.preambule;
    }
    public void retrait(int index){

    }
    public void get(){
         System.out.println("Titre : " + titre + " Preambule : "+ preambule);
    }

}
