package domain;

public enum CatStatus {

    RENT("RENTED"), AVAILABLE("AVAILABLE"), BROKEN("BROKEN");

    private final String status;


    CatStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
