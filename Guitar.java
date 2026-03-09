/* Name: Naif Rehman
Student ID: 20475524
*/

public class Guitar extends Instrument {

    // this class extends and is the child of the Instrument clas

    // guitar constructor that calls the constructor of the parent class, Instrument, using the super keyword
    public Guitar(String serialNumber, double price, InstrumentSpec iSpec) {
        super(serialNumber, price, iSpec);
    }
}