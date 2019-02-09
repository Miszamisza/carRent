package domain;

public enum TypOfBody {
    COMBI("COMBI"),
    HATCHBACK("HATCHBACK"),
    SEDAN("SEDAN"),
    PICKUP("PICKUP");

    private final String value;

    TypOfBody(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
