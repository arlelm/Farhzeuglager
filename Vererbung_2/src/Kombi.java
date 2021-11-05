public class Kombi extends Fahrzeuge{
    String _siebensitzer;

    public Kombi(String marke, String typ, String ps, String preis){
        super(marke, typ, ps, preis);
        set_siebensitzer(_siebensitzer);

    }


    public void set_siebensitzer(String _siebensitzer) {
        this._siebensitzer = _siebensitzer;
    }

    public String get_siebensitzer() {
        return _siebensitzer;
    }





}
