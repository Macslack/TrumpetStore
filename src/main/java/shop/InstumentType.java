package shop;

public enum InstumentType {
    WOOD("woodwind"),
    BRASS("Brass"),
    STRINGS("Strings"),
    PERCUUSSION("perscussion"),
    KEYBOARD("keyboard");

    private String family;

    InstumentType(String family) {
        this.family = family;
    }

    public String getFamily() {
        return family;
    }
}
