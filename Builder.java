/* Name: Naif Rehman
Student ID: 20475524
*/

public enum Builder {
    FENDER, MARTIN, GIBSON, OLSON, PRS; // all builder types as enum

    @Override
    public String toString() {
        switch (this) { // switch statement to return a string rep of the enum values
            case FENDER: return "Fender"; 
            case MARTIN: return "Martin";
            case GIBSON: return "Gibson";
            case OLSON:  return "Olson";
            case PRS:    return "PRS";
            default:     return "";
        }
    }
}