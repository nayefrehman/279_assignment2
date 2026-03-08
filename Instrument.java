public abstract class Instrument {
    
    // abstract class representing a instrument with common properties and methods used by  guitar and mandolin classes

    // defining the common properties of an instrument
    private String serialNumber; 
    private double price;
    private InstrumentSpec iSpec;
 
    // method initializes the properties of the instrment when created
    public Instrument(String serialNumber, double price, InstrumentSpec iSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.iSpec = iSpec;
    }

    // methods to access the properties (getters)
    public String getSerialNumber() { 
        return serialNumber; 
    }
    public double getPrice() { 
        return price; 
    }
    public InstrumentSpec getSpec() { 
        return iSpec; 
    }

    // methods to modify the properties (setters)
    public void setSerialNumber(String serialNumber) { 
        this.serialNumber = serialNumber; 
    }
    public void setPrice(double price) { 
        this.price = price; 
    }
    public void setSpec(InstrumentSpec iSpec) { 
        this.iSpec = iSpec;
     }
}