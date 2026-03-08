public class GuitarSpec extends InstrumentSpec {
 // GuitarSpec class extends and is the child class of InstrumentSpec
    private int numStrings; // number of strings in the guitar, variable on top of variables in InstrumentSpec

    // method calls super to initialize vars in parent class then initializes numStrings
    public GuitarSpec(Builder builder, String model, int numStrings, Type type, Wood backWood, Wood topWood) {
        super(builder, model, type, backWood, topWood);
        this.numStrings = numStrings;
    }
 
    // getter for numStrings
    public int getNumStrings() { 
        return numStrings; 
    }

    // method checks to see if current guitarSpec matches the otherSpec
    @Override
    public boolean matches(InstrumentSpec otherSpec) {
        if (!super.matches(otherSpec)) {
            return false; // if parent class variables dont match, return F
        } 
        GuitarSpec other = (GuitarSpec) otherSpec;
        if (numStrings != other.getNumStrings()) {
            return false; // return false if numStrings dont match
        }
        return true; // otherwise return true if parent class variables and numStrings match
    }
}