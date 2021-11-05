public class Fahrzeuge {
    String _marke;
    String _typ;
    String _ps;
    String _preis;


    public Fahrzeuge(String marke, String typ, String ps, String preis){
        set_marke(marke);
        set_typ(typ);
        set_ps(ps);
        set_preis(preis);
    }

    public void showFahrzeugInfo(String extraData){
        System.out.println(this.get_marke() + " " + this.get_typ() + " " + this.get_ps() + " "+ this.get_preis() + " " + extraData);
    }

    //Arbeitet die Autovermietung so um (oder erstellt es als neues Projekt), dass ihr LKW (max. Zuladung Tonnen) , Kombi (Siebensitze Ja oder nein), Sportwagen (max. Geschwindigkeit) und Geländewagen (maximaler Kippradius) mit den identischen Eigenschaften PS, Typ, Marke, Preis erstellt (die individuellen stehen hinter den Klammern). Setzt nur die Vererbungsstruktur auf und überlegt euch einen sinnvollen Klassennamen für eine Oberklasse!

    public void set_marke(String _marke) {
        this._marke = _marke;
    }
    public void set_typ(String _typ) {
        this._typ = _typ;
    }
    public void set_ps(String _ps) {
        this._ps = _ps;
    }
    public void set_preis(String _preis) {
        this._preis = _preis;
    }


    public String get_marke() {
        return _marke;
    }
    public String get_typ() {
        return _typ;
    }
    public String get_ps() {
        return _ps;
    }
    public String get_preis() {
        return _preis;
    }
}
