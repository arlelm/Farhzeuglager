public class Gelaendewagen extends Fahrzeuge{
    String _maxKippradius;



    public Gelaendewagen(String marke, String typ, String ps, String preis){
        super(marke, typ, ps, preis);
        set_maxKippradius(_maxKippradius);
    }


    public void set_maxKippradius(String _maxKippradius) {
        this._maxKippradius = _maxKippradius;
    }

    public String get_maxKippradius() {
        return _maxKippradius;
    }





}
