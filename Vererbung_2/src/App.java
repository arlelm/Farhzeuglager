import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
     
        ArrayList<Kombi> kombis = new ArrayList<Kombi>();
        ArrayList<Gelaendewagen> gelaendewagens = new ArrayList<Gelaendewagen>();
        ArrayList<Sportwagen> sportwagens = new ArrayList<Sportwagen>();
        ArrayList<LKW> lkws = new ArrayList<LKW>();


        Kombi k1 = new Kombi("Volvo", "V90", "400", "53.000");
        k1.showFahrzeugInfo(k1.get_siebensitzer());
        
        Gelaendewagen g1 = new Gelaendewagen("Ford", "Ranger", "270", "33.000");
        g1.showFahrzeugInfo(g1.get_maxKippradius());
        
        Sportwagen s1 = new Sportwagen("Ferrari", "Laferrari", "800", "1.750.000");
        s1.showFahrzeugInfo(s1.get_maxSpeed());

        LKW l1 = new LKW("MAN", "TGX", "330", "50.000");
        l1.showFahrzeugInfo(l1.get_maxLadung());

        kombis.add(k1);
        gelaendewagens.add(g1);
        sportwagens.add(s1);
        lkws.add(l1);
        
        for(Kombi k : kombis){
            k.showFahrzeugInfo(k.get_siebensitzer());
        }
        for(Gelaendewagen g : gelaendewagens){
            g.showFahrzeugInfo(g.get_maxKippradius());
        }
        for(Sportwagen s : sportwagens){
            s.showFahrzeugInfo(s.get_maxSpeed());
        }
        for(LKW l : lkws){
            l.showFahrzeugInfo(l.get_maxLadung());
        }



    }
}
