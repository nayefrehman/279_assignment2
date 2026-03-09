/* Name: Naif Rehman
Student ID: 20475524
*/

public class MandolinSpec extends InstrumentSpec {

    // this class is child class of InstrumentSpec
    // inheriting all properties and methods of InstrumentSpec class 

    private Style style; // additional style variable for mandolin

    // consturctor for mandolin class
    public MandolinSpec(Builder builder, String model, Style style, Type type, Wood backWood, Wood topWood) {
        super(builder, model, type, backWood, topWood); // calls parent constructor to initialize properties in InstrumentSpec
        this.style = style; // initializes the style variable
    }
 

    // getter method for style var
    public Style getStyle() { 
        return style; 
    }

    @Override 
    public boolean matches(InstrumentSpec otherSpec) {
        if (!super.matches(otherSpec)) {
            return false; // return false if common properties in parent class do not match
        }
        MandolinSpec other = (MandolinSpec) otherSpec;
        if (style != other.getStyle()) {
            return false; // return false if style does not match
        }
        return true;
    }
}