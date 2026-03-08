public class Mandolin extends Instrument {
    // child class of instrument

    // mandolin constructor that calls its parent to initialize the properties of the instrument using super
    public Mandolin(String serialNumber, double price, InstrumentSpec iSpec) {
        super(serialNumber, price, iSpec);
    }
}