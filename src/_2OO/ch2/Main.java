package _2OO.ch2;

public class Main {
    public static void main(String[] args){
        //Premii

        Premiu p1=new Premiu("Oscar",1990);
        Premiu p2=new Premiu("Oscar",2000);
        Premiu p3=new Premiu("Oscar",1980);
        Premiu p4=new Premiu("Oscar",2010);


        //Actorii

        Premiu[] premii=new Premiu[2];
        premii[0]=p1;
        premii[1]=p2;
        Actor a1=new Actor("actor cu doua oscaruri",35,premii);
        Actor a2=new Actor("actor cu un  oscar",23,new Premiu[]{p3});
        Actor a3=new Actor("actor cu trei oscaruri",20,new Premiu[]{p2,p3,p4});
        Actor a4=new Actor("actor fara oscar",20,new Premiu[]{});

        //Filme

        Film f1=new Film(2000,"Film1",new Actor[]{a1,a2});
        Film f2=new Film(2004,"Film2",new Actor[]{a3,a4});
        Film f3=new Film(2006,"Film3",new Actor[]{a2,a3,a4});


        //Studio
        Studio studio1=new Studio("METRO GOLDEN MAYER ",new Film[]{f1});
        Studio studio2=new Studio("WARNER BROSS ",new Film[]{f1,f2});


        Studio[] studioDataBase=new Studio[]{studio1,studio2};
        for (int i=0;i<studioDataBase.length;i++){
            if (studioDataBase[i].getNrFilme()>1){
                System.out.println(studioDataBase[i].getName());
            }

        }

        for(int i=0;i<studioDataBase.length;i++){
            Film f=studioDataBase[i].getFilmByActor("actor cu doua oscaruri");
            if (f!=null){

                System.out.println(studioDataBase[i]+"contains actor");
            }
        }
    }
}
