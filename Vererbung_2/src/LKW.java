public class LKW extends Fahrzeuge{
    String _maxLadung;


    public LKW(String marke, String typ, String ps, String preis){
        super(marke, typ, ps, preis);
        set_maxLadung(_maxLadung);
    }




    public void set_maxLadung(String _maxLadung) {
        this._maxLadung = _maxLadung;
    }

    public String get_maxLadung() {
        return _maxLadung;
    }
}
