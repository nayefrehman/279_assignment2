/* Name: Naif Rehman
Student ID: 20475524
*/

import java.util.List;
import java.util.Iterator;

public class Main {

	// method below is used to print the list of matching mandolins 
    public void printMatchingMandolin(List instrumentList) {
        System.out.println("Matching Mandolins:");
        Iterator it = instrumentList.iterator();

        while (it.hasNext()) {
            Mandolin m = (Mandolin) it.next();
            MandolinSpec s = (MandolinSpec) m.getSpec();
            System.out.println(m.getSerialNumber() + " " + m.getPrice() + " " +
                    s.getModel() + " " + s.getBuilder().toString().toLowerCase() + " " +
                    s.getType() + " " + s.getTopWood() + " " + s.getBackWood());
        }

        System.out.println("End");
    }

	// method prints for matching guitars 
    public void printMatchingGuitar(List instrumentList) {
        System.out.println("Matching Guitars:");
        Iterator it = instrumentList.iterator();

        while (it.hasNext()) {
            Guitar g = (Guitar) it.next();
            GuitarSpec s = (GuitarSpec) g.getSpec();
            System.out.println(g.getSerialNumber() + " " + g.getPrice() + " " +
                    s.getModel() + " " + s.getBuilder().toString().toLowerCase() + " " +
                    s.getType() + " " + s.getTopWood() + " " + s.getBackWood());
        }

        System.out.println("End");
    }

    public static void main(String[] args) {
        Inventory invObj = new Inventory();

        GuitarSpec guitarSpec = new GuitarSpec(Builder.FENDER, "AXp", 6, Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        invObj.addInstrument("X7X 0Y8", 208.99, guitarSpec);

        guitarSpec = new GuitarSpec(Builder.FENDER, "AP88", 12, Type.ELECTRIC, Wood.MAHOGONY, Wood.CANADIAN_MAPLE);
        invObj.addInstrument("X1X 0Y0", 679.99, guitarSpec);

        MandolinSpec mandSpec = new MandolinSpec(Builder.MARTIN, "D-28", Style.A, Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.SITKA);
        invObj.addInstrument("X2P 0Z2", 388.5, mandSpec);

        mandSpec = new MandolinSpec(Builder.GIBSON, "Les Paul Standard", Style.B, Type.ELECTRIC, Wood.MAHOGONY, Wood.CANADIAN_MAPLE);
        invObj.addInstrument("K7C 0Y8", 607.90, mandSpec);

        invObj.printInventory();

        Main main = new Main();
        MandolinSpec searchedMandolin = new MandolinSpec(Builder.GIBSON, "Les Paul Standard", Style.B, Type.ELECTRIC, Wood.MAHOGONY, Wood.CANADIAN_MAPLE);
        main.printMatchingMandolin(invObj.search(searchedMandolin));

        GuitarSpec searchedGuitar = new GuitarSpec(Builder.FENDER, "AXp", 6, Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        main.printMatchingGuitar(invObj.search(searchedGuitar));
    }
}