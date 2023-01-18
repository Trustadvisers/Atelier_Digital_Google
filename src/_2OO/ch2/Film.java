package _2OO.ch2;

public class Film {
    private int anAparitie;
    private String nume;
    private Actor[] actori;


    public Film(int anAparitie,String nume,Actor[] actori){
        this.anAparitie=anAparitie;
        this.nume=nume;
        this.actori=actori;

    }

    public Actor getActorByName(String name){
        for (int i=0;i<actori.length;i++){

            if (actori[i].getNume().equals(name)){
                return actori[i];
            }

        }
        return null;

    }
}
