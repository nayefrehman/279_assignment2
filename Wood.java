/* Name: Naif Rehman
Student ID: 20475524
*/

public enum Wood {
    MAHOGONY, MAPLE, CANADIAN_MAPLE, BRAZILIAN_ROSEWOOD, ALDER, SITKA, CEDER;

    @Override
    public String toString() {
        switch (this) {
            case MAHOGONY:           return "mahogony";
            case MAPLE:              return "maple";
            case CANADIAN_MAPLE:     return "canadian maple";
            case BRAZILIAN_ROSEWOOD: return "brazilian rosewood";
            case ALDER:              return "alder";
            case SITKA:              return "sitka";
            case CEDER:              return "ceder";
            default:                 return "";
        }
    }
}
