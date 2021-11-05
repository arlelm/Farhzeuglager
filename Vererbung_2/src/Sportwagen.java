public class Sportwagen extends Fahrzeuge{
    String _maxSpeed;
    
    

    public Sportwagen(String marke, String typ, String ps, String preis){
        super(marke, typ, ps, preis);
        set_maxSpeed(_maxSpeed);
    }





    public void set_maxSpeed(String _maxSpeed) {
        this._maxSpeed = _maxSpeed;
    }

    public String get_maxSpeed() {
        return _maxSpeed;
    }
}
