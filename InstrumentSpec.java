/* Name: Naif Rehman
Student ID: 20475524
*/

public abstract class InstrumentSpec {

    // defining common variables for all instruments
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    // this constructor will be used to initialize the common variables for all instruments which is inherited by the guitar and mandolin spec classes
    public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    // Getters methods to access private variables of the class
    public Builder getBuilder() { 
        return builder; 
    }
    public String getModel() { 
        return model; 
    }
    public Type getType() { 
        return type; 
    }
    public Wood getBackWood() { 
        return backWood; 
    }
    public Wood getTopWood() { 
        return topWood; 
    }

    // Setters
    public void setBuilder(Builder builder) { 
        this.builder = builder; 
    }
    public void setModel(String model) { 
        this.model = model; 
    }
    public void setType(Type type) { 
        this.type = type; 
    }
    public void setBackWood(Wood backWood) { 
        this.backWood = backWood; 
    }
    public void setTopWood(Wood topWood) { 
        this.topWood = topWood; 
    }

    // matches method to compare the specs of the instruments
    public boolean matches(InstrumentSpec otherSpec) {
        if (builder != otherSpec.getBuilder()) { // return false if builder is different 
            return false;
        } 
        if (model != null && !model.isEmpty() && !model.equals(otherSpec.getModel())) {
            return false; // return false if model matches from the search and not empty and not null
        } 
        if (type != otherSpec.getType()) {
            return false; // return false if type is different
        }
        if (backWood != otherSpec.getBackWood()) {
            return false; // return false if back wood is different
        }
        if (topWood != otherSpec.getTopWood()) {
            return false; // return false if top wood is different
        }
        return true; // otherwise return true if all above conditions are false, meaning the specs match 
    }
}