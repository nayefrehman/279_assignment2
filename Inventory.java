import java.util.LinkedList; // 
import java.util.List;
import java.util.Iterator;

public class Inventory {

    private List inventory; // creates a list of instruments 

    // constructor to initialize the inventory list 
    public Inventory() {
        inventory = new LinkedList();
    }

    // this method adds an instrument to the inventory list 
    // figures out whether its a guitar or a mandolin and creates the appropiate object 
    public void addInstrument(String serialNo, double price, InstrumentSpec iSpec) {
        Instrument instrument;

        // if spec is guitar spec, create a guitar obj, else create a mandolin obj
        if (iSpec instanceof GuitarSpec) {
            instrument = new Guitar(serialNo, price, iSpec);
        } else {
            instrument = new Mandolin(serialNo, price, iSpec);
        }

        inventory.add(instrument); // adds the created obj to the inventory list 
    }

    // this method searches the inventory for guitars 
    public List search(GuitarSpec gSpec) {
        List guitarList = new LinkedList();
        Iterator it = inventory.iterator();

        while (it.hasNext()) { // iterates through the inventory list 
            Object obj = it.next();

            // checks if current obj is guitar, then checks for matching specs
            if (obj instanceof Guitar) { 
                Guitar g = (Guitar) obj;
                if (g.getSpec().matches(gSpec)) {
                    guitarList.add(g); // if specs match, add to the guitar list 
                }
            }
        }

        return guitarList;
    }

    // similar search method for mandolin 
    public List search(MandolinSpec mSpec) {
        List mandolinList = new LinkedList();
        Iterator it = inventory.iterator();

        while (it.hasNext()) { // iterates through the inventory 
            Object obj = it.next();

            // checks if current obj is mandolin, if yes, it checks for matching specs 
            if (obj instanceof Mandolin) {
                Mandolin m = (Mandolin) obj;
                if (m.getSpec().matches(mSpec)) {
                    mandolinList.add(m); // if the specs match, we add it to the mandolin list 
                }
            }
        }

        return mandolinList;
    }

    // method that iterates through the inventory and prints the specs of each instrument in the list 
    public void printInventory() {
        Iterator it = inventory.iterator();

        while (it.hasNext()) {
            Object obj = it.next();

            if (obj instanceof Guitar) {
                Guitar g = (Guitar) obj;
                GuitarSpec s = (GuitarSpec) g.getSpec();
                System.out.println(g.getSerialNumber() + " " + g.getPrice() + " " +
                        s.getModel() + " " + s.getBuilder().toString().toLowerCase() + " " +
                        s.getType() + " " + s.getTopWood() + " " + s.getBackWood());

            } else if (obj instanceof Mandolin) {
                Mandolin m = (Mandolin) obj;
                MandolinSpec s = (MandolinSpec) m.getSpec();
                System.out.println(m.getSerialNumber() + " " + m.getPrice() + " " +
                        s.getModel() + " " + s.getBuilder().toString().toLowerCase() + " " +
                        s.getType() + " " + s.getTopWood() + " " + s.getBackWood());
            }
        }
    }
}