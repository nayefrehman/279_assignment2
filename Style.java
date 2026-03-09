/* Name: Naif Rehman
Student ID: 20475524
*/

public enum Style {
    A, B;

    @Override // override toString() method to print enum values nicely
    public String toString() {
        switch(this){ // this switch statement used to return a str representation of enum values
            case A: return "Type A"; 
            case B: return "Type B";
            default: return "Unknown Type";
        }
    }
}
